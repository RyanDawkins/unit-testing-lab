package test;

import com.ryanddawkins.unit_testing_lab.Binary;
import com.ryanddawkins.unit_testing_lab.InvalidBinaryNumberException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dawkins on 10/2/14.
 */
public class BinaryTest
{

    public static void main(String[] args)
    {
        badInputShouldExplode();
        System.out.println("Bad Input test cases ran successfully.");

        testingBase10();
        System.out.println("Base 10 test cases ran successfully.");
    }

    /**
     * This is a test to check if errors are thrown
     * Also it is an example for you.
     */
    @Test
    public static void badInputShouldExplode()
    {
        // For this first test, we are testing to see that the Binary class
        // will return an error if we send in invalid input
        //
        // Hint: The exception that will be thrown is InvalidBinaryNumberException

        // TODO
        // Write a unit test to check if the Binary class fails for some string of text
        // Example: "Hello World"
        try {
            String helloWorld = "";
            Binary t1 = new Binary(helloWorld);
        } catch (Throwable e) {
            Assert.assertTrue(e instanceof InvalidBinaryNumberException);
        }

        // TODO
        // Write a unit test to check if the Binary class fails for some string of integers
        // Example: "123456789"
        try{
            String numbers = "";
            Binary t2 = new Binary(numbers);
        } catch (Throwable e) {
            Assert.assertTrue(e instanceof InvalidBinaryNumberException);
        }

        // TODO
        // Write a unit test to check if the Binary class fails for some empty string
        // Example: ""
        try {
            String emptyString = "";
            Binary t3 = new Binary(emptyString);
        } catch (Throwable e) {
            Assert.assertTrue(e instanceof InvalidBinaryNumberException);
        }
    }

    /**
     * This is an example to test base 10 conversions
     */
    @Test
    public static void testingBase10()
    {
        // Here we are going to test base 10 numbers, and see if the Binary class can represent them correctly.
        // Our integers are not expected to be able to hold negative values. So as a placeholder for t1_expected
        // I will place a negative value when I want you to tell me what the expected value should be.

        // Case 1: "0" base 2 converts to 0 base 10
        String t1_input = "0";
        int t1_expected = 0;
        Binary t1_binary = new Binary(t1_input);
        Assert.assertEquals(t1_expected, t1_binary.getBase10());

        // Case 2: "1" base 2 converts to 1 base 10
        String t2_input = "1";
        int t2_expected = 1;
        Binary t2_binary = new Binary(t2_input);
        Assert.assertEquals(t2_expected, t2_binary.getBase10());
    }

    /**
     * This method is to test the addition method of the Binary class
     */
    @Test
    public static void shouldAdd()
    {
        // We need to test the addition that our binary representations can do.
        // Here you can use either the Binary.add(Binary) or the Binary.add(String)
        // probably should test Binary.add(String) because that will test both.

        // TODO Test Case 1: "0" + "0"
        // expected "0" or 0
        Binary a1 = null, b1 = null;
        int e1 = 0;
        Assert.assertEquals(a1.add(b1).getBase10(), e1);

        // TODO Test Case 2: "0" + "1"
        // expected "1" or 1

        // TODO Test Case 3: "10" + "1"
        // expected "11" or 3

        // TODO Test Case 4: "1111" + "1"
        // expected "10000" or 32
    }

    /**
     * Here we will test essentially the same things that you tested with base 10, except using the
     * Assert.getBase2() method, feel free to write your own tests that you think should happen.
     */
    public static void testingBase2()
    {
        // TODO your own test cases.
    }

}
