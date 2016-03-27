
public class Elevator
{
    public static final int MAX_TRIPS  = 100;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";
    public static final String WAITING = "WAITING";


    private int currentFloor = 1;
    private boolean openedDoors = false;
    private String status = "WAITING";
    private String name;
    private int trip = 0;
    private boolean maintenanceMode = false;

    public Elevator(String name, int currentFloor, boolean openedDoors, String status)
    {
        this.name = name;
        this.currentFloor = currentFloor;
        this.openedDoors = openedDoors;
    }

    public String getTrips()
    {
        return this.status;
    }

    public void addTrip()
    {
        trip++;
        if (trip == MAX_TRIPS)
            maintenanceMode = true;
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

