public class Elevator {


    private int currentFloor = 1;
    private int floor;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    private void moveUp(int floor) {
         while (currentFloor < floor) {
            currentFloor++;
            System.out.println(currentFloor);
        }

    }

    private void moveDown(int floor) {
        while (currentFloor > floor) {
            currentFloor--;
            System.out.println(currentFloor);
        }

    }


    public int getCurrentFloor(){
        return currentFloor;
    }

    public void move (int floor) {
        if (floor == currentFloor) {
            System.out.println("You are on " + floor + "floor");
        } else if (floor > currentFloor && floor <= maxFloor) {
            moveUp(floor);
        } else if (floor < currentFloor && floor >= minFloor)  {
            moveDown(floor);
        }
        else{
            System.out.println("Enter right floor");
        }
    }

}
