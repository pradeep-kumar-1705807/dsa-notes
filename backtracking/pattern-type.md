# Backtracking Pattern

Backtracking is a technique for solving problems incrementally, abandoning solutions that fail to satisfy constraints.

- **When to Use**: Problems involving permutations, combinations, or constraint satisfaction.
- **Key Insight**: Build solutions step by step, backtrack when a constraint is violated.
- **Example Problems:**
  - Subsets
  - Permutations
  - N-Queens
  - Word Search
- **General Approach:**
  1. Choose a possible option and proceed recursively.
  2. If a constraint is violated, backtrack and try another option.
  3. Continue until all solutions are found or the problem is solved.
