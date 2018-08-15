def test(path, k)
  sum = path[0]
  partArray = path[1,path.length];
  while(partArray.length > 0)
    temp = partArray
    # if (partArray.length > k)
      partArray = partArray[0,k]
    # end
    partArray = partArray.sort
    sum += partArray.last
    ind = temp.index(partArray.last)
    partArray = temp.drop(ind+1)
  end
  sum
end

puts test([100, -70,-90,-80,10,100], 2)
puts test([10,-20,-5], 2)
puts test([3,-4,-3,-5,0], 2)