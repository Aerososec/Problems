package Solutions

class ContestOne {
    fun problemOne(array: Array<Int>){
        var count = 0
        val indicesList = mutableListOf<Pair<Int, Int>>()
        var i = 0
        var j = array.size - 1
        while (i < j){
            if (array[i] == 1 && array[j] == 0){
                array[i] = 0
                array[j] = 1
                count++
                indicesList.add(i to j)
                i++
                j--
            }
            else{
                if (array[i] == 0)
                    i++
                if (array[j] == 1)
                    j--
            }
        }
        println(array.joinToString())
        println(count)
        for (ii in indicesList.indices step 2){
            println("${indicesList[ii]} ${indicesList[ii+1]}")
        }
    }
}