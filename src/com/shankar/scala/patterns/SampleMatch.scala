package com.shankar.scala.patterns

import scala.collection.immutable.Seq

object SampleMatch {
  
  
  def main(args: Array[String]): Unit = {
  
    val bools = Seq(true, false,false, true)
    
    for(bool <- bools ) {
      
      bool match {
        case true => println("true")
        case false => println("false")
          
          
      }
            
    }
    
    println ("====================================================")
    
    //more simple way using If 
    
    for(bool <- bools) {
      
      var state = if(bool) "true" else "false"
       println (state) 
      
    }
      
    
  }
  
  
}