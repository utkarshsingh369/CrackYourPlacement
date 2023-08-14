# Number of approach = 2

---

## 1. Better Approach(*)

### *[ T: O(3*n) ; S: O(1) ]*

    1. Count the number of zeroes, ones, and twos. Place them in the same array for each frequency.

## 2. Optimal Approach (Dutch national flag algorithm)

### *[ T: O(n) ; S: O(1) ]*

    1. Keep track of 3 pointers- low, mid, high. Such that, 0 is present in 0<=i<low; 1 is present in low<=i<mid-1; 2 is present in high<=i<=n-1
    2. Start low=0,mid=0,high=0. Keep moving mid.
