
class BinarySearch() {

    fun findTarget(array: Array<Int>, low: Int, high: Int, target: Int): Int {

        if (high >= low) {
            var mid = low + (high - low) / 2

            if (array[mid] == target) return mid

            if (array[mid] > target) {
                //then move to left half
                return findTarget(array, low, mid - 1, target)
            } else return findTarget(array, mid + 1, high, target)

        } else return -1
    }
}

fun main() {
    val array= arrayOf( 2, 3, 4, 10, 40)
    val high=array.size-1
    val binarySearch=BinarySearch()
    val result=binarySearch.findTarget(array,0,high,10)
    if(result==-1){
        println("the element is not present in array")
    }
    else println("the element is present at the index of $result")
}