package com.shankar.scala.funobject

object Sample {
  
  
  def main(args: Array[String]): Unit = {
    
    var total = (1 to 10) filter (_ % 2 == 0) map (_ * 2) reduce (_ * _)
    
    println(total)
    
    var sum = (1 to 10 ) filter (_ % 2==0 ) reduce (_ * _)
    
    println (sum)
    
    
  }
  
}