# Binary Search Pattern

Binary search is a technique to efficiently search for a target value in a sorted array or search space by repeatedly dividing the search interval in half.

## Problem Patterns in Binary Search

- **Classic Binary Search**
  - Find the index of a target value in a sorted array.
  - **Example Problems:**
    - Binary Search
    - Search Insert Position

- **Binary Search on Answer (Search Space)**
  - Search for the minimum/maximum feasible value in a range, not just in an array.
  - **Example Problems:**
    - Find Minimum in Rotated Sorted Array
    - Koko Eating Bananas
    - Capacity To Ship Packages Within D Days

- **Lower Bound / Upper Bound**
  - Find the first or last occurrence of a value, or the smallest/largest value meeting a condition.
  - **Example Problems:**
    - First Bad Version
    - Find First and Last Position of Element in Sorted Array

- **Binary Search in Rotated or Unusual Arrays**
  - Arrays that are rotated, have duplicates, or are otherwise not strictly sorted.
  - **Example Problems:**
    - Search in Rotated Sorted Array
    - Find Minimum in Rotated Sorted Array

- **Binary Search in 2D Arrays or Matrices**
  - Apply binary search logic to 2D data structures.
  - **Example Problems:**
    - Search a 2D Matrix
    - Kth Smallest Element in a Sorted Matrix

- **Advanced/Custom Condition Binary Search**
  - Use binary search to satisfy a custom predicate or function.
  - **Example Problems:**
    - Median of Two Sorted Arrays
    - Split Array Largest Sum

## General Approach
1. Initialize left and right pointers to the bounds of the search space.
2. While left <= right, compute the mid index.
3. Compare the mid value to the target or check the custom condition.
4. Adjust pointers based on the result.
5. Return the result based on the problem's requirement.
