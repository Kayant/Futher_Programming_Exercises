/**
 *
 * @author Kayant
 * @version 1.1 Refactor variable names to be less vague and meaningless.  
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
     * @param newValue Amount to be added to current value 
     */
    public void addToValue(Sterling newValue){
        this.value += newValue.getValue();
    }
    
    /**
     * Casting is used as we don't care too much about the lose in precision 
     * we just need the calculated percentage as an int to add to our current value 
     * @param perChange Percentage of current value to be added 
     */
    public void changeByPercentage(double perChange){
        this.value = (int)(this.value*perChange/100);
    }
}
