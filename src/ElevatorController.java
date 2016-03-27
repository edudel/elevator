import java.util.HashMap;
import java.util.Map;

public class ElevatorController
{
    public static final int TOTAL_DESIRED_FLOORS = 100;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";

    // 0 means not request
    private int requestMadeFloor = 0;
    private String requestDirection;
    private Map<Elevator, Integer> elevatorLocations = new HashMap<Elevator, Integer>();

    public void setElevatorFloor(Elevator elevator, int floor)
    {
        elevatorLocations.put(elevator, floor);
    }

    //another approach could also be by name and then in the main class use the name to get the elevator object
    public int getElevatorFloor(Elevator elevator)
    {
        int floor = 0; // if 0 means the elevator was not found
        if (elevatorLocations.get(elevator)!= null)
            floor = elevatorLocations.get(elevator);
        return floor;
    }

    public int getRequestMadeFloorNumber()
    {
        return this.requestMadeFloor;
    }

    public int setRequestMadeFloorNumber(int requestMadeFloor, String requestDirection)
    {
        if (requestMadeFloor >= TOTAL_DESIRED_FLOORS && UP.equals(requestDirection))
            return 0;
        return this.requestMadeFloor = requestMadeFloor;
    }

    public String getRequestDirection()
    {
        return this.requestDirection;
    }

}
