/**
 * Write a description of class Die here.
 *
 * @author Ben Knell
 * @version 2021-2-2
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = this.roll();
    }

    /**
     * @return a random number between 1 and 6
     */
    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    
    /**
     * @return the most recent roll
     */
    public int getResult()
    {
        return roll;
    }
}
