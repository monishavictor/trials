def LES(str)
  len = str.length
  i = len - 1

  frequencyArray = Array.new(26, 0)

  num = ""
  freq = ""

  while i >= 0 do

    if str[i] == ')'
      i = i - 1
      while str[i] != '(' do
        freq = str[i] + freq
        i = i - 1
      end

    elsif str[i] == '#'
      num =  str[i-2..i-1]
      i = i - 2
      ind = num.to_i - 1

      count = freq.length != 0 ? freq.to_i : 1
      frequencyArray[ind] = frequencyArray[ind] + count
      freq = ""

    else
      ind = str[i].to_i - 1

      count = freq.length != 0 ? freq.to_i : 1
      frequencyArray[ind] = frequencyArray[ind] + count
      freq = ""
    end    
  
    i = i - 1    
  end

  i = 0

  while i < 25 do
    print "#{frequencyArray[i]} "
    i = i + 1
  end
  print frequencyArray[i]
  puts

end


LES("223#(2)24#25#26#23#(3)")
LES("2110#(2)")

