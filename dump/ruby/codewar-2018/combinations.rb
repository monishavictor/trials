def removeK(len, k)
  temp = Array.new
  removeKEdges(temp, 0, len - 1, 0, k)
end

def removeKEdges(array, s, e, ind, k)
  if ind == k
    print array
    print "\n"
  else
    i = s
    while i <= e && (e - i + 1 >= k - ind)
      array[ind] = @array[i]
      removeKEdges(array, i + 1, e, ind + 1, k)
      i += 1
    end
  end
end

@array = [1, 2, 3, 4, 5]
k = 3

removeK(@array.length, k)