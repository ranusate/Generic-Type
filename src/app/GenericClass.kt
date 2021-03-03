package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData("Ranus", 10)
    val myDataInt:MyData<Int,String> = MyData(123, "My Data")
    myData.printData()
    myDataInt.printData()
}