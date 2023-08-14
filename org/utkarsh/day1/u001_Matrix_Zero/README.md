# Number of approach = 3

---

## 1. Brute Force

### *[ T: O((mn)(m+n)+mn)) ; S: O(1) ]*

    1. Iterate through each element, if it is zero, mark entire row and the column as '-1'.
    2. Iterate again and mark each '-1' as '0'.

## 2. Better Approach

### *[ T: O(2*mn) ; S: O(m+n) ]*

    1. Create two arrays, col[arr[0].length] to track 0 in columns & row[arr.length] for 0 in rows.
    2. Iterate in array, If arr[i][j]=0 make row[i]=0 & col[j]=0;
    3. Iterate again and make zeroes if col[j] or row[i] is 0.

## 3. Optimal Approach

### *[ T: O(2*mn) S: O(1) ; S: O(1) ]*

    1. Instead of creating separate arrays row & column, use first column and first rows as the two arrays.
    2. Top left cell gets repeated in both the arrays, hence, keep a different variable 'corner' for the col array.
    3. Repeat the same method, iterate and make (arr[0][j] && arr[i][0]) = 0, if arr[i][j]=0, check, if j==0, corner=0&&arr[i][0]=0,instead
    4. Start from bottom right place and solve from reverse, till second row and column
    5. Then, solve the first row before the first column, so that, if the top left value of first col is changed, the row is not getting hampered.

## Bonus
    1. Use Arrays.deepToString(int[][]), to print 2D array