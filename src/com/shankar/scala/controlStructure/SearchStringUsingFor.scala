package com.shankar.scala.controlStructure

import scala.io.Source



object SearchStringUsingFor {
  
  def main(args: Array[String]): Unit = {
    
    //list all files using 
    
     //var allFiles = (new java.io.File("E:\\scala_workspace\\Sample_project\\src\\com\\shankar\\scala\\controlStructure")).listFiles
    
     var allFiles = (new java.io.File("/home/shankar/Documents/shankar_git_repos/scala/sampleScala/src/com/shankar/scala/controlStructure")).listFiles
     
     //print all lines from directory .java files
    
     printAllJavaFiles(allFiles)
     
     //val compareString = "println" 
     
     //findPatterns(allFiles,compareString)
    
     
     /**
      * write all files
      */
     //getAllFiles(allFiles).foreach { println }
     
     /**
      * write all directories
      */
     //getAllDirs(allFiles).foreach{ println}
     
     
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
      if(file.getName().endsWith(".scala"))  
      line <- getLines(file)
      
      if(line.contains(pattern))
        
      if(line.trim().startsWith(pattern))  
    }println(file+"   "+line)
        
  }
  
  //function to yield all files from path
    def getAllFiles(files: Array[java.io.File]):Array[java.io.File] = {
    
    for{
      file <- files
      if(file.isFile())
      
    }yield file
    
    
  }
  
  //function to yield all directories from path
    def getAllDirs(files: Array[java.io.File]):Array[java.io.File] = {
    
    for{
      file <- files
      if(file.isDirectory())
      
    }yield file
    
    
  }
  
}