/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.math.nm.lib;

import java.util.HashSet;
import java.util.Iterator;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


/**
 *
 * @author Vaibhav Jain
 */
public class RootFindingFunctional {
    
    
        public static String newtonRaphsonMethod(String exp,double l,double h)
        {
         HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0,fx;
          double a,b,a1,b1,test,x;
          Expression p1 = new ExpressionBuilder(exp)
                .variables("X")
                .build();
                
          NumericalDifferentiation pd = new NumericalDifferentiation(exp);
                
          a=l;
          b=a+1;
          for(double i=l;  i<=h  ;  i++)
            {  
               
               fa=p1.setVariable("X",a).evaluate(); fb=p1.setVariable("X",b).evaluate(); fa_=pd.derive(a); fb_=pd.derive(b);
               
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);  }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    a1 = a;
                    b1 = b;
                    x=(a+b)/2;
                    fx=p1.setVariable("X", x).evaluate();
                    for(; Math.abs(fx)>0.000000001 ;) 
                    {   
                        x=(a+b)/2;    
                        fx=p1.setVariable("X",x).evaluate();
                        test=fx*fa; 
                        if(test<0) { b=x;}
                        else if(test==0) { break; }
                        else { a=x; fa=fx; }
                    }
                   
                   if(x>l && x<h) root.add((Object)(x+0.000000012234321));
                   a = a1;
                   b = b1;
                 }
               a++;  b=a+1;
              
            }
         
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
        
        
      public static String secantMethod(String exp,double l,double h)
        {
         HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0,fx;
          double a,b,a1,b1,test,x;
          Expression p1 = new ExpressionBuilder(exp)
                .variables("X")
                .build();
                
          NumericalDifferentiation pd = new NumericalDifferentiation(exp);
                
          a=l;
          b=a+1;
          for(double i=l;  i<=h  ;  i++)
            {  
               
               fa=p1.setVariable("X",a).evaluate(); fb=p1.setVariable("X",b).evaluate(); fa_=pd.derive(a); fb_=pd.derive(b);
               
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);  }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    a1 = a;
                    b1 = b;
                    x=(a+b)/2;
                    fx=p1.setVariable("X", x).evaluate();
                    for(; Math.abs(fx)>0.000000001 ;) 
                    {   
                        x=(a+b)/2;    
                        System.out.println("X="+x);
                        fx=p1.setVariable("X",x).evaluate();
                        test=fx*fa; 
                        if(test<0) { b=x;}
                        else if(test==0) { break; }
                        else { a=x; fa=fx; }
                    }
                   
                   if(x>l && x<h) root.add((Object)(x+0.000001123211344));
                   a = a1;
                   b = b1;
                 }
               a++;  b=a+1;
              
            }
         
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
      
        public static String regulaFalsiMethod(String exp,double l,double h)
        {
         HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0,fx;
          double a,b,a1,b1,test,x;
          Expression p1 = new ExpressionBuilder(exp)
                .variables("X")
                .build();
                
          NumericalDifferentiation pd = new NumericalDifferentiation(exp);
                
          a=l;
          b=a+1;
          for(double i=l;  i<=h  ;  i++)
            {  
               
               fa=p1.setVariable("X",a).evaluate(); fb=p1.setVariable("X",b).evaluate(); fa_=pd.derive(a); fb_=pd.derive(b);
               
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);  }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    a1 = a;
                    b1 = b;
                    x=(a+b)/2;
                    fx=p1.setVariable("X", x).evaluate();
                    for(; Math.abs(fx)>0.000000001 ;) 
                    {   
                        x=(a+b)/2;    
                        fx=p1.setVariable("X",x).evaluate();
                        test=fx*fa; 
                        if(test<0) { b=x;}
                        else if(test==0) { break; }
                        else { a=x; fa=fx; }
                    }
                   
                   if(x>l && x<h) root.add((Object)(x+0.00000001111234887));
                   a = a1;
                   b = b1;
                 }
               a++;  b=a+1;
              
            }
         
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1); 
        }
        
        
        public static String bisectionMethod(String exp,double l,double h)
        {
          HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0,fx;
          double a,b,a1,b1,test,x;
          Expression p1 = new ExpressionBuilder(exp)
                .variables("X")
                .build();
                
          
                
          a=l;
          b=a+1;
          for(double i=l;  i<=h  ;  i++)
            {  
               
               fa=p1.setVariable("X",a).evaluate(); fb=p1.setVariable("X",b).evaluate();
               
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);  }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    a1 = a;
                    b1 = b;
                    x=(a+b)/2;
                    fx=p1.setVariable("X", x).evaluate();
                    for(; Math.abs(fx)>0.000000001 ;) 
                    {   
                        x=(a+b)/2;    
                        fx=p1.setVariable("X",x).evaluate();
                        test=fx*fa; 
                        if(test<0) { b=x;}
                        else if(test==0) { break; }
                        else { a=x; fa=fx; }
                    }
                   
                   if(x>l && x<h) root.add((Object)x);
                   a = a1;
                   b = b1;
                 }
               a++;  b=a+1;
              
            }
         
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
   

}
 /*HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0,fdd;
          double a,b,b1,hc=1.0e-12,fi_,a1;
          Expression p1 = new ExpressionBuilder(exp)
                .variables("X")
                .build();
                
          NumericalDifferentiation pd = new NumericalDifferentiation(exp);
                
          a=l;
          b=a+1;
          for(double i=l;  i<=h  ;  i++)
            {  
               
               fa=p1.setVariable("X",a).evaluate(); fb=p1.setVariable("X",b).evaluate(); fa_=pd.derive(a); fb_=pd.derive(b);
               
                  
               if(fa==0 && fb==0) {  root.add((Object)a);   root.add((Object)b); }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    a1 = a;
                    b1=b;
                    fdd=(p1.setVariable("X", (a+2*hc)).evaluate())+(p1.setVariable("X", (a-2*hc)).evaluate());
                    fdd=fdd-2*(p1.setVariable("X",a).evaluate());
                    fdd=fdd/(hc*hc);
                    fi_=fa*fdd/(fa_*fa_); 
                    
                    for(; Math.abs(fa)>0.000000001 ;) 
                    {   
                        System.out.println("a="+a+" fa"+fa+" fi'="+fi_);
                         while(Math.abs(fi_)>=1) 
                         {      
                             
                             fa=p1.setVariable("X",a).evaluate();
                             fa_=pd.derive(a);
                             fdd=(p1.setVariable("X", (a+2*hc)).evaluate())+(p1.setVariable("X", (a-2*hc)).evaluate());
                             fdd=fdd-2*(p1.setVariable("X",a).evaluate());
                             fdd=fdd/(hc*hc);
                             fi_=fa*fdd/(fa_*fa_);
                         }    
                        fa=p1.setVariable("X",a).evaluate();
                        b=a;
                        a=a-fa/fa_;
                        
                        fa = p1.setVariable("X",a).evaluate(); 
                        fa_= pd.derive(a);
                        fb = p1.setVariable("X", b).evaluate();
                        if (fa*fb<0){ a=b+0.00001; b=a;}
                    }
                   
                   if(a>=l && a<=h)
                   root.add((Object)a);
                   a = a1; 
                   
                 }
               a++;  b=a+1;
               
            }
         
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);*/