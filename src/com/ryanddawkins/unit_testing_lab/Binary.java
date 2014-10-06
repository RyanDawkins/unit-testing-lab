package com.ryanddawkins.unit_testing_lab;

/**
 * Created by dawkins on 10/2/14.
 */
public class Binary
{

    private int number;

    /**
     *
     * @param       binaryString A binary string representation of a base 10 number
     * @exception   InvalidBinaryNumberException an exception to be thrown if a binary string isn't all that great
     */
    public Binary(String binaryString) throws InvalidBinaryNumberException
    {
        try {
            this.number = Integer.parseInt(binaryString, 2);
        } catch (NumberFormatException e) {
            throw new InvalidBinaryNumberException();
        }
    }

    /**
     * Method to get the base 10 value
     * @return  a base 10 value of the string
     */
    public int getBase10()
    {
        return this.number;
    }

    /**
     *
     * @return
     */
    public String getBase2()
    {
        return Integer.toBinaryString(this.number);
    }

    /**
     * Adds the binary string to the object, returns this reference
     * @param binaryString
     * @return
     */
    public Binary add(String binaryString)
    {
        return add(new Binary(binaryString));
    }

    /**
     * Chainable add method, returns reference to this
     * @param binary
     * @return this
     */
    public Binary add(Binary binary)
    {
        this.number = binary.getBase10();
        return this;
    }

}
