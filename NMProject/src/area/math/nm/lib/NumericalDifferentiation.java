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
 * @author Deepika Rana
 */
public class NumericalDifferentiation {

    final double h = 1.0e-12;
    String exp;
    
    public NumericalDifferentiation(String exp){
        this.exp=exp;
        
    }

   public double derive(double x0) {
        double x1 = x0 - h;
        double x2 = x0 + h;
        double y1 = f(x1);
        double y2 = f(x2);
        double t = (y2 - y1) / (2 * h);
        return (int)(t*1000000)/1000000.0;
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

