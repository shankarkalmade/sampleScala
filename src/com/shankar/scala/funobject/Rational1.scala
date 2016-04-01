package com.shankar.scala.funobject

class Rational1(n:Int, d:Int) {
  val g :Int = gcd(n,d)
  
  val numer:Int = n/g
  val denom:Int = d/g
  
  def this(n :Int) ={
    
    this(n,1)
  }
  
  private def gcd(n:Int, d:Int ):Int ={
    if (d==0)
      n
    else
      gcd(d, n%d)
  
  }
  
  private def lessThan(that: Rational1)={
    
    numer * that.denom > denom * that.numer
  }
  
  
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
  
  def max (that: Rational1) ={
    
    if(this.lessThan(that))
      this
    else 
      that
      
  }
  
override def toString() = numer +" / "+denom
  
}