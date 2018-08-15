#include<iostream>
#include <list>
using namespace std;

int minCost = 0, minTime;
int **dist;
int **cost;
int K;
int *minPath;

class Graph
{
  int V;
  list<int> *adj;
  void printAllPathsUtil(int , int , bool [], int [], int &);

public:
  Graph(int V);
  void addEdge(int u, int v);
  void printAllPaths(int s, int d);
};

Graph::Graph(int V)
{
  this->V = V;
  adj = new list<int>[V];
}

void Graph::addEdge(int u, int v)
{
  adj[u].push_back(v);
}

void Graph::printAllPaths(int s, int d)
{
  bool *visited = new bool[V];

  int *path = new int[V];
  int path_index = 0;

  for (int i = 0; i < V; i++)
    visited[i] = false;

  printAllPathsUtil(s, d, visited, path, path_index);
}

void Graph::printAllPathsUtil(int u, int d, bool visited[],
              int path[], int &path_index)
{
  visited[u] = true;
  path[path_index] = u;
  path_index++;

  if (u == d)
  {
    int curCost = 0;
    int curDist = 0;
    for (int i = 1; i< path_index; i++) {
      curDist = dist[path[i-1]][path[i]];
      curCost += cost[path[i-1]][path[i]] + (curDist*K);
    }
    curCost += (path_index-2) * K;
    if ((minCost > curCost) || (minCost == 0)){
      minCost = curCost;
      minTime = curDist + path_index - 1;
      minPath = (int*)malloc(sizeof(int)*path_index);
      for (int i = 0; i < path_index; i++) {
        minPath[i] = path[i];
      }
    }
  }
  else
  {
    list<int>::iterator i;
    for (i = adj[u].begin(); i != adj[u].end(); ++i)
      if (!visited[*i])
        printAllPathsUtil(*i, d, visited, path, path_index);
  }

  path_index--;
  visited[u] = false;
}

int main()
{

    int N, X;
    int i = 0;
    cin >> K;
    cin >> N;
    cin >> X;
    dist = (int**)malloc(sizeof(int*)*N);
    cost = (int**)malloc(sizeof(int*)*N);
    
    for (i = 0; i < N; i++) {
        dist[i] = (int*)malloc(sizeof(int)*N);
        cost[i] = (int*)malloc(sizeof(int)*N);
    }

    Graph g(N);
    int s, d, t, c;
    while (X > 0) {
        cin >> s;
        cin >> d;
        cin >> t;
        cin >> c;
        g.addEdge(s - 1 , d - 1);
        dist[s-1][d-1] = t;
        cost[s-1][d-1] = c;
        dist[d-1][s-1] = t;
        cost[d-1][s-1] = c;
        X--;
    }
    cin >> s;
    cin >> d;

     g.printAllPaths(s - 1, d - 1);
     for (i = 0; i < sizeof(minPath)/sizeof(int); i++) {
      cout << minPath[i] + 1 << "->";
     }
     cout << d << " " << minTime << " " << minCost <<endl;
    return 0;
}
