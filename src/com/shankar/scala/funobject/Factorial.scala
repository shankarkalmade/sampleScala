package com.shankar.scala.funobject


object Factorial {
  
  def main(args: Array[String]): Unit = {
    
  (0 to 10).foreach(
  
    i => println(i + " fact  "+ factorial(i))
  )
  
  }
  
  def factorial ( i : Int) : Long ={
    
    def fact ( i : Int , accumulator :  Int) : Long = {
         
      if(i <= 1) accumulator
      else 
        fact ( i-1, i * accumulator )
        
    }
    
    fact ( i, 1);
  }
    
}