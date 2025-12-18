# Two Pointers Technique

The **Two Pointers** technique is an efficient algorithmic approach where two indices (pointers) traverse a data structure in a coordinated way to solve problems in linear time.

It is commonly used to reduce time complexity from **O(n²)** to **O(n)** when working with arrays, strings, or linked lists.

---

## When to Use Two Pointers

Use the Two Pointers technique when:

- The input is an **array, string, or linked list**
- The **order of elements matters**
- You need to **compare elements** across positions
- A brute-force approach would require **nested loops**
- You want an **O(n)** solution

---

## Types of Two Pointer Patterns

### 1. Opposite Direction Pointers (Left ↔ Right)

- Reversing arrays or strings
- Finding pairs in sorted arrays

#### Template
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    // decision logic
    left++;
    right--;
}
```
### Example Problems

- Valid Palindrome
- Reverse String
- Two Sum II (Sorted Array)

### 2. Same Direction Pointers (Fast & Slow)

Both pointers move forward, but the fast pointer explores elements while the slow pointer tracks valid positions.

#### Use Cases
- Removing elements
- Skipping duplicates
- In-place array modification

#### Template
```java
int slow = 0;
for (int fast = 0; fast < arr.length; fast++) {
    if (condition) {
        arr[slow++] = arr[fast];
    }
}
```
#### Example Problems
- Remove Duplicates from Sorted Array
- Move Zeroes

### 3. Sliding Window (Expandable Two Pointers)

Two pointers define a dynamic window that expands and shrinks based on constraints.

#### Use Cases
- Subarrays or substrings
- Maximum or minimum in a range
- Counting or summing within a window

#### Template
```java
int left = 0;
for (int right = 0; right < arr.length; right++) {
    // expand window
    while (windowInvalid) {
        left++; // shrink window
    }
}
```

#### Example Problems
- Longest Substring Without Repeating Characters
- Minimum Size Subarray Sum
