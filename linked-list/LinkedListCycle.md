
# Cyclic Linked List Detection - Complete Visual Guide

>A comprehensive guide to understanding and implementing cycle detection in linked lists using Floyd's Algorithm.

---

## Table of Contents
- [Introduction](#introduction)
- [What is a Cyclic Linked List?](#what-is-a-cyclic-linked-list)
- [Floyd's Cycle Detection Algorithm](#floyds-cycle-detection-algorithm)
- [Step-by-Step Visualization](#step-by-step-visualization)
- [Implementation](#implementation)
- [Common Patterns](#common-patterns)
- [Practice Problems](#practice-problems)
- [Quick Reference](#quick-reference)

---

## Introduction
Cycle detection in linked lists is a fundamental computer science problem. This guide provides visual explanations and implementations to master this concept.

### Key Concepts Covered
- Detecting if a cycle exists
- Finding the start of the cycle
- Finding the tail node that creates the cycle
- Time and space complexity analysis

---

## What is a Cyclic Linked List?

### Linear Linked List (No Cycle)


```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶ NULL
└───┘    └───┘    └───┘    └───┘    └───┘
```

### Cyclic Linked List


```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
                    ▲                          │
                    └──────────────────────────┘
```

---

## Floyd's Cycle Detection Algorithm

### Algorithm Overview
Floyd's algorithm (also known as the **Tortoise and Hare** algorithm) uses two pointers:
- **Slow pointer (🐢):** moves 1 step at a time
- **Fast pointer (🐰):** moves 2 steps at a time

#### Why It Works
- If there's a cycle:
  - The fast pointer will eventually catch up to the slow pointer
  - They will meet inside the cycle
  - Mathematical proof guarantees they meet
- If there's no cycle:
  - The fast pointer will reach NULL

---

## Step-by-Step Visualization

### Phase 1: Detecting the Cycle

Collapse

**Initial State:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
 🐢🐰                ▲                          │
                    └──────────────────────────┘
```


**Step 1:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
          🐢        🐰▲                          │
                    └──────────────────────────┘
```


**Step 2:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
                    🐢▲               🐰         │
                    └──────────────────────────┘
```


**Step 3:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
                    ▲ 🐢                        │🐰
                    └──────────────────────────┘
```


**Step 4:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
                    ▲         🐢🐰               │
                    └──────────────────────────┘
```
**CYCLE DETECTED!**

---

### Phase 2: Finding Cycle Start

**Mathematical Insight:**
When slow and fast meet:
- Distance traveled by slow = x + y
- Distance traveled by fast = x + y + z + y = x + 2y + z
- Since fast travels twice as fast: 2(x + y) = x + 2y + z
- Therefore: x = z

Where:
- x = distance from head to cycle start
- y = distance from cycle start to meeting point
- z = distance from meeting point back to cycle start

**Reset slow to head:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
 🐢                 ▲         🐰                 │
                    └──────────────────────────┘
```

**Move both pointers one step at a time:**
```
┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐    ┌───┐
│ 1 │───▶│ 2 │───▶│ 3 │───▶│ 4 │───▶│ 5 │───▶│ 6 │
└───┘    └───┘    └───┘    └───┘    └───┘    └───┘
                    🐢🐰                         │
                    ▲──────────────────────────┘
```
**CYCLE START FOUND!**

---

## Implementation

### Java Implementation

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleDetection {
    /**
     * Detects if a linked list has a cycle
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds the node where the cycle begins
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        // Phase 1: Detect if cycle exists
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return null;
        }
        // Phase 2: Find cycle start
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    /**
     * Finds the tail node that creates the cycle
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode findCycleTail(ListNode head) {
        ListNode cycleStart = detectCycle(head);
        if (cycleStart == null) {
            return null;
        }
        ListNode current = cycleStart;
        while (current.next != cycleStart) {
            current = current.next;
        }
        return current;
    }

    /**
     * Complete cycle analysis with all information
     */
    public void analyzeCycle(ListNode head) {
        ListNode cycleStart = detectCycle(head);
        if (cycleStart == null) {
            System.out.println("No cycle detected");
            return;
        }
        // Find cycle length
        int length = 1;
        ListNode temp = cycleStart.next;
        while (temp != cycleStart) {
            temp = temp.next;
            length++;
        }
        // Find tail
        ListNode tail = findCycleTail(head);
        System.out.println("Cycle Analysis:");
        System.out.println("- Cycle starts at node: " + cycleStart.val);
        System.out.println("- Cycle tail (creates cycle): " + tail.val);
        System.out.println("- Cycle length: " + length);
    }
}
```

### Alternative Implementation Using HashSet

```java
import java.util.*;

public class CycleDetectionHashSet {
    /**
     * Detects cycle using HashSet
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public ListNode detectCycleWithSet(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return current;  // Cycle start
            }
            visited.add(current);
            current = current.next;
        }
        return null;
    }
}
```

---

## Common Patterns

- **Pattern 1: Cycle at the End**
  ```
  ○───○───○───○───○
          └───────┘
  ```
- **Pattern 2: Cycle at the Beginning**
  ```
  ┌───────────┐
  ↓           │
  ○───○───○───○
  ```
- **Pattern 3: Self Loop**
  ```
  ○───○───○───●
              ↺
  ```
- **Pattern 4: Two-Node Cycle**
  ```
  ○───○
  └───┘
  ```
- **Pattern 5: Complete Circle**
  ```
  ┌───────────┐
  │           │
  ○───○───○───○
  ```

---

## Practice Problems

### Easy Level
- **Linked List Cycle (LeetCode 141)**
  - Simply detect if a cycle exists
  - Return true/false

### Medium Level
- **Linked List Cycle II (LeetCode 142)**
  - Find the node where cycle begins
  - Return the node reference

### Hard Level
- **Find cycle length**
  - Count the number of nodes in the cycle
  - Handle edge cases
- **Break the cycle**
  - Modify the list to remove the cycle
  - Maintain list integrity

### Implementation Exercise

```java
// Exercise: Implement these methods
public class CycleExercises {
    // 1. Find the middle node of the cycle
    public ListNode findCycleMiddle(ListNode head) {
        // Your implementation here
        return null;
    }
    // 2. Reverse the cycle while keeping non-cycle part intact
    public void reverseCycle(ListNode head) {
        // Your implementation here
    }
    // 3. Count nodes before cycle starts
    public int countNodesBeforeCycle(ListNode head) {
        // Your implementation here
        return 0;
    }
}
```

---

## Quick Reference

### Algorithm Cheat Sheet
```
┌─────────────────────────────────────────────┐
│          FLOYD'S ALGORITHM STEPS            │
├─────────────────────────────────────────────┤
│ 1. Initialize: slow = fast = head           │
│ 2. Move: slow by 1, fast by 2              │
│ 3. If they meet → cycle exists             │
│ 4. Reset slow to head                      │
│ 5. Move both by 1 until they meet          │
│ 6. Meeting point = cycle start             │
└─────────────────────────────────────────────┘
```

### Complexity Analysis

| Operation      | Time | Space | Method            |
|----------------|------|-------|-------------------|
| Detect Cycle   | O(n) | O(1)  | Floyd's Algorithm |
| Find Start     | O(n) | O(1)  | Floyd's Algorithm |
| Find Tail      | O(n) | O(1)  | Traverse from start |
| Detect Cycle   | O(n) | O(n)  | HashSet Method    |

### Key Points to Remember
- Two pointers move at different speeds
- Meeting point is NOT necessarily the cycle start
- Reset and move both pointers by 1 to find the cycle start
