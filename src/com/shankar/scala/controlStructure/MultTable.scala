package com.shankar.scala.controlStructure

object MultTable {
  
  
  def main(args: Array[String]): Unit = {
    
    println(multiTable)
    
    
  }
  
  def multTable ={
    
    val table = for(i <- 1 to 10 ) yield {
      
      val row = for( j  <- 1 to 10) yield {
        
        val prod = (i * j).toString
        
        String.format("%4s", Array(prod))
        
      }
 
      row.mkString + '\n'
      
      
    }
    
    table.mkString
  }
  
  def multiTable = {
    
        val table = for (i <- 1 to 10) yield {
        val row = for (j <- 1 to 10) yield {
              val prod = (i * j).toString
              String.format("%4s", Array(prod))
        }
        row.mkString + '\n'
    }
     table.mkString
}
  
  
  
}