package Elevator;

import java.util.Scanner;

public class MainElevator {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3, 20);

        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move1(floor);
        }

    }
}
