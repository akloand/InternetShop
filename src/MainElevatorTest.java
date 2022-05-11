import All.ElevatorTest;

import java.util.Scanner;

public class MainElevatorTest {
    public static void main(String[] args) {

        ElevatorTest elevator = new ElevatorTest(-3, 20);

        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}
