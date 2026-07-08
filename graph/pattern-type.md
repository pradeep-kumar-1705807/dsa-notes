
# 📊 Graph DSA Complete Learning Plan + Interview Prep

---

## Phase 1: Fundamentals (Week 1)

### 1.1 Graph Representations
| Representation | Time Complexity | Space | When to Use |
|---------------|----------------|-------|-------------|
| **Adjacency Matrix** | O(1) edge lookup | O(V²) | Dense graphs, small V |
| **Adjacency List** | O(V) edge lookup | O(V+E) | Sparse graphs, most common |
| **Edge List** | O(E) edge lookup | O(E) | Kruskal's, simple traversals |

**Practice:**
- Implement all 3 representations
- Convert between representations
- [LeetCode 997 - Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/) (Easy)

### 1.2 Graph Traversals

#### DFS (Depth First Search)
```
Time: O(V + E)    Space: O(V) for recursion stack
```
- Recursive & Iterative implementations
- Applications: Path finding, cycle detection, topological sort

#### BFS (Breadth First Search)
```
Time: O(V + E)    Space: O(V) for queue
```
- Level-order traversal
- Applications: Shortest path (unweighted), level-order problems

**Practice Questions:**
- [Done] [200. Number of Islands](https://leetcode.com/problems/number-of-islands/) — Medium — DFS/BFS on grid
- [ ] [133. Clone Graph](https://leetcode.com/problems/clone-graph/) — Medium — Graph traversal + cloning
- [Done] [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/) — Medium — DFS on grid
- [ ] [542. 01 Matrix](https://leetcode.com/problems/01-matrix/) — Medium — Multi-source BFS
- [ ] [130. Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) — Medium — DFS from boundaries
- [ ] [417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) — Medium — DFS from oceans
- [ ] [1020. Number of Enclaves](https://leetcode.com/problems/number-of-enclaves/) — Medium — DFS from boundary
- [ ] [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/) — Medium — BFS shortest path
- [ ] [286. Walls and Gates](https://leetcode.com/problems/walls-and-gates/) — Medium — Multi-source BFS
- [ ] [841. Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/) — Medium — DFS reachability

---

## Phase 2: Shortest Path Algorithms (Week 2)

### 2.1 Unweighted Graphs
- **BFS** - Shortest path in unweighted graphs

### 2.2 Weighted Graphs (Non-negative weights)
- **Dijkstra's Algorithm**
  ```
  Time: O((V+E) log V) with min-heap
  Space: O(V)
  ```
  - Single source shortest path
  - Cannot handle negative weights

### 2.3 Weighted Graphs (Negative weights allowed)
- **Bellman-Ford Algorithm**
  ```
  Time: O(V * E)
  Space: O(V)
  ```
  - Detects negative cycles
  - Slower but more versatile

### 2.4 All Pairs Shortest Path
- **Floyd-Warshall Algorithm**
  ```
  Time: O(V³)
  Space: O(V²)
  ```
  - Dynamic programming approach
  - Good for dense graphs

**Practice Questions:**
- [ ] [743. Network Delay Time](https://leetcode.com/problems/network-delay-time/) — Medium — Dijkstra's
- [ ] [787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) — Medium — Bellman-Ford / Modified Dijkstra
- [ ] [1514. Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/) — Medium — Modified Dijkstra
- [ ] [1631. Path With Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/) — Medium — Dijkstra's (modified cost)
- [ ] [1976. Number of Ways to Arrive at Destination](https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/) — Medium — Dijkstra's + counting
- [ ] [1334. Find the City With the Smallest Number of Neighbors](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) — Medium — Floyd-Warshall / Dijkstra
- [ ] [2642. Design Graph With Shortest Path Calculator](https://leetcode.com/problems/design-graph-with-shortest-path-calculator/) — Hard — Dijkstra's (design)
- [ ] [3123. Find Edges in Shortest Paths](https://leetcode.com/problems/find-edges-in-shortest-paths/) — Medium — Dijkstra's from both ends
- [ ] [1293. Shortest Path in a Grid with Obstacles Elimination](https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/) — Hard — BFS with state
- [ ] [2290. Minimum Obstacle Removal to Reach Corner](https://leetcode.com/problems/minimum-obstacle-removal-to-reach-corner/) — Hard — 0-1 BFS / Dijkstra

---

## Phase 3: Advanced Graph Algorithms (Week 3)

### 3.1 Topological Sort
```
Time: O(V + E)
```
- **Kahn's Algorithm** (BFS-based, in-degree counting)
- **DFS-based** (post-order reversal)
- Applications: Course scheduling, task ordering, detecting cycles in DAG

**Practice Questions:**
| # | Problem | Difficulty | Concept |
|---|---------|-----------|---------|
| 21 | [207. Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | Cycle detection in DAG |
| 22 | [210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | Medium | Topological sort |
| 23 | [310. Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/) | Medium | Topological sort (peeling leaves) |
| 24 | [1203. Sort Items by Groups Respecting Dependencies](https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/) | Hard | Multi-level topological sort |
| 25 | [269. Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) | Hard | Topological sort from ordering |
| 26 | [802. Find Eventual Safe States](https://leetcode.com/problems/find-eventual-safe-states/) | Medium | Reverse topological / DFS states |
| 27 | [1136. Parallel Courses](https://leetcode.com/problems/parallel-courses/) | Hard | Longest path in DAG |
| 28 | [2050. Parallel Courses III](https://leetcode.com/problems/parallel-courses-iii/) | Hard | Longest path + DP on DAG |

### 3.2 Minimum Spanning Tree (MST)
- **Kruskal's Algorithm**
  ```
  Time: O(E log E) - sorting edges
  ```
  - Uses Union-Find (Disjoint Set Union)

- **Prim's Algorithm**
  ```
  Time: O((V+E) log V) with min-heap
  ```
  - Greedy, grows tree from a starting node

**Practice Questions:**
| # | Problem | Difficulty | Algorithm |
|---|---------|-----------|-----------|
| 29 | [1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) | Medium | Prim's / Kruskal's |
| 30 | [1489. Find Critical and Pseudo-Critical Edges in MST](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) | Hard | Kruskal's + edge analysis |
| 31 | [1168. Optimize Water Distribution in a Village](https://leetcode.com/problems/optimize-water-distribution-in-a-village/) | Hard | MST with virtual node |

### 3.3 Union-Find (Disjoint Set Union - DSU)
```
Time: O(α(N)) ≈ O(1) per operation with path compression + union by rank
```

**Practice Questions:**
| # | Problem | Difficulty | Concept |
|---|---------|-----------|---------|
| 32 | [684. Redundant Connection](https://leetcode.com/problems/redundant-connection/) | Medium | Cycle detection with DSU |
| 33 | [323. Number of Connected Components](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | Medium | Count components |
| 34 | [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/) | Medium | Connected components |
| 35 | [721. Accounts Merge](https://leetcode.com/problems/accounts-merge/) | Medium | DSU with mapping |
| 36 | [990. Satisfiability of Equality Equations](https://leetcode.com/problems/satisfiability-of-equality-equations/) | Medium | DSU with equations |
| 37 | [1202. Smallest String With Swaps](https://leetcode.com/problems/smallest-string-with-swaps/) | Medium | DSU + sorting groups |
| 38 | [1319. Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/) | Medium | DSU + counting |
| 39 | [1627. Graph Connectivity With Threshold](https://leetcode.com/problems/graph-connectivity-with-threshold/) | Hard | DSU with math |
| 40 | [2503. Maximum Number of Points From Grid Queries](https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/) | Hard | DSU + offline processing |

---

## Phase 4: Hard Problems & Patterns (Week 4)

### 4.1 Strongly Connected Components (SCC)
- **Kosaraju's Algorithm**
- **Tarjan's Algorithm**

### 4.2 Bipartite Graph Check
```
Time: O(V + E)
```
- Two-coloring problem

### 4.3 Advanced Patterns
- State-space BFS
- Graph + DP
- Reversed graph problems
- Multi-source/multi-destination

**Practice Questions:**
- [ ] [785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/) — Medium — Bipartite check
- [ ] [886. Possible Bipartition](https://leetcode.com/problems/possible-bipartition/) — Medium — Bipartite + grouping
- [ ] [1192. Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/) — Hard — Tarjan's Bridge Finding
- [ ] [1462. Course Schedule IV](https://leetcode.com/problems/course-schedule-iv/) — Medium — Transitive closure / Floyd-Warshall
- [ ] [277. Find the Celebrity](https://leetcode.com/problems/find-the-celebrity/) — Medium — Graph reasoning
- [ ] [399. Evaluate Division](https://leetcode.com/problems/evaluate-division/) — Medium — Graph + DFS/Union-Find
- [ ] [261. Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) — Medium — Tree properties
- [ ] [310. Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/) — Medium — Topological peel
- [ ] [864. Shortest Path to Get All Keys](https://leetcode.com/problems/shortest-path-to-get-all-keys/) — Hard — State-space BFS
- [ ] [127. Word Ladder](https://leetcode.com/problems/word-ladder/) — Hard — BFS + transformation graph
- [ ] [126. Word Ladder II](https://leetcode.com/problems/word-ladder-ii/) — Hard — BFS + backtracking
- [ ] [332. Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) — Hard — Hierholzer's Algorithm (Eulerian path)
- [ ] [753. Cracking the Safe](https://leetcode.com/problems/cracking-the-safe/) — Hard — De Bruijn sequence / Hierholzer's
- [ ] [834. Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/) — Hard — Tree DP + rerooting
- [ ] [2246. Longest Path With Different Adjacent Characters](https://leetcode.com/problems/longest-path-with-different-adjacent-characters/) — Hard — Tree DP

---

## 🔥 Must-Do Interview Questions (Top 20)

These are the most frequently asked graph problems in FAANG interviews:

- [ ] **[200. Number of Islands](https://leetcode.com/problems/number-of-islands/)** - Grid DFS/BFS
- [ ] **[133. Clone Graph](https://leetcode.com/problems/clone-graph/)** - Graph cloning
- [ ] **[207. Course Schedule](https://leetcode.com/problems/course-schedule/)** - Topological sort / Cycle detection
- [ ] **[210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)** - Topological sort
- [ ] **[743. Network Delay Time](https://leetcode.com/problems/network-delay-time/)** - Dijkstra's
- [ ] **[787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)** - Bellman-Ford
- [ ] **[684. Redundant Connection](https://leetcode.com/problems/redundant-connection/)** - Union-Find
- [ ] **[721. Accounts Merge](https://leetcode.com/problems/accounts-merge/)** - Union-Find + mapping
- [ ] **[127. Word Ladder](https://leetcode.com/problems/word-ladder/)** - BFS shortest path
- [ ] **[399. Evaluate Division](https://leetcode.com/problems/evaluate-division/)** - Graph DFS/Union-Find
- [ ] **[417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)** - Multi-source DFS
- [ ] **[310. Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/)** - Topological leaf peeling
- [ ] **[261. Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/)** - Tree validation
- [ ] **[785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)** - Bipartite check
- [ ] **[1192. Critical Connections](https://leetcode.com/problems/critical-connections-in-a-network/)** - Bridges (Tarjan's)
- [ ] **[1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/)** - MST
- [ ] **[542. 01 Matrix](https://leetcode.com/problems/01-matrix/)** - Multi-source BFS
- [ ] **[1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)** - BFS shortest path
- [ ] **[332. Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/)** - Eulerian path
- [ ] **[269. Alien Dictionary](https://leetcode.com/problems/alien-dictionary/)** - Topological sort

---

## 📋 Quick Reference Cheat Sheet

### Algorithm Selection Guide
```
Problem Type                          → Algorithm
─────────────────────────────────────────────────────────
Shortest path (unweighted)            → BFS
Shortest path (weighted, no negative) → Dijkstra's
Shortest path (negative weights)      → Bellman-Ford
All pairs shortest path               → Floyd-Warshall
Minimum spanning tree                 → Kruskal's / Prim's
Cycle detection (undirected)          → Union-Find / DFS
Cycle detection (directed)            → Topological sort / DFS colors
Topological ordering                  → Kahn's BFS / DFS
Connected components                  → Union-Find / DFS
Bipartite check                       → BFS coloring
Bridges & articulation points         → Tarjan's
Eulerian path/circuit                 → Hierholzer's
```

### DFS State Colors (for cycle detection)
```
WHITE (0) = Unvisited
GRAY  (1) = Currently in recursion stack (visiting)
BLACK (2) = Fully processed

Cycle exists if we encounter a GRAY node during DFS
```

### Union-Find Template
```python
class UnionFind:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [0] * n

    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])  # Path compression
        return self.parent[x]

    def union(self, x, y):
        px, py = self.find(x), self.find(y)
        if px == py: return False
        # Union by rank
        if self.rank[px] < self.rank[py]:
            px, py = py, px
        self.parent[py] = px
        if self.rank[px] == self.rank[py]:
            self.rank[px] += 1
        return True
```

### Dijkstra's Template
```python
import heapq

def dijkstra(graph, start):
    dist = {node: float('inf') for node in graph}
    dist[start] = 0
    pq = [(0, start)]  # (distance, node)

    while pq:
        d, u = heapq.heappop(pq)
        if d > dist[u]: continue  # Skip outdated entries

        for v, weight in graph[u]:
            if dist[u] + weight < dist[v]:
                dist[v] = dist[u] + weight
                heapq.heappush(pq, (dist[v], v))

    return dist
```

---

## 🗓️ Suggested 4-Week Schedule

| Week | Focus | Daily Goal | Problems |
|------|-------|-----------|----------|
| **Week 1** | Traversals & Representations | 2-3 problems/day | #1-10 |
| **Week 2** | Shortest Path Algorithms | 2-3 problems/day | #11-20 |
| **Week 3** | Advanced (Topo, MST, DSU) | 2-3 problems/day | #21-40 |
| **Week 4** | Hard Problems & Review | 2-3 problems/day | #41-55 + Review |

**Daily Routine:**
1. Review algorithm/theory (15 min)
2. Solve 2-3 problems (60-90 min)
3. Review solutions & patterns (15 min)

---

## 🎯 Interview Tips

1. **Always clarify:** Directed or undirected? Weighted? Cyclic? Connected?
2. **Start with BFS/DFS** - Most graph problems use these as building blocks
3. **State your complexity** - Time and space complexity upfront
4. **Handle edge cases** - Empty graph, single node, disconnected components
5. **Optimize iteratively** - Start with brute force, then optimize
6. **Use the right data structure** - Adjacency list vs matrix matters
7. **Practice whiteboarding** - Explain your thought process clearly

---

## 📚 Additional Resources

- **Visualgo** - Graph algorithm visualizations
- **CP-Algorithms** - Comprehensive graph theory reference
- **LeetCode Graph Tag** - Filter by difficulty and solve systematically

Good luck with your interview prep! 🚀
