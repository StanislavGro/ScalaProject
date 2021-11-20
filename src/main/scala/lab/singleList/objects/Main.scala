package lab.singleList.objects

import lab.singleList.classes.builders.{IntegerBuilder, StringBuilder}
import lab.singleList.classes.dataStructure.{singleList, superList}

import java.util.Scanner

object Main extends App {

    def sortTest(number: Int):Unit = {

        var builder = new IntegerBuilder()
        var singleL = new singleList[Int]()
        var superL = new superList[Int]()

        for(i <- 0 until number){
            singleL.addLast(builder.create())
        }

        var lastTime = System.currentTimeMillis
        singleL = superL.sort(singleL, builder.getComparator())
        println(s"На сортировку ${number} элементов было затрачено: " +
          s"${System.currentTimeMillis()-lastTime} миллисекунд")

    }


    sortTest(100)
    sortTest(500)
    sortTest(1000)
    sortTest(5000)
    sortTest(10000)
    sortTest(50000)
    sortTest(100000)
    sortTest(500000)
    sortTest(1000000)


}
