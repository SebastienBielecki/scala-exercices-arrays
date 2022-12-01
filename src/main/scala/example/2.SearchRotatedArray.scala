package arrays

// import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

// STATEMENT
// We’re given a sorted integer array, nums and an integer value, target. 
// The array is rotated by some arbitrary number. Search the target in this array. 
// If the target does not exist then return -1.

object SearchRotatedArray:

    def searchRotatedArrayIterative (nums: List[Int], target: Int): Int = 
        if (nums.length == 0) return -1
        var left: Int = 0
        var right: Int = nums.length-1
        var mid: Int = 0
        while(left <= right)
            mid = (left+right)/2
            if (nums(mid) == target) return mid
            if (nums(left) <= nums(mid)) 
                if (target >= nums(left) && target <= nums(mid)) right = mid-1 
                else left = mid+1
            else 
                if (target >= nums(mid) && target <= nums(right)) left = mid+1
                else right = mid -1
        mid

    def searchRotatedArrayRecursive (nums: List[Int], target: Int): Int =
        if (nums.length == 0) return -1
        def rec(left: Int, right: Int): Int =
            if (right < left) return -1
            val mid: Int = (left+right)/2
            if (nums(mid) == target) return mid
            if (nums(left) <= nums(mid))
                if (target >= nums(left) && target <= nums(right)) rec(left, mid-1)                    
                else rec(mid+1, right)
            else
                if (target >= nums(mid) && target <= nums(right)) rec(mid+1, right)
                else rec(left, mid-1)
        rec(0, nums.length-1)
                
        

