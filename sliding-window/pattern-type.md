# Sliding Window Pattern

The sliding window technique is used to efficiently compute results on contiguous subarrays or substrings by maintaining a window that slides over the data.


## Problem Patterns in Sliding Window

- **Fixed Window (Basic)**
  - The window size remains constant as it slides over the data.
  - Example Problems:
    - Maximum Sum Subarray of Size K
    - Maximum Average Subarray I
    - Number of Subarrays of Size K with Average Greater than Threshold

- **Dynamic (Variable) Window (Intermediate/Advanced)**
  - The window size can grow or shrink based on problem constraints (e.g., unique elements, sum/length conditions).
  - Example Problems:
    - Longest Substring Without Repeating Characters
    - Minimum Window Substring
    - Longest Substring with At Most K Distinct Characters
    - Minimum Size Subarray Sum
    - Longest Substring with At Most Two Distinct Characters

- **Minimum/Maximum in Window (Advanced)**
  - Find the minimum or maximum value in each window.
  - Example Problems:
    - Sliding Window Maximum
    - Sliding Window Median
    - Shortest Subarray with Sum at Least K

- **Longest/Shortest Substring or Subarray (Advanced)**
  - Find the longest or shortest substring/subarray with certain properties.
  - Example Problems:
    - Longest Substring Without Repeating Characters
    - Longest Substring with At Most K Distinct Characters
    - Minimum Size Subarray Sum
    - Longest Substring with At Most Two Distinct Characters
    - Longest Substring with All Vowels in Order

- **Count/Number of Subarrays (Intermediate/Advanced)**
  - Count the number of subarrays or substrings that satisfy a property.
  - Example Problems:
    - Subarrays with K Different Integers
    - Number of Substrings Containing All Three Characters

## General Approach
...existing code...

## General Approach
- For fixed window: Slide the window by one element at a time, updating the result as you go.
- For dynamic window: Expand and contract window boundaries using two pointers to maintain the required property.
