package test;

import com.ryanddawkins.unit_testing_lab.Binary;
import com.ryanddawkins.unit_testing_lab.InvalidBinaryNumberException;

/**
 * Created by dawkins on 10/2/14.
 */
public class BinaryTest
{

    public static void main(String[] args)
    {

        boolean passed = true;

        if(badInputShouldExplode()) {
            System.out.println("Bad Input test cases ran successfully.");
        } else {
            System.out.println("Bad Input test cases failed.");
            passed = false;
        }

        if(testingBase10()) {
            System.out.println("Base 10 test cases ran successfully.");
        } else {
            System.out.println("Base 10 test cases failed.");
            passed = false;
        }

        if(passed) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("One or more tests failed.");
        }
    }

    public static boolean badInputShouldExplode()
    {
        // For this first test, we are testing to see that the Binary class
        // will return an error if we send in invalid input
        //
        // Hint: The exception that will be thrown is InvalidBinaryNumberException

        // TODO
        // Write a unit test to check if the Binary class fails for some string of text
        // Example: "Hello World"
        String helloWorld = "";
        try {
            Binary binary = new Binary(helloWorld);
            return false;
        } catch(InvalidBinaryNumberException e) {
        }

        // TODO
        // Write a unit test to check if the Binary class fails for some string of integers
        // Example: "123456789"
        String numbers = "";
        try {
            Binary binary = new Binary(numbers);
            return false;
        } catch(InvalidBinaryNumberException e) {
        }

        // TODO
        // Write a unit test to check if the Binary class fails for some empty string
        // Example: ""
        String emptyString = "";
        try {
            Binary binary = new Binary(numbers);
            return false;
        } catch(InvalidBinaryNumberException e) {
        }

        // TODO
        // If the test reached this point we have no more test cases?
        // What should we return?
        return true;
    }

    public static boolean testingBase10()
    {
        // Here we are going to test base 10 numbers, and see if the Binary class can represent them correctly.
        // Our integers are not expected to be able to hold negative values. So as a placeholder for t1_expected
        // I will place a negative value when I want you to tell me what the expected value should be.

        // Case 1: "0" base 2 converts to 0 base 10
        String t1_input = "0";
        int t1_expected = 0;
        Binary t1_binary = new Binary(t1_input);
        if(t1_expected != t1_binary.getBase10()) {
            return false;
        }

        // Case 2: "1" base 2 converts to 1 base 10
        String t2_input = "1";
        int t2_expected = -1;
        Binary t2_binary = new Binary(t1_input);
        if(t2_expected != t2_binary.getBase10()) {
            return false;
        }

        return true;
    }

}
