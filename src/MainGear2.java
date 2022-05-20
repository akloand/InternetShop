import All.GearBox;
import All.GearBoxType;

public class MainGear2 {
    public static void main(String[] args) {

        GearBoxType type = GearBoxType.valueOf("ROBOT");
        GearBox gearBox = new GearBox(GearBoxType.ROBOT);

        System.out.println(gearBox.getType());
    }
}
