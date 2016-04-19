/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.math.nm.lib;

import java.util.ArrayList;
import area.math.nm.lib.Term;
/**
 *
 * @author Vaibhav Jain
 */
public class Polynomial {
    private ArrayList<Term> poly;
    private ArrayList<Term> polyderivative;
    public int degree=0;
    Polynomial(double input[][])
    {
    int row ,col;
    row=input.length;
    col=input[0].length;
    System.out.println("row="+row+" "+"col="+col);
    
    
    poly = new ArrayList<>();
    polyderivative = new ArrayList<>();
    for(int i=0;i<row;i++)
        {  
            if(degree < input[i][1])           degree=(int)input[i][1];
           Term T=new Term(input[i][0],input[i][1]);
           Term T_ = new Term(input[i][0]*input[i][1],input[i][1]-1); 
           poly.add(T);
           polyderivative .add(T_);
           
        }
   
    
     }
    
     double getValue(double a)
     {
      
      double value=0.0;
          for(int k=0; k<poly.size(); k++)
          { System.out.println("size="+" "+poly.size());
                value = value + poly.get(k).getValue(a);
            System.out.println("value"+" "+a+"="+value);
          }
      return(value);
     }
    
     double getDerivativeValue(double a)
     {
      
      double value=0.0;
      for(int k=0; k<polyderivative.size()-1; k++)
      { 
          value = value + polyderivative.get(k).getValue(a);
                System.out.println("value in derivative"+" "+a+"="+value);}
      return(value);
     }
}
