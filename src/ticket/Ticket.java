/*
Omar Vergara (20438054)
CSCI 3340-02
Project 3
2/23/2018
*/

package ticket;

/**
 * This class is an object representing a ticket.
 * @author trick
 */
public class Ticket {   
    private String license;
    private String state;
    private String permit;
    private String makeModel;
    private String color;
    private String reason;
    private String date;
    private String time;
    private String location;
    private String issuer;
    private String paidStatus;
    
    /**
     * Empty constructor
     */
    public Ticket() {
    }
    
    /**
     * Ticket Constructor
     * @param license   string of the license plate number
     * @param state     string of the state
     * @param permit    string of the permit number
     * @param makeModel string of the make/model
     * @param color     string of the color
     * @param reason    string of the reason
     * @param date      string of the date
     * @param time      string of the time
     * @param location  string of the location
     * @param issuer    string of the issuer
     * @param paidStatus    string of the paid status
     */
    public Ticket(String license, String state, String permit, String makeModel,
            String color, String reason, String date, String time, String
                location, String issuer, String paidStatus) {
        this.license = license;
        this.state = state;
        this.permit = permit;
        this.makeModel = makeModel;
        this.color = color;
        this.reason = reason;
        this.date = date;
        this.time = time;
        this.location = location;
        this.issuer = issuer;
        this.paidStatus = paidStatus;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permit
     */
    public String getPermit() {
        return permit;
    }

    /**
     * @param permit the permit to set
     */
    public void setPermit(String permit) {
        this.permit = permit;
    }

    /**
     * @return the makeModel
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * @param makeModel the makeModel to set
     */
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * @param issuer the issuer to set
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * @return the paidStatus
     */
    public String getPaidStatus() {
        return paidStatus;
    }

    /**
     * @param paidStatus the paidStatus to set
     */
    public void setPaidStatus(String paidStatus) {
        this.paidStatus = paidStatus;
    }
}
