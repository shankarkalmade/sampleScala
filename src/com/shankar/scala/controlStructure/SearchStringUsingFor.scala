package com.shankar.scala.controlStructure

import scala.io.Source



object SearchStringUsingFor {
  
  def main(args: Array[String]): Unit = {
    
    //list all files using 
    
     var allFiles = (new java.io.File("E:\\scala_workspace\\Sample_project\\src\\com\\shankar\\scala\\controlStructure")).listFiles
     
     //print all lines from directory .java files
    
    // printAllJavaFiles(allFiles)
     
     val compareString = "println" 
     
     findPatterns(allFiles,compareString)
    
  }
  
  def getLines(file:java.io.File) = scala.io.Source.fromFile(file).getLines()
     
  def printAllJavaFiles(files: Array[java.io.File]) = {
    
    for{
      file <- files
      if(file.isFile())
      line <- getLines(file)  
      
    }println(line)
    
    
  }
  
  def findPatterns(files: Array[java.io.File], pattern:String) = {
    
    for{
      file <- files
      
      if(file.isFile())
      if(file.getName().endsWith(".txt"))  
      line <- getLines(file)
      
      if(line.contains(pattern))
        
      if(line.trim().startsWith(pattern))  
    }println(file+"   "+line)
        
  }
  
  
}