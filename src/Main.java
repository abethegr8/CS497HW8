public class Main {
    public static void main(String[] args) {

        // Driver for Q1:
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println(CourseSchedule2.findOrder(numCourses, prerequisites));
        // OUTPUT: [0,1]

        // Driver for handling Q2:
        int dividend = 10;
        int divisor = 3;
        System.out.println(Divide.divide(dividend, divisor));
        // Output: 3

        // Driver for handling Q3:
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(CoinChange.coinChange(coins, amount));
        // Output: 3


    }
}
