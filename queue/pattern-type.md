# Queue Pattern

The queue pattern uses a FIFO (First-In-First-Out) data structure, often for level-order traversal or scheduling tasks.

- **When to Use**: Problems involving breadth-first search, task scheduling, or order of processing.
- **Key Insight**: Enqueue and dequeue elements to process them in order.
- **Example Problems:**
  - Binary Tree Level Order Traversal
  - Number of Islands (BFS)
  - Sliding Window Maximum (using deque)
  - Course Schedule
- **General Approach:**
  1. Use a queue to store elements to be processed.
  2. Enqueue new elements as they are discovered.
  3. Dequeue and process elements in FIFO order.
