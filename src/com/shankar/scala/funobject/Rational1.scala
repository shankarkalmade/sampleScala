package com.shankar.scala.funobject

class Rational1(n:Int, d:Int) {
  
  val numer:Int = n
  val denom:Int = d
  
  def mult(that:Rational1):Rational1 = {
    
    new Rational1(that.numer * numer , that.denom * denom)
    
  }
  
  def div(that :Rational1) : Rational1 ={
    
    new Rational1(numer * that.denom, denom * that.numer)
    
  }
  
  def add(that:Rational1) : Rational1 ={
    
    new Rational1((numer * that.denom + denom * that.numer), denom * that.denom)
    
  }
  
  def sub(that:Rational1) : Rational1 ={
    
    new Rational1((numer * that.denom - denom * that.numer), denom * that.denom)
    
  }
  
  def getRationalInfo (): String ={
    
    numer +" / "+denom
    
  }
  
  
  
}