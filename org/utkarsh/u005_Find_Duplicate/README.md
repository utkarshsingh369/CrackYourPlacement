# Number of approach = 3

---

## 1. Brute Force(*)

### *[ T: O(nlogn) ; S: O(1) ]*

    1. Sort the array and find the element which is equal to the next element.

## 2. Better Approach(*)

### *[ T: O(n) ; S: O(n) ]*

    1. Use a hashmap to keep count of each element

## 3. Optimal Approach

### *[ T: O(n) ; S: O(1) ]*

    1. Tortoise Method: start with slow=nums[0], fast=nums[0] pointers.
    2. Keep moving, slow as slow=nums[slow] (i.e., one step) & fast as fast=nums[nums[fast]] (i.e., two steps).
    3. There will definitely be a point, where, fast==slow, at that point start fast from the beginning, i.e., fast=nums[0].
    4. Keep moving fast and slow, as one-one step, at the point where fast==slow, the answer=fast or answer=slow.

## Bonus
    1. First read the problem, and note all details first, then think about solution.