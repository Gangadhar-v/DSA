/*
binary search is algorithm used to find the target element in the sorted array
divide the two equal parts and compare the target element with mid
if target is less than mid, then move to left half(high=mid-1)
if target is more than mid, then move to right half(low=mid+1)
                       TECH GANG */
class MyBinarySearch{
    fun binarySearch(arr:Array<Int>,high:Int,low:Int,target:Int): Int {
        val mid = low + (high - low)/2
        if(target==arr[mid]) return arr[mid]
        if(target>arr[mid]){
           return binarySearch(arr,high,mid+1,target)
        }
        else return binarySearch(arr,mid-1,low,target)
    }
}
fun main() {
    val arr= arrayOf(13,16,20,28,32,37,45)
    val high=arr.size-1
    val mid=0+(high-0)/2
    val myBinarySearch=MyBinarySearch()
    val result1=myBinarySearch.binarySearch(arr,high,0,37)
    println("the element $result1 is found in the array")
}