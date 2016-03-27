
public class Elevator
{
    public static final int MAX_TRIPS  = 100;
    public static final String DOWN = "DOWN";
    public static final String UP = "UP";
    public static final String WAITING = "WAITING";
    public static final int MAX_WEIGHT  = 1000;       //lbs

    private int currentFloor = 1;
    private boolean openedDoors = false;
    private String status = WAITING;  // if an elevator status is waiting, then its unoccupied
    private String name;
    private int trip = 0;
    private boolean maintenanceMode = false;
    private long weight;

    public Elevator(String name, int currentFloor, boolean openedDoors, String status)
    {
        this.name = name;
        this.currentFloor = currentFloor;
        this.openedDoors = openedDoors;
        this.status = status;
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

    public void setCurrrentFloor(int currentFloor)
    {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor()
    {
        return this.currentFloor;
    }

    public long getWeight()
    {
        return this.weight;
    }

    public void setWeight(long weight)
    {
        this.weight = weight;
    }


}

