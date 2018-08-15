require "set"

@visited = Array.new
@count = 0
@getAllList = {}

class Node
  attr_accessor :weight, :adjacents
  def initialize(wt)
    @weight = wt
    @adjacents = Set.new
  end
end

class Graph
  attr_accessor :nodes
  def initialize
    @nodes = []
  end

  def addEdge(strtIndex, endIndex)
    @nodes[strtIndex - 1].adjacents << endIndex - 1
    @nodes[endIndex - 1].adjacents << strtIndex - 1
  end
end

def connectedComponents(graph)
  count = 0
  @visited = []
  @connected_components = {}
  graph.nodes.each_with_index do | node, index |
    if !@visited.include?(index)
      dfs(graph, node, index, count)
      count += 1
    end
  end
  @connected_components
end

def dfs(graph, node, index, count)
  @visited << index
  @connected_components[count] ||= []
  @connected_components[count] << index
  node.adjacents.each do |adj_node|
    dfs(graph, graph.nodes[adj_node], adj_node, count) unless @visited.include?(adj_node)
  end
end

def remove(graph, len, k)
  temp = Array.new
  removeKEdges(graph, temp, 0, len - 1, 0, k)
end

def getConnComponentsSum(conn_comp, graph)
  weight = 0
  conn_comp.each do |key, val|
    orVal = 0
    val.each do |value|
      orVal |= graph.nodes[value].weight
    end
    weight += orVal
  end
  weight
end

def cloneGr(src)
  dest = Graph.new
  i = 0
  src.nodes.each do |node|
    temp = Node.new(node.weight)
    temp.adjacents = Set.new
    dummy = Set.new
    dummy = node.adjacents
    node.adjacents = dummy
    # node.adjacents.each do |adj|
    #   temp.adjacents << adj
    # end
    dest.nodes[i] = temp
    i += 1
  end
  dest
end

def removeKEdges(graph, array, s, e, ind, k)
  if ind == k
    tempGraph = cloneGr(graph)
    localVal = Array.new
    array.each do | ar|
      localVal << ar
    end
    dummy = removeGraphEdges(array, tempGraph)
    connected_components = connectedComponents(dummy)
    wt = getConnComponentsSum(connected_components, dummy)

    @getAllList[@count] = {
      wt: wt,
      array: localVal
    }
    @count += 1
  else
    i = s
    while i <= e && (e - i + 1 >= k - ind)
      array[ind] = i
      removeKEdges(graph, array, i + 1, e, ind + 1, k)
      i += 1
    end
  end
end

def removeGraphEdges(array, dummy)
  tempGraph = dummy
  array.each do |val|
    i = @adjMatrix[val][0]
    j = @adjMatrix[val][1]
    tempGraph.nodes[i - 1].adjacents.delete(j - 1)
    tempGraph.nodes[j - 1].adjacents.delete(i - 1)
  end
  tempGraph
end

input = gets.chomp
inputValues = input.split

@N = inputValues[0].to_i
@M = inputValues[1].to_i
@K = inputValues[2].to_i

graph = Graph.new()

i = 0
input = gets.chomp
inputValues = input.split
while i < @N do
  graph.nodes[i] = Node.new(inputValues[i].to_i)
  i += 1
end

i = 0
@adjMatrix = Array.new(@M) { Array.new(2) }
while (i < @M) do
  input = gets.chomp
  inputValues = input.split
  n1 = inputValues[0].to_i
  n2 = inputValues[1].to_i

  graph.addEdge(n1, n2)

  @adjMatrix[i][0] = n1
  @adjMatrix[i][1] = n2

  i += 1
end
@globalGraph = graph
remove(graph, @M, @K)

@count -= 1
wt = 0
output = []
@getAllList.each do |key, val|
  if val[:wt] >= wt
    wt = val[:wt]
    output = val[:array]
  end
end

outStr = ""
output.each_with_index do |val, ind|
  outStr = ind == 0 ? "#{val+1}" : outStr + " #{val+1}"
end
print outStr
print "\n"