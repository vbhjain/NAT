/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.math.nm.lib;

/**
 *
 * @author Vaibhav Jain
 */
public class Term {
 private double coeff;
 private double expo;
 
  public Term(double c,double e)
      {
    	  coeff=c;
    	  expo=e;
      }
    
      public double getCoefficient()
      {
    	  return coeff;
      }
      
      public double getExponent()
      {
    	  return expo;
      }
      public double getValue(double a)
      {  
    	  double value=coeff;
    	  double exp=expo;
    	  while(exp>0.0) {value=value*a; exp-=1.0;}
    	  return(value);
      }
}
