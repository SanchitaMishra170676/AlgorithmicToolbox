import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] A) {
    	int currFill =0, lastFill, fill=0;
    	if (dist> A[A.length-2])
    		A[A.length-1] = dist;
    		
//    	for (int i: A)
//    	{
//    		System.out.println(i);
//    	}
    		while (A[currFill] < dist)
    	{
    		lastFill = currFill;
    	//	System.out.println("lastfill = "+ lastFill + "currfill = "+ currFill);
    		//System.out.println((A[currFill+1]- A[lastFill]) + "<= tank");
    		while (A[currFill] < dist && A[currFill+1]- A[lastFill] <= tank)
    		{
    			currFill++;
    			//System.out.println(currFill);
    		}
    		
    		//System.out.println("last currfill = "+currFill);
    		
    		if (currFill == lastFill )
    			return -1;
    		if (A[currFill] < dist)
    			{fill++;
    			//System.out.println("fill = "+fill);
    			
    			}
    		
    	}
    			
    	
        return fill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        stops[0]=0;
        for (int i = 1; i < n+1; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}

