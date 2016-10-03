package com.shankar.scala.funobject

object Closures {
  
  
  def main(args: Array[String]): Unit = {
    
    var factor = 2
    
    def accumulator = (i : Int) => i * factor
    
    var total = (1 to 10) filter ( _ % 2 ==0) map accumulator reduce (_ * _)

    println (total)
    
    factor = 3
    
    total = (1 to 10) filter ( _ % 2 ==0) map accumulator reduce (_ * _)
    
    println(total)
  }
}