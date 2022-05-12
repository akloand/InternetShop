import All.GearBox;

public class MainGear {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox();
        gearBox.switchNeutral();
        System.out.println(gearBox.getCurrentGear());
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.shiftUp();
        System.out.println(gearBox.getCurrentGear());
        gearBox.switchNeutral();
        gearBox.switchRear();
        System.out.println(gearBox.getCurrentGear());

    }
}

