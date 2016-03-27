
public class Elevator
{
    final int TOTAL_DESIRED_FLOORS = 100;
    int MIN_FLOOR = 1;


    private int currentFloor = 1;
    private boolean openedDoors = false;

    public Elevator(int currentFloor, boolean openedDoors)
    {
        this.currentFloor = currentFloor;
        this.openedDoors = openedDoors;

    }
    public boolean ElevatorUp()
    {

    }

    public boolean ElevatorDown()
    {

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

