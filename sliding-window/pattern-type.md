# Sliding Window Pattern

The sliding window technique is used to efficiently compute results on contiguous subarrays or substrings by maintaining a window that slides over the data.

## Types of Sliding Windows

- **Fixed Window:**
  - The window size remains constant as it slides over the data.
  - **Example Problems:**
    - Maximum Sum Subarray of Size K
    - Maximum Average Subarray I
  - **General Approach:**
    1. Initialize window boundaries and compute the result for the first window.
    2. Slide the window by one element at a time, updating the result by adding the new element and removing the old one.
    3. Repeat until the end of the array/string is reached.

- **Dynamic (Variable) Window:**
  - The window size can grow or shrink based on problem constraints (e.g., unique elements, sum/length conditions).
  - **Example Problems:**
    - Longest Substring Without Repeating Characters
    - Minimum Window Substring
    - Longest Substring with At Most K Distinct Characters
  - **General Approach:**
    1. Use two pointers to represent the window's start and end.
    2. Expand the window by moving the end pointer and include new elements.
    3. Shrink the window from the start as needed to maintain the required property.
    4. Track the best/required result during the process.
