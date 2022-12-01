package arrays

object FindSmallestCommonNumber:

    // Statement
    // We’re given three integer arrays, each sorted in ascending order. 
    // Return the smallest number common in all three arrays. 
    // In case no number is common, return -1.

    def findNumber(arr1: List[Int], arr2: List[Int], arr3: List[Int]): Int =
        var i1: Int = 0
        var i2: Int = 0
        var i3: Int = 0
        while (i1 < arr1.length && i2 < arr2.length && i3 <= arr3.length)
            if (arr1(i1) == arr2(i2) && arr1(i1) == arr3(i3)) return arr1(i1)
            if (arr1(i1) <= arr2(i2) && arr1(i1) <= arr3(i3)) i1 += 1
            else if (arr2(i2) <= arr1(i1) && arr2(i2) <= arr3(i3)) i2 += 1
            else if (arr3(i3) <= arr2(i2) && arr3(i3) <= arr1(i1)) i3 += 1
        -1




