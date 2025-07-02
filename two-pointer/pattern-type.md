# Two Pointer Pattern

The two pointer technique involves using two indices to traverse a data structure, often from different directions or at different speeds, to solve problems efficiently.

## Problem Patterns in Two Pointer

- **Opposite Ends (Start/End)**
  - Pointers start at opposite ends and move toward each other.
  - Example Problems:
    - Two Sum II (Input Array Is Sorted)
    - Container With Most Water
    - Valid Palindrome
    - Trapping Rain Water

- **Same Direction (Fast/Slow Pointer)**
  - Both pointers move in the same direction, often at different speeds.
  - Example Problems:
    - Remove Duplicates from Sorted Array
    - Linked List Cycle
    - Find the Middle of Linked List
    - Detect Cycle in Linked List

- **Subarray/Subsequence Problems**
  - Find subarrays or subsequences with certain properties using two pointers.
  - Example Problems:
    - Longest Substring Without Repeating Characters
    - Minimum Size Subarray Sum
    - Longest Substring with At Most K Distinct Characters

- **Partitioning and Rearrangement**
  - Partition or rearrange arrays in-place using two pointers.
  - Example Problems:
    - Sort Colors (Dutch National Flag)
    - Move Zeroes
    - Partition List

- **Merging and Intersection**
  - Merge or find intersection of two sorted arrays/lists.
  - Example Problems:
    - Merge Sorted Array
    - Intersection of Two Arrays II

- **Window Expansion/Contraction (Hybrid with Sliding Window)**
  - Expand and contract window boundaries to maintain a property.
  - Example Problems:
    - Longest Substring with At Most K Distinct Characters
    - Minimum Window Substring

## General Approach
- Use two pointers to traverse the data structure.
- Move pointers based on the problem's constraints (inward, outward, or at different speeds).
- Maintain or update state as required (e.g., window size, sum, unique elements).
