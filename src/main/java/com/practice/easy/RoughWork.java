package com.practice.easy;

import java.util.HashMap;
import java.util.Map;

public class RoughWork {
    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairsHelper(n, memo);
    }
    
    private static int climbStairsHelper(int n, Map<Integer, Integer> memo) {
        if (n <= 2) {
            return n;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int ways = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        memo.put(n, ways);
        
        return ways;
    }

    public static void main(String[] args) {
        int n2 = 4;
        System.out.println("Distinct ways to climb " + n2 + " steps: " + climbStairs(n2));
    }
}