package com.shankar.scala.controlStructure



object ForControl {
  
 
  def main(args: Array[String]): Unit = {
    
    //list all files in current directory
    
    var allFiles = (new java.io.File("D:")).listFiles
   
    allFiles.foreach { file => if(file.isDirectory()) println("+++ "+file ) else println("      "+file) }
    
    
  }
  
  
    

  
}