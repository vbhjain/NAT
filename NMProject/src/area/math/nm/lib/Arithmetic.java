package area.math.nm.lib;

import java.util.ArrayList;

public class Arithmetic 
{
    public double[] linArray(double xmin, double xinc, double xmax) 
    {
        int dim = (int) (((xmax-xmin) / xinc) + 1);
        double x[] = new double[dim];
        for(int i=0;i<dim;i++,xmin+=xinc)
            x[i] = xmin;
         return x;
    }
    public double[] f(ArrayList poly, double []x) 
    {
        double y[] = new double[x.length];
        for(int i=0;i<y.length;i++)
            y[i] = f(poly,x[i]);
        return y;
    }
    private double f(ArrayList poly, double x) 
    {
        double y = 0;
        for(int i=0;i<poly.size();i++)
        {
            Term t = (Term) poly.get(i);
            y = y + (t.getCoefficient() * Math.pow(x, t.getExponent()));
        }
        //System.out.println(x + " " + y);
        return y;
    }
}
