package ictgradschool.industry.controlflow.coderunner;

/**
 * Please run TestCodeRunner to check your answers
 */
public class CodeRunner {

    /**
     * Q1. When given an integer, return an integer that is the reverse (its
     * numbers are in reverse to the input).
     * order.

     * @param number
     * @return the integer with digits in reverse order
     */
    public int reverseInt(int number) {
        int reverseNum = 0;

        boolean isNegative = (number < 0 );
        int positiveNumber = Math.abs(number);

        while (positiveNumber > 0){
            int ones = positiveNumber % 10;
            positiveNumber /= 10;
        }





        return reverseNum;
    }
    /** reverseInt(int) => void **/



    /**
     * Q2. Determines the Excel column name of the given column number.
     *
     * @param num
     * @return the column title as a String
     */
    public String convertIntToColTitle(int num) {
        String columnName = "";

        if(num <= 0){
            System.out.println("Input is invaild");

            else (num > 0){


            }

        }
        //
        return columnName;
    }
    /** convertIntToColTitle(int) => void **/



    /**
     * Q3. Determine if the given string is a palindrome (case folded).
     *
     * @param str
     * @return true if string is palindrome, false otherwise
     */
    public boolean isStringPalindrome(String str) {
        //
        return false;
    }
    /** isStringPalindrome(String) => boolean **/


    /**
     * Q4. Generate a space separated list of all the prime numbers from 2
     * to the highest prime less than or equal to the given integer.
     *
     * @param num
     * @return the primes as a space separated list
     */
    public String printPrimeNumbers(int num) {


        }
        String primesStr = "";

        //
        return primesStr;
    }
}
