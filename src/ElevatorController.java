import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElevatorController
{
    public static final int TOTAL_DESIRED_FLOORS = 100;
    public static final int  MIN_FLOOR = 1;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";

    // 0 means not request
    private Map<Integer, String> requestMadeFloors = new HashMap<Integer, String>();
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

    public void setRequestMadeFloorNumber(int requestMadeFloor, String requestDirection)
    {
        if (requestMadeFloor >= TOTAL_DESIRED_FLOORS && UP.equals(requestDirection) || requestMadeFloor < MIN_FLOOR && DOWN.equals(requestDirection))
            return;

        requestMadeFloors.put(requestMadeFloor, requestDirection);


        this.requestMadeFloor = requestMadeFloor;

    }

    public String getRequestDirection()
    {
        return this.requestDirection;
    }

    public Elevator getClosesElevatorAvailable()
    {

    }

}
