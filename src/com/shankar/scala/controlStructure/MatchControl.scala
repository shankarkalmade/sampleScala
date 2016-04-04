package com.shankar.scala.controlStructure

object MatchControl {
  
  def main(args: Array[String]): Unit = {
    
    var friends =
    if(args.length!=0) args(0) else "No friends"
      
    val name = friends match{
      
      case "BK" => "Shankar K"
      case "SG" => "Swapnil G"
      case "AK" => "Abhi K" 
      case _ => "No friends"
    }
      
      
    println (friends)
    println (name)
    
  }
  
}