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
        return elevatorLocations.get(floor);
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

    public Elevator getClosestElevatorAvailable(int floor)
    {
        Elevator closestElevator = getElevatorFloor(floor);
        if (closestElevator != null && Elevator.WAITING.equals(closestElevator.getStatus()))       //The exception is that if an unoccupied elevator is already stopped at that floor, then it will always have the highest priority answering that call.
        {
            return closestElevator;
        }

        Iterator iterator = elevatorLocations.entrySet().iterator();
        int distance = 0;
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Elevator> floorElevator = (Map.Entry)iterator.next();

            int floorNumber = floorElevator.getKey();
            Elevator elevator = floorElevator.getValue();
            if (distance != 0)
                distance = Math.abs(floor - floorNumber);
            else

        }

    }

}
