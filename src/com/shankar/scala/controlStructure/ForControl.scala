package com.shankar.scala.controlStructure



object ForControl {
  
 
  def main(args: Array[String]): Unit = {
    
    //list all files in current directory
    
    var allFiles = (new java.io.File("E:")).listFiles
   
    allFiles.foreach { file => if(file.isDirectory()) println("+++ "+file ) else println("      "+file) }
    
    println("printing all .zip files")

    //allFiles.foreach { file => if(file.getName.endsWith(".zip")) println (file) }
    
    //multiple line for loop
    
    for(file <- allFiles;
        if file.isFile();
        if file.getName().endsWith(".zip")
    ) //println(file)
      
     
    //multiple line for loop with culry braces
    for{
      file <- allFiles
      if(file.isFile())
      if(file.getName().endsWith(".zip"))  
      
    }//println(file)
    
    
    printFirstThreeCharName(allFiles)
    
    
  }
  
  def printFirstThreeCharName(files : Array[java.io.File]) ={
    
    //nested for loop
    
    for{
      
      file <- files
      if(file.getName().endsWith(".zip"))
      
      f <- file.getName().toCharArray()
      
    }print(f)
     
    
  }
  }