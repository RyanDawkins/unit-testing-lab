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
        if(badInputShouldExplode()) {
            System.out.println("Bad Input test cases ran successfully.");
        } else {
            System.out.println("Bad Input test cases failed.");
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

}
