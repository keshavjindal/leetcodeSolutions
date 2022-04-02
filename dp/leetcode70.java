import java.util.Arrays;

public class leetcode70 {
    public int climbStairs(int n) 
    {
        dp = new int[n + 10];
        Arrays.fill(dp , -1);
        
        return solve(n);
    }
    
    public int[] dp;
    
    public int solve(int n){
        if(n == 0) return 1;
        if(n < 0) return 0;
        
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = solve(n - 1) + solve(n - 2);
    }
}