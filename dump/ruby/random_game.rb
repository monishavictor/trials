r = gets.chomp().to_i

while r > 0
  num = gets.chomp().to_i
  bin = num.to_s(2)
  len = bin.length

  if bin[0] == bin[1]
    bin[1] = bin[1] == '0' ? '1' : '0'
  end
  bin[0] = bin[0] == '0' ? '1' : '0'

  i = 1

  while i < len - 1
    if bin[i] == bin[i-1]
      bin[i-1] = bin[i-1] == '0' ? '1' : '0'
    end

    if bin[i] == bin[i+1]
      bin[i+1] = bin[i+1] == '0' ? '1' : '0'
    end

    bin[i] = bin[i] == '0' ? '1' : '0'
    i += 1
  end

  if bin[i] == bin[i-1]
    bin[i-1] = bin[i-1] == '0' ? '1' : '0'
  end
  bin[i] = bin[i] == '0' ? '1' : '0'
  
  newVal = bin.to_i(2)
  lastPlayer = len % 2 == 0 ? 'Y' : 'X'

  if newVal == num || newVal - 1 == num || newVal + 1 == num
    puts lastPlayer
  else
    puts lastPlayer == 'X' ? 'Y' : 'X'
  end

  r -= 1
end