
/**
 * The AmPmDisplay class represents the acronym that means when the time is before midday (AM) or after digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the limit.
 * 
 * @author Clarissa Alves Soares
 * @version 2016.08.04
 */
public class AmPmDisplay
{
    private String acronym;

    /**
     * Constructor for objects of class AmPmDisplay.
     * Set value as "AM".
     */
    public AmPmDisplay()
    {
        acronym = "AM";
    }
    
    public AmPmDisplay(String acronym)
    {
        this.acronym = acronym;
    }

    /**
     * Return the current value.
     */
    public String getAcronym()
    {
        return acronym;
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    /**
     * Set the value of the display to the new specified value. If the new
     * value is diferent of "AM" or "PM", do nothing.
     */
    public void setAcronym(String replacementAcronym)
    {
    if((replacementAcronym == "AM") || (replacementAcronym == "PM")) {
            acronym = replacementAcronym;
        }
    }
    
    public String getAmPMDisplay(int hour)
    {
     if(hour < 12){
         setAcronym("AM");
     }
     else{
         setAcronym("PM");
     }
     
     return getAcronym();
    }
}
