/**
 *
 * @author Kayant
 * @version 1.0
 */
public class Sterling {
    
    private int value = 0;
    
    /**
     * 
     * @param value Initialise value field with desired amount 
     */
    public Sterling(int value){
        this.value = value;
    }

    /**
     * 
     * @return Current amount stored 
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Use getValue method to get the value passed to v2 object then
     * add it to the current amount.
     * @param v2 Amount to be added to current value 
     */
    public void addToValue(Sterling v2){
        this.value += v2.getValue();
    }
    
    /**
     * Casting is used as we don't care too much about the lose in precision 
     * we just need the calculated percentage as an int to add to our current value 
     * @param d Percentage of current value to be added 
     */
    public void changeByPercentage(double d){
        this.value += (int)(this.value*d/100);
    }
}
