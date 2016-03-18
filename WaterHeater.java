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



}
