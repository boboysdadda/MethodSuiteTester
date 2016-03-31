/**
 * Program: Method Suite Tester
 * FileName: MethodSuite.java
 * Author: James Dreier
 * Date: 31 March 2016
 * Description: A set of methods for working with numbers to calculate sum, max, and average
 *
 */
class MethodSuite {
    /**
     * Get the max of two integers
     * @param a first integer
     * @param b second integer
     * @return The larger of 2 integers
     */
    public static int max(int a, int b){
        if (a > b) return a;
        else return b;
    }

    /**
     * Get the max of an int array
     * @param numberArray an array of int
     * @return The largest number in the array
     */
    static int max(int[] numberArray){
       int b = 0;
        for (int a:numberArray) {
            if (b < a){
                b = a;
            }
        }
        return b;
    }

    /**
     * Get the average of a double array
     * @param numberArray an array of double
     * @return the average of the array
     */
    public static double average(double[] numberArray){
        double result=0.0;
        double b = 0.0;
        for (double a : numberArray) {
            b += a;
            result = b/numberArray.length;
        }
        return result;
    }

    /**
     * Get the sum of an double array
     * @param numberArray an array of double
     * @return the sum of the array
     */
    public static double total(double[] numberArray){
        double b =  0.0;
        for(double a: numberArray){
            b += a;
        }
        return b;
    }
}
