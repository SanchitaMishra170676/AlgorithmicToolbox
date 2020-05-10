import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int w, double[][] A,int n) {
        double value = 0;
        //write your code here
        for (int i=0;i<n-1;i++)
        {
        	int max =i;
        	for (int j=i+1;j<n;j++)
        	{
        		if (A[j][0] > A[max][0])
        			max = j;
        	}
        	double temp1 = A[max][0];
        	double temp2 = A[max][1];
        	A[max][0] = A[i][0];
        	A[max][1] = A[i][1];
        	A[i][0] = temp1;
        	A[i][1]= temp2;
        	
        	//System.out.println(A[i][0] +" "+ A[i][1]);
        	
        }
         //System.out.println(A[n-1][0] +" "+ A[n-1][1]);
        
        for (int i=0;i<n && w>0;i++)
        {
        	
        	double a = Math.min(w,A[i][1]);
        	w -= a;
        	value += a* A[i][0];
        	
        	//System.out.println(value + " " + w);
        }
        
        
        

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        double A[][] = new double[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = scanner.nextDouble();
            A[i][1] = scanner.nextDouble();
        }
        for (int i=0; i<n;i++)
        {
        	A[i][0] = A[i][0] / A[i][1];
        }
        System.out.println(getOptimalValue(capacity, A,n));
    }
} 
