package com.shankar.scala.funobject

class RationalOperators(n:Int, d:Int) {
  
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
  
  private def <(that: RationalOperators)={
    
    numer * that.denom > denom * that.numer
  }
  
  
  def *(that:RationalOperators):RationalOperators = {
    
    new RationalOperators(that.numer * numer , that.denom * denom)
    
  }
  
  def / (that :RationalOperators) : RationalOperators ={
    
    new RationalOperators(numer * that.denom, denom * that.numer)
    
  }
  
  def + (that:RationalOperators) : RationalOperators ={
    
    new RationalOperators((numer * that.denom + denom * that.numer), denom * that.denom)
    
  }
  
  def - (that:RationalOperators) : RationalOperators ={
    
    new RationalOperators((numer * that.denom - denom * that.numer), denom * that.denom)
    
  }
  
  def getRationalInfo (): String ={
    
    numer +" / "+denom
    
  }
  
  def max (that: RationalOperators) ={
    
    if(this < that)
      this
    else 
      that
      
  }
  
override def toString() = numer +" / "+denom
}