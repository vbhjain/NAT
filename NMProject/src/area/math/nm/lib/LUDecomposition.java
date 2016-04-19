package area.math.nm.lib;

//This is a sample program to calulate the LU decomposition of the given matrix
import java.util.Scanner;
 
public class LUDecomposition
{
    public static double[] LU(int N,Integer a[][])
    {
       
        System.out.println("Enter the number of variables in the equations: ");
        try (Scanner input = new Scanner(System.in)) 
        {
            int n = N;
            System.out.println("Enter the coefficients of each variable for each equations");
            System.out.println("ax + by + cz + ... = d");
            int [][]mat = new int[n][n];
            int [][]constants = new int[n][1];
            
            
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    mat[i][j] = a[i][j];
                }
                constants[i][0] = a[i][n];
            }
            
            
            
            double [][]l = new double[n][n];
            double [][]u = new double[n][n];
	    int i,j,k;
	    
            for (i = 0; i < n; i++) // lu decompo starts
	    {
	        for (j = 0; j < n; j++)
	        {
	            if (j < i)
	                l[j][i] = 0;
	            else
	            {
	                l[j][i] = mat[j][i];
	                for (k = 0; k < i; k++)
	                {
	                    l[j][i] = l[j][i] - l[j][k] * u[k][i];
	                }
	            }
	        }
	        for (j = 0; j < n; j++)
	        {
	            if (j < i)
	                u[i][j] = 0;
	            else if (j == i)
	                u[i][j] = 1;
	            else
	            {
	                u[i][j] = mat[i][j] / l[i][i];
	                for (k = 0; k < i; k++)
	                {
	                    u[i][j] = u[i][j] - ((l[i][k] * u[k][j]) / l[i][i]);
	                }
	            }
	        }
	    }           // lu decompo ends
        
      
            
            System.out.println("The L Component is:");
                for(i=0; i<n; i++)
                {
                    for(j=0; j<n; j++)
                        System.out.print(" "+l[i][j]);
                    System.out.println();
                }
                System.out.println("The U Component is:");
                for(i=0; i<n; i++)
                {
                    for(j=0; j<n; j++)
                        System.out.print(" "+u[i][j]);
                    System.out.println();
                }
          
                /** Front substitution **/
        
        double[] solution = new double[n];
        for (i = 0; i < n ; i++) 
        {
            double sum = 0.0;
            
            for (j = 0; j < i; j++) 
                sum += l[i][j] * solution[j];
           
            solution[i] = (constants[i][0] - sum) / l[i][i];
        }      
        System.out.println("Matrix yyyyyyyyy is: ");
            for( i=0; i<n; i++)
            {
                
                System.out.print("  "+ solution[i]);
            }
        
   
        
         /** back substitution **/
        double[] solution2 = new double[n];
        for ( i = n - 1; i >= 0; i--) 
        {
            double sum = 0.0;
            
            for (j = i + 1; j < n; j++) 
                sum += u[i][j] * solution2[j];
           
            solution2[i] = (solution[i] - sum) / u[i][i];
        }        
    System.out.println("\nMatrix  is xxxxxx");
            for( i=0; i<n; i++)
            {
                
                System.out.print("  "+ solution2[i]);
            }
            return solution2;
        }// try blocks ends
    
    }//main ends 
}//class ends
 
 
 
            
             

                
                
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
