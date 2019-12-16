package org.optaplanner.examples.taskassigning.domain.location;
import org.optaplanner.examples.vehiclerouting.domain.VehicleRoutingSolution;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamInclude;

@XStreamAlias("VrpLocation")
@XStreamInclude({
        AirLocation.class,
        RoadLocation.class
})
public class TK_Location extends Location 
{
    protected String name = null;
    protected double latitude;
    protected double longitude;

    public TK_Location() 
    {
    }

    public TK_Location(long id, double latitude, double longitude) 
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getLatitude() 
    {
        return latitude;
    }

    public void setLatitude(double latitude) 
    {
        this.latitude = latitude;
    }

    public double getLongitude() 
    {
        return longitude;
    }

    public void setLongitude(double longitude) 
    {
        this.longitude = longitude;
    }

    public long getDistanceTo(Location location)
    {
    	return 11L;
    }

    public double getAirDistanceDoubleTo(Location location) 
    {
        // Calculation are based upon Haversine formula
    	// The math module contains a function named toRadians which converts from degrees to radians
        
        double lon1 = Math.toRadians(longitude); 
        double lon2 = Math.toRadians(location.longitude); 
        double lat1 = Math.toRadians(latitude); 
        double lat2 = Math.toRadians(location.latitude); 
        
        // Haversine formula  
        double dlon = lon2 - lon1;  
        double dlat = lat2 - lat1; 
        double a = Math.pow(Math.sin(dlat / 2), 2) 
                 + Math.cos(lat1) * Math.cos(lat2) 
                 * Math.pow(Math.sin(dlon / 2),2); 
              
        double c = 2 * Math.asin(Math.sqrt(a)); 
  
        // Radius of earth in kilometers. Use 3956  
        // for miles 
        double r = 6371; 
  
        // calculate the result
        
        //average speed over air is 68 kilometer per hour
        //return the time in minutes
        double speed = 68;
        return(c * r * 60 / speed);        
    }

    public double getAngle(Location location) 
    {
        // Euclidean distance (Pythagorean theorem) - not correct when the surface is a sphere
        double latitudeDifference = location.latitude - latitude;
        double longitudeDifference = location.longitude - longitude;
        return Math.atan2(latitudeDifference, longitudeDifference);
    }

    @Override
    public String toString() 
    {
        if (name == null) 
        {
          return super.toString();
        }
        
        return name;
    }
}