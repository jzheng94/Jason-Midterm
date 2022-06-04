package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 10;
        int factorialRecursionAnswer = factorialRecursion(num);
        int factorialIterateAnswer = factorialIteration(num);
        System.out.println("The factorial of " + num + " via recursion is " + factorialRecursionAnswer);
        System.out.println("The factorial of " + num + " via iteration is " + factorialIterateAnswer);
    }

    private static int factorialIteration(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int answer = 1;
        for (int i = 2; i <= num; i ++) {
            answer *= i;
        }
        return answer;
    }

    private static int factorialRecursion(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorialRecursion(num-1);
    }
}

