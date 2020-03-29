package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var size = sadArray.size;
        var happyArray = removeBadElements(sadArray)
        while (happyArray.size != size) {
            size = happyArray.size;
            happyArray = removeBadElements(happyArray)
        }
        return happyArray
    }

    fun removeBadElements(array: IntArray): IntArray {
        return array.filterIndexed { index, value ->
            index.equals(0) || index.equals(array.lastIndex)
                    || (array[index - 1] + array[index + 1] > array[index])
        }.toIntArray()
    }
}
