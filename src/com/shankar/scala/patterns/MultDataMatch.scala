package com.shankar.scala.patterns

import scala.collection.immutable.Seq
import java.lang.String



object MultDataMatch {
  
  def main(args: Array[String]): Unit = {
    
    for
    {
      data <- Seq(1,2, "one", "shankar", 10.345, 'http)
            
    } {
      
      val str = data match {
        case 1 => "int one"
        case _ : Int | _ : Double => "other number "+data
        //case d: Double => "double value " + data
        case "one" => "one value "
        case s: String => "string value " + data
        case unexpected => "unexpected data "+ unexpected
        
                
      }
      
      println (str)
      
    }
    
    
    
  }
  
  
}