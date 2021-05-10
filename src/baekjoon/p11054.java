package baekjoon;

import java.util.*;

public class p11054 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int n = input.nextInt();
       int[] dp = new int[n];
       int[] l_dp = new int[n];
       int[] r_dp = new int[n];
       
       for(int i=0; i<n; i++)
    	   dp[i] = input.nextInt();
       
       Arrays.fill(l_dp, 1);
       Arrays.fill(r_dp, 1);
       
       for(int i=0; i<n; i++) {
    	   for(int j=0; j<i; j++) {
    		   if(dp[i] > dp[j]) {    			   
    			   l_dp[i] = Math.max(l_dp[i], l_dp[j] + 1);
    		   }
    	   }
       }
       for(int i=n-1; i>=0; i--) {    	   
    	   for(int j=n-1; j>=i; j--) {
    		   if(dp[i] > dp[j]) {
    			   r_dp[i] = Math.max(r_dp[i], r_dp[j] + 1);
    		   }
    	   }
       }
       
       int max = 0;
       for(int i=0; i<n; i++) {
    	   max = Math.max(max, l_dp[i] + r_dp[i]);
       }
       System.out.println(max - 1);
       input.close();
    }
   
}