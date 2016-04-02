package com.shankar.scala.controlStructure

object TestWhileControl {
  
  def main(args: Array[String]): Unit = {
    
    val test = new WhileControl
    
    println(test.getGcd(10, 5)) 
    
    
    println(test.getGcdByIf(10, 5)) 
    
  }
  
  
}