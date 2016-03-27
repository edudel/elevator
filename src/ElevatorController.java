import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ElevatorController
{
    public static final int TOTAL_DESIRED_FLOORS = 100;
    public static final int  MIN_FLOOR = 1;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";

    // 0 means not request
    private Map<Integer, String> requestMadeFloors = new HashMap<Integer, String>();
    private Map<Integer, Elevator> elevatorLocations = new HashMap<Integer, Elevator>();

    public void setElevatorFloor(Elevator elevator, int floor)
    {
        elevatorLocations.put(floor, elevator);
    }

    //another approach could also be by name and then in the main class use the name to get the elevator object
    public Elevator getElevatorFloor(int floor)
    {
        int floor = 0; // if 0 means the elevator was not found
        if (elevatorLocations.get(floor)!= null)
            floor = elevatorLocations.get(floor);
        return floor;
    }

    public Map<Integer, String> getRequestMadeFloors()
    {
        return this.requestMadeFloors;
    }

    public void setRequestMadeFloors(int requestMadeFloor, String requestDirection)
    {
        if (requestMadeFloor >= TOTAL_DESIRED_FLOORS && UP.equals(requestDirection) || requestMadeFloor < MIN_FLOOR && DOWN.equals(requestDirection))
            return;

        requestMadeFloors.put(requestMadeFloor, requestDirection);
    }

    public Elevator getClosestElevatorAvailable()
    {
        Iterator iterator = elevatorLocations.entrySet().iterator();
            while (iterator.hasNext())
            {
                Map.Entry pair = (Map.Entry)iterator.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());

            }

    }

}
