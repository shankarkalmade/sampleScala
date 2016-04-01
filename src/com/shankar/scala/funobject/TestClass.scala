package com.shankar.scala.funobject

object TestClass {
 
  
  def main(args: Array[String]): Unit = {
    
    val rat1 = new Rational1(10,5)
    
    val rat2 = new Rational1(5,3)
    
    println(rat1)
    
    println(rat2)
  
    val added = rat1.add(rat2)
    
    println("Addition = "+ added)

    val sub = rat1.sub(rat2)
    
    println("Sub = "+ sub)
    
    val mult = rat1.mult(rat2)
    
    println("mult = "+ mult)
    
    
    val div = rat1.div(rat2)
    
    println("Division = "+ div)
    
   
    //get max of two rational numbers
    println("Max of "+ rat1 +"  AND "+ rat2 + "   is "+ rat1.max(rat2))
    
    println("done")
    
  }
  
  
  
  
}
