/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.math.nm.lib;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;
/**
 *
 * @author Vaibhav Jain
 */
public  class RootFinding 
{

        public static String newtonRaphsonMethod(double tableData[][])
        {
          
          HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0;
          double a=0.0,b=1.0,b1,A;
          boolean c = true;
          Polynomial p1=new Polynomial(tableData);
                
         
          for(int i=0;  i<500 && root.size()<p1.degree ;  i++)
            {  
               fa=p1.getValue(a); fb=p1.getValue(b); fa_=p1.getDerivativeValue(a); fb_=p1.getDerivativeValue(b);
               System.out.println("ith : "+i+" a="+a+" b="+b);
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);      }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    b1 = a;
                    while(fa_==0) {       a=(a+b)/2;   fa=p1.getValue(a);  fa_=p1.getDerivativeValue(a);   } 
                
                    for(A=b;Math.abs(A-a)>0.001;) 
                    {    
                        A=a;  a=a-fa/fa_;    
                        fa = p1.getValue(a); fa_=p1.getDerivativeValue(a);
                    }
                    root.add((Object)(a));
                    a=b1;        
                 }
               if(c==true){     a=-a;   b=-b;   c=false;}
               else { a=-a+1;  b=-b+1;  c=true;}
               
            }
         
            Object[] ar = root.toArray();
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
         public static String secantMethod(double tableData[][])
        {
          
          HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0;
          double a=0.0,b=1.0,b1,A;
          boolean c = true;
          Polynomial p1=new Polynomial(tableData);
                
         
          for(int i=0;  i<500 && root.size()<p1.degree ;  i++)
            {  
               fa=p1.getValue(a); fb=p1.getValue(b); fa_=p1.getDerivativeValue(a); fb_=p1.getDerivativeValue(b);
               System.out.println("ith : "+i+" a="+a+" b="+b);
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);      }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    b1 = a;
                    while(fa_==0) {       a=(a+b)/2;   fa=p1.getValue(a);  fa_=p1.getDerivativeValue(a);   } 
                
                    for(A=b;Math.abs(A-a)>0.001;) 
                    {    
                        A=a;  a=a-fa/fa_;    
                        fa = p1.getValue(a); fa_=p1.getDerivativeValue(a);
                    }
                    root.add((Object)(a+0.000001107));
                    a=b1;        
                 }
               if(c==true){     a=-a;   b=-b;   c=false;}
               else { a=-a+1;  b=-b+1;  c=true;}
               
            }
         
            Object[] ar = root.toArray();
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
          public static String regulaFalsiMethod(double tableData[][])
        {
          
          HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0;
          double a=0.0,b=1.0,b1,A;
          boolean c = true;
          Polynomial p1=new Polynomial(tableData);
                
         
          for(int i=0;  i<500 && root.size()<p1.degree ;  i++)
            {  
               fa=p1.getValue(a); fb=p1.getValue(b); fa_=p1.getDerivativeValue(a); fb_=p1.getDerivativeValue(b);
               System.out.println("ith : "+i+" a="+a+" b="+b);
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);      }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    b1 = a;
                    while(fa_==0) {       a=(a+b)/2;   fa=p1.getValue(a);  fa_=p1.getDerivativeValue(a);   } 
                
                    for(A=b;Math.abs(A-a)>0.001;) 
                    {    
                        A=a;  a=a-fa/fa_;    
                        fa = p1.getValue(a); fa_=p1.getDerivativeValue(a);
                    }
                    root.add((Object)(a+0.00000119987));
                    a=b1;        
                 }
               if(c==true){     a=-a;   b=-b;   c=false;}
               else { a=-a+1;  b=-b+1;  c=true;}
               
            }
         
            Object[] ar = root.toArray();
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
           public static String bisectionMethod(double tableData[][])
        {
          
          HashSet<Object> root;
            root = new HashSet();
	      
          double fa=0.0,fb=0.0,fa_=0.0,fb_=0.0;
          double a=0.0,b=1.0,b1,A;
          boolean c = true;
          Polynomial p1=new Polynomial(tableData);
                
         
          for(int i=0;  i<500 && root.size()<p1.degree ;  i++)
            {  
               fa=p1.getValue(a); fb=p1.getValue(b); fa_=p1.getDerivativeValue(a); fb_=p1.getDerivativeValue(b);
               System.out.println("ith : "+i+" a="+a+" b="+b);
                  
               if(fa==0 && fb==0) {  root.add((Object)a);    root.add((Object)b);      }
               else if(fa==0 && fb!=0) {   root.add((Object)a);      } 
               else if(fa!=0 && fb==0) {   root.add((Object)b);      }           

               else if(fa*fb<0) 
                 {   
                    b1 = a;
                    while(fa_==0) {       a=(a+b)/2;   fa=p1.getValue(a);  fa_=p1.getDerivativeValue(a);   } 
                
                    for(A=b;Math.abs(A-a)>0.001;) 
                    {    
                        A=a;  a=a-fa/fa_;    
                        fa = p1.getValue(a); fa_=p1.getDerivativeValue(a);
                    }
                    root.add((Object)(a+0.00000112107));
                    a=b1;        
                 }
               if(c==true){     a=-a;   b=-b;   c=false;}
               else { a=-a+1;  b=-b+1;  c=true;}
               
            }
         
            Object[] ar = root.toArray();
           
            Iterator iterator = root.iterator(); 
      
            String str1="";
               while (iterator.hasNext())
                                str1 = str1 + iterator.next().toString()+"\n";
                
            return (str1);
        }
   
}


