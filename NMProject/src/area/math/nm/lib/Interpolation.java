/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area.math.nm.lib;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;
import org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator;
/**
 *
 * @author Vaibhav Jain
 */
public class Interpolation {
    
    public Interpolation() {}
   
    public String splineInterpolation(double x[],double y[],double input)
    {
    UnivariateInterpolator interpolator = new SplineInterpolator();
    UnivariateFunction function = interpolator.interpolate(x, y);
    double interpolationX = input;
    double interpolatedY = function.value(input);
    System.out.println("f(" + interpolationX + ") = " + interpolatedY);
    String result=new String(Double.toString(interpolatedY));
    return(result);
    }
    
    public UnivariateFunction splinePlot(double x[],double y[])
    {
    UnivariateInterpolator interpolator = new SplineInterpolator();
    UnivariateFunction function = interpolator.interpolate(x, y);
    return(function);
    }
    
}
