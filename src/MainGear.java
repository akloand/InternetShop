import All.GearBox;
import All.GearBoxType;

public class MainGear {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox(GearBoxType.AUTOMATIC);
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

