package com.rgor.PicoPlacaPreditor.DAO;
import com.rgor.PicoPlacaPreditor.Entity.Vehicle;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;
/**
 *
 * @author rortiz
 */
public interface VehicleInterface {
    public String getRestrictedDay(Vehicle vehicle);
    public String extractNumberPlate(String plate);

    
}
