package cs2340team64.dirtyrat.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by diogo on 10/12/2017.
 */

public class Report implements Comparable<Report>, Serializable {
    private long Unique_Key;
    private double Latitude;
    private double Longitude;
    private String City;
    private String Borough;
    private String Incident_Address;
    private String Incident_Zip;
    private String Location_Type;
    private String Created_Date;

    public static List<String> allPropertyTypes = Arrays.asList(
            "Vacant Lot",
            "Commercial Building",
            "1-2 Family Dwelling",
            "3+ Family Apt. Building",
            "3+ Family Mixed Use Building",
            "Catch Basin/Sewer",
            "Other (Explain Below)"
    );

    /**
     * Comparable override, sorts (descending) by date then unique key
     * @param other the report to compare this to
     * @return int representing the comparison
     */
    @Override
    public int compareTo(Report other) {
        // temporary: later should probably group by distance from the user
        return (int) (other.getUnique_Key() - this.Unique_Key);
    }

    /**
     * Equals override
     * @param other object to compare
     * @return true if objects are equal (ie. have the same key)
     */
    @Override
    public boolean equals(Object other) {
        return other != null && other instanceof Report && ((Report) other).getUnique_Key() == Unique_Key;
    }

    /**
     * toString override
     * @return String representation with the report's key
     */
    @Override
    public String toString() {
        return "Rat Sighting Report #" + Unique_Key;
    }

    /**
     * --- GETTERS AND SETTERS ---
     */
    public long getUnique_Key() {
        return Unique_Key;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public String getCity() {
        return City;
    }

    public String getBorough() {
        return Borough;
    }

    public String getIncident_Address() {
        return Incident_Address;
    }

    public String getIncident_Zip() {
        return Incident_Zip;
    }

    public String getLocation_Type() {
        return Location_Type;
    }

    public String getCreated_Date() {
        return Created_Date;
    }

    public void setUnique_Key(long unique_Key) {
        Unique_Key = unique_Key;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setBorough(String borough) {
        Borough = borough;
    }

    public void setIncident_Address(String incident_Address) {
        Incident_Address = incident_Address;
    }

    public void setIncident_Zip(String incident_Zip) {
        Incident_Zip = incident_Zip;
    }

    public void setLocation_Type(String location_Type) {
        Location_Type = location_Type;
    }

    public void setCreated_Date(String created_Date) {
        Created_Date = created_Date;
    }

}

