import java.util.Date;

/**
 * Created by Brendon on 3/17/16.
 */
public class WaterHeater extends ServiceCall {

    protected int heaterAge;
    private static double mandatoryCharge = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int heaterAge) {
        super(serviceAddress, problemDescription, date);
        this.heaterAge = heaterAge;
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + mandatoryCharge);

        return "Water Heater Service call." + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;


    }
}
