
import java.time.LocalDateTime;
import java.time.Duration;

public class RideRequest {
	private String passengerName;
    private String pickupLocation;
    private String destination;
    private LocalDateTime requestTime;
    private LocalDateTime assignedTime;


    public RideRequest(String passengerName, String pickupLocation, String destination) {
    	this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.requestTime = LocalDateTime.now();
        this.assignedTime = null;
 
    }

    public void assignNow() {
    	   assignedTime = LocalDateTime.now();
      
    }

    public long getWaitTimeSeconds() {
    	 if (assignedTime != null) {
             return Duration.between(requestTime, assignedTime).getSeconds();
          } else {
           return 0; //Note: this is just a dummy return value.
    }

}

    public String toString() {
    	 return "Ride Request Details:\n" +
                 "Passenger: " + passengerName + "\n" +
                 "Pickup: " + pickupLocation + "\n" +
                 "Destination: " + destination + "\n" +
                 "Requested at: " + requestTime + "\n" +
                 "Assigned at: " + (assignedTime != null ? assignedTime : "Not yet assigned");
      }
  }

