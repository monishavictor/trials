T = (gets.chomp).to_i

while T > 0 
    input = gets.chomp
    arr = input.split(' ')
    N = arr[0].to_i
    M = arr[1].to_i
    K = arr[2].to_i

    input = gets.chomp
    capacity = input.split(' ')
    input = gets.chomp
    ballSize = input.split(' ')

    capacity = capacity.map(&:to_i)
    ballSize = ballSize.map(&:to_i)

    capacity = capacity.sort.reverse
    ballSize = ballSize.sort.reverse

    visited = Array.new(N)
    capacityIndex = N-1
    count = 0
    ballSize.each do |ball|
        capacityIndex = N-1
        while(ball < capacity[capacityIndex]) && (capacityIndex >= 0) do
            capacityIndex -= 1
        end
        cap = capacity[capacityIndex]
        while(cap <= ball && ball <= cap + K && capacityIndex >= 0) do
            if(visited[capacityIndex] != 1)
                count+=1
                visited[capacityIndex] = 1
                break
            end
            capacityIndex -= 1
            cap = capacity[capacityIndex]
        end
    end
    puts count

    T -= 1
end