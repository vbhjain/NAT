/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.math.nm.lib;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author Vaibhav Jain
 */
public class ODEs {
    
    public double solveOde(String exp,double x0,double y0,double x)
    { 
      double h = x/10000d;
      Expression e = new ExpressionBuilder(exp)
                .variables("X", "Y")
                .build()
                .setVariable("X", x0).setVariable("Y",y0);
      double f0=e.evaluate();
      double y = y0;
      double f = 0.0d;
      System.out.println("x "+x);
      for(double i=h;i<=x;i+=h)
      {    
        f=y+h*f0;
        y=f;
        f0=e.setVariable("X",i).setVariable("Y",y).evaluate(); 
        System.out.println("result"+y);
      }
    return(f);
    }
}