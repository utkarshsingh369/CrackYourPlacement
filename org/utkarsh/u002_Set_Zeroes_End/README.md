# Number of approach = 2

---

## 1. Brute Force(*)

### *[ T: O(n^2) ; S: O(1) ]*

    1. Iterate through each element i=0 to n.
    2. Then, while(arr[i]==0 && arr[i-1]!=0): {swap(arr[i],arr[i-1]); i=i-1}

## 2. Optimal Approach(*)

### *[ T: O(n) ; S: O(1) ]*

    1. Two pointer approach.
    2. Keep i at last non zero index, and keep moving j.
    3. Swap(arr[i+1], arr[j]) & i+=1, if arr[j]!=0.

## Bonus
    1. Never use 'swap without 3rd variable for array elements, because let's say i==j and arr[i],arr[j] is being swapped, then change of the values will be a blunder.