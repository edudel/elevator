
public class Elevator
{
    public static final int TOTAL_DESIRED_FLOORS = 100;
    public static final int  MIN_FLOOR = 1;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";
    public static final String WAITING = "WAITING";

    private int currentFloor = 1;
    private boolean openedDoors = false;
    private String status = "WAITING";

    public Elevator(int currentFloor, boolean openedDoors, String status)
    {
        this.currentFloor = currentFloor;
        this.openedDoors = openedDoors;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public boolean getDoorStatus()
    {
        return this.openedDoors;
    }

    public void setDoorStatus(boolean openedDoors)
    {
        this.openedDoors = openedDoors;
    }

}

