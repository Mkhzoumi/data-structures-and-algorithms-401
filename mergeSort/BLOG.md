# Merge Sort
sorts an array by dividing it to halfs each time until it's sorted then merge it.

### pseudo code:

```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```

### big O notation:

Time complexity: O(n log n)

Space complexity: O(n log n)

### tracing:

#### Pass1:
devide the main array into two halfs.

#### Pass 2
devide the for the second time , now we have 4 arrays.

#### Pass 3
devide for the 3rd time and now we have 6 arrays.

#### Pass 4
compare and sort the left side.

#### Pass 5
compare and sort the right side.

#### Pass 6
the sorting is finished now we merge the arrays.


![tracing](mergeSort.jpg)



