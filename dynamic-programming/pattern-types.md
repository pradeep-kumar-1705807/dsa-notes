# Dynamic Programming Patterns
Dynamic programming is a powerful technique used to solve complex problems by breaking them down into simpler subproblems. Here are some common patterns in dynamic programming, presented in tabular form for clarity:

| Pattern                        | When to Use                                         | Key Insight                                                                 | Example Problems |
|------------------------------- |----------------------------------------------------|----------------------------------------------------------------------------|-----------------|
| **Linear DP**                  | Sequential data                                    | Current state depends on previous state(s)                                  | Fibonacci Sequence, Maximum Subarray Sum (Kadane's), House Robber |
| **Grid DP**                    | 2D navigation or pathfinding                       | Solution built by considering paths from adjacent cells                     | Unique Paths, Minimum Path Sum, Edit Distance |
| **0/1 Knapsack**               | Binary choice: take item or not                    | Each item included/excluded; combinatorial exploration                      | 0/1 Knapsack, Subset Sum, Partition Equal Subset Sum |
| **Unbounded Knapsack**         | Items can be used multiple times                   | Allows reuse of items; different combinatorial structure                    | Coin Change, Unbounded Knapsack, Integer Break |
| **Longest Common Subsequence** | Sequence matching                                  | Built by comparing characters and finding common subsequences               | Longest Common Subsequence, Longest Palindromic Subsequence, Edit Distance |
| **Interval DP**                | Range operations or intervals                      | Solution derived by considering split points within intervals               | Matrix Chain Multiplication, Burst Balloons, Palindrome Partitioning |
| **State Machine DP**           | Multiple states and transitions                    | Solution built by transitioning between states based on defined rules       | Best Time to Buy and Sell Stock with Cooldown, Regular Expression Matching |
| **Tree DP**                    | Tree structures                                    | Often uses post-order traversal from leaves up to root                      | House Robber III, Binary Tree Cameras, Diameter of Binary Tree |
| **Digit DP**                   | Number ranges and digit manipulation               | Constructed by considering digits and their combinations                    | Count Numbers with Unique Digits, Digit Sum, Numbers Without Consecutive Ones |
| **Probability DP**             | Random events and expected values                  | Built by calculating expected outcomes based on event probabilities         | New 21 Game, Dice Roll Simulation, Probability of Knight Staying on Board |

These patterns can help identify the structure of a problem and guide the development of an efficient dynamic programming solution. Understanding these patterns is crucial for mastering dynamic programming techniques.

