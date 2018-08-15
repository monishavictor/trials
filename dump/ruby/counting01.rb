# Complete the function below.

def counting(s)
    count = 0
    for i in 0..s.length-1

        for j in i+1..s.length-1
            length = s.length-j+1
            if (length)%2 == 0
                subStr = s[i, length]
                sortedStr = subStr.chars.sort.join 
                flag = (subStr[0] == "0") ? sortedStr == subStr : sortedStr.reverse == subStr
                if (flag)
                    frequencyHash = Hash.new(0)
                    subStr.split('').each{|ch| frequencyHash[ch] += 1}
                    if frequencyHash["0"] == frequencyHash["1"]
                        count += 1
                    end
                end
            end
        end
    end
    count
end
