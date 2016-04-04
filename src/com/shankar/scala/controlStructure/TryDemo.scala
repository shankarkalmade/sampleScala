package com.shankar.scala.controlStructure

import java.io.IOException

object TryDemo {
  
  def main(args: Array[String]): Unit = {
    try{
    println(getHalf(20))
    }catch{
      
      case ex: Exception => println("You should provide even number")
      case ex: IOException => println("Error while reading file")
    }
    finally{
      
      println("Done with getHalf function")
    }
    
    //get half or yield default value
    
   val defaultHalf =
   try{
    getDefaultHalf(15)
    
    }catch{
      
      case ex: Exception => 1
     
    }
    
    println(defaultHalf)
    
  }
  
  def getHalf(n : Int) ={
    
    if( n%2 == 0)
      n/2
    else
      throw new Exception("Number should be even")
    
  }
  
  def getDefaultHalf(n: Int) ={
    
    if( n%2 == 0)
      n/2
    else
      throw new Exception("Number should be even")
    
  }
}