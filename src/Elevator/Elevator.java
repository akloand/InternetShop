package Elevator;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;
    private String yourFloor = "Этаж: ";
    private String youArrived = " - Вы приехали!!!";


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

//    public boolean rangeFloor() {
//        if (currentFloor ) {
//        }
//    }

    public void move1(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Такого этажа не существует!!!");
        } else if (floor == currentFloor) {
            System.out.println("Указан текущий этаж: " + currentFloor);
        } else if (floor > currentFloor) {
            while (true) {
                moveUp();
                if (currentFloor != 0) {
                    System.out.println(yourFloor + currentFloor);
                }
                if (floor == currentFloor) {
                    break;
                }
            }
            System.out.println(youArrived);
        } else if (floor < currentFloor) {
            while (true) {
                moveDown();
                if (currentFloor != 0) {
                    System.out.println(yourFloor + currentFloor);
                }
                if (floor == currentFloor) {
                    break;
                }
            }
            System.out.println(youArrived);
        }

//        if (currentFloor <= floor && (floor <= maxFloor) && (floor >= minFloor)) {
//            for (int i = currentFloor; i < floor; i++) {
//                System.out.println(yourFloor + i);
//            }
//            System.out.println(yourFloor + floor + youArrived);
//        } else if (currentFloor >= floor && (floor <= maxFloor) && (floor >= minFloor)) {
//            for (int i = currentFloor; i > floor; i--) {
//                System.out.println(yourFloor + i);
//            }
//            System.out.println(yourFloor + floor + youArrived);
//        } else {
//            System.out.println("Такого этажа не существует!!!");
//        }
//            if (floor <= maxFloor && floor >= minFloor) {
//        currentFloor = floor;
//    }


    }
}

