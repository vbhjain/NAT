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
 * @author Ichchhit Baranwal
 */
public class NumericalIntegration {
    final double N = 3000;
    String exp;
    
   public NumericalIntegration(String exp){
        this.exp=exp;
        
    }

   
    public double useTrapezoidal(double lower,double upper) {
      double h = (upper - lower) / N;              // step size
      double sum = 0.5 * (f(lower) + f(upper));    // area
      for (int i = 1; i < N; i++) {
         double x = lower + h * i;
         sum = sum + f(x);
      }

      return sum * h;
   }
    public double useSimpson1by3(double lower,double upper) {
        // precision parameter
      double h = (upper - lower) / N;     // step size
 
      // 1/3 terms
      double sum = (1.0 / 3.0) * (f(lower) + f(upper));

      // 4/3 terms
      for (int i = 1; i < N; i += 2) {
         double x = lower + h * i;
         sum += (4.0 / 3.0) * f(x);
      }

      // 2/3 terms
      for (int i = 2; i < N; i += 2) {
         double x = lower + h * i;
         sum += (2.0 / 3.0) * f(x);
      }

      return sum * h;
   }
    public double useSimpson3by8(double lower,double upper) {
        // precision parameter
      double h = (upper - lower) / N;     // step size
 
      // 1/3 terms
      double sum = (f(lower) + f(upper));

      // 4/3 terms
      for (int i = 1; i < N; i ++) {
         double x = lower + h * i;
         if(i%3==0)
            sum += 2.0 * f(x);
         else
             sum+=3.0*f(x);
      }


      return sum * h*(3.0/8.0);
   }
     double f(double x1) {
        Expression e = new ExpressionBuilder(exp)
                .variables("X", "Y")
                .build()
                .setVariable("X", x1);
        double result = e.evaluate();
        return result;
         }
    
}
