package com.shankar.scala.controlStructure

class WhileControl {
  
  def getGcd(x: Int, y:Int): Int ={
    
    var a = x
    var b = y
    
    while(a!=0){
      
      val temp = a
      a = b%a 
      
      b = temp
     }
  b  
    
  }
  
  
  def getGcdByIf(x:Int, y:Int):Int ={
    
    return if(y==0) x else getGcdByIf(y, x%y)
    
  }
  
  
}