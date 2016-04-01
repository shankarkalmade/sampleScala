package com.shankar.scala.funobject

object TestClass {
 
  
  def main(args: Array[String]): Unit = {
    
    val rat1 = new Rational1(2,3)
    
    val rat2 = new Rational1(2)
    
    println(rat1.getRationalInfo())
    
    println(rat2.getRationalInfo())
  
    val added = rat1.add(rat2)
    
    println("Addition = "+ added.getRationalInfo())

    val sub = rat1.sub(rat2)
    
    println("Sub = "+ sub.getRationalInfo())
    
    val mult = rat1.mult(rat2)
    
    println("mult = "+ mult.getRationalInfo())
    
    
    val div = rat1.add(rat2)
    
    println("Division = "+ div.getRationalInfo())
    
    
  }
  
  
  
  
}