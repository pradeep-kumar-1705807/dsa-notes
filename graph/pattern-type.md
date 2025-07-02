# Graph Pattern

Graph problems involve nodes and edges, and can require traversal, pathfinding, or connectivity checks.

## Problem Patterns in Graphs

- **Graph Traversal**
  - **Breadth-First Search (BFS):**
    - Number of Islands
    - Word Ladder
    - Course Schedule
  - **Depth-First Search (DFS):**
    - Connected Components
    - Path Sum in Graph
    - Clone Graph

- **Topological Sort**
  - Ordering of nodes in a Directed Acyclic Graph (DAG).
  - Example Problems:
    - Course Schedule II
    - Alien Dictionary

- **Cycle Detection**
  - Detect cycles in directed or undirected graphs.
  - Example Problems:
    - Course Schedule
    - Detect Cycle in Undirected Graph

- **Shortest Path Algorithms**
  - **Dijkstra’s Algorithm** (non-negative weights)
    - Network Delay Time
    - Path With Minimum Effort
  - **Bellman-Ford Algorithm** (handles negative weights)
    - Cheapest Flights Within K Stops
  - **Floyd-Warshall Algorithm** (all pairs shortest path)
    - Find the City With the Smallest Number of Neighbors

- **Minimum Spanning Tree (MST)**
  - **Kruskal’s Algorithm**
  - **Prim’s Algorithm**
  - Example Problems:
    - Minimum Cost to Connect All Points

- **Union-Find (Disjoint Set)**
  - Connected components, cycle detection, Kruskal’s MST.
  - Example Problems:
    - Number of Connected Components
    - Redundant Connection

- **Bipartite Graph Check**
  - Check if a graph can be colored with two colors.
  - Example Problems:
    - Is Graph Bipartite?

- **Strongly Connected Components (SCC)**
  - Kosaraju’s or Tarjan’s algorithm.
  - Example Problems:
    - Critical Connections in a Network

- **Advanced Patterns**
  - **Eulerian Path/Circuit**
  - **Hamiltonian Path/Circuit**
  - **Bridges and Articulation Points**
  - **Network Flow (Max Flow/Min Cut)**
  - **2-SAT and SCC**

## General Approach
1. Represent the graph using adjacency list or matrix.
2. Use BFS or DFS to traverse or search the graph.
3. Apply specific algorithms (Dijkstra, Union-Find, etc.) as required by the problem.
4. Track visited nodes to avoid cycles or repeated work.
