package arrays

// import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

// Statement
// Given an integer array and a window of size w, 
// find the current maximum value in the window, 
// as it slides through the entire array.

object SlidingWindow:

    def findMaxSlidingWindow(nums: List[Int], windowSize: Int): ListBuffer[Int] = 
        var result: ListBuffer[Int] = ListBuffer()
        var windowSize2: Int = if (windowSize > nums.length) nums.length else windowSize
        var window: ListBuffer[Int] = ListBuffer()
     
        for (i <- 0 until windowSize2)
            while (window.length > 0 && nums(i) >= nums(window(window.length-1)))
                window -= window(window.length-1)
            window += i
        result += nums(window(0))

        for (i <- windowSize2 until nums.length) 
            if (window.length > 0 && window(0) <= i -windowSize2) window -= window(0)
            while (window.length > 0 && nums(i) >= nums(window(window.length-1)))
                window -= window(window.length-1)
            window += i
            result += nums(window(0))
        result



        
        

