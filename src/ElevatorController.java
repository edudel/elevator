import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class ElevatorController
{
    public static final int TOTAL_DESIRED_FLOORS = 100;
    public static final int  MIN_FLOOR = 1;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";

    // 0 means not request
    private Map<Integer, String> requestMadeFloors = new HashMap<Integer, String>();
    private Map<Integer, Vector<Elevator>> elevatorLocations = new HashMap<Integer, Vector<Elevator>>();

    public void setElevatorFloor(Elevator elevator, int floor)
    {
        Vector<Elevator> elevators = elevatorLocations.get(floor);
        if (elevators != null)
            elevators.add(elevator);
        else
        {
            elevators = new Vector<Elevator>();
            elevators.add(elevator);
        }
        elevatorLocations.put(floor, elevators);
    }


    public Vector<Elevator> getElevatorFloor(int floor) // list of elevators by floor
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
        Vector<Elevator> closestElevators = getElevatorFloor(floor);
        for (Elevator closestElevator : closestElevators)
        {
            // send the first one found. we can take into accoutn weight as well. or trips
            if (closestElevator != null && Elevator.WAITING.equals(closestElevator.getStatus()) && closestElevator.getDoorStatus())       //The exception is that if an unoccupied elevator is already stopped at that floor, then it will always have the highest priority answering that call.
                return closestElevator;
        }


        Iterator iterator = elevatorLocations.entrySet().iterator();
        int distance = 0;
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Vector<Elevator>> floorElevator = (Map.Entry)iterator.next();

            int floorNumber = floorElevator.getKey();
            Vector<Elevator> elevators = floorElevator.getValue();

            for (Elevator closestElevator : closestElevators)
            {
                if (floor == closestElevator.getCurrentFloor() && )
                //the unoccupied elevator closest to it will answer the call, unless an occupied elevator is moving and will pass that floor on its way. The exception is that if an unoccupied elevator is already stopped at that floor, then it will
                //always have the highest priority answering that call.
                int currentDistance = Math.abs(floor - floorNumber);

                if (distance != 0 && distance > )
                    distance
            }




        }

    }

}
