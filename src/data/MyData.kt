package data

class MyData<T, U>(private val firstData: T, private val secondData: U) {
    private fun getSecondData(): U = secondData
    private fun getData(): T = firstData

    fun printData() {
        println("Data is ${getData()} and ${getSecondData()}")
    }
}