package CourierService;

public class MainCourierServices {



    public static void main(String[] args) {

        CourierService courierService = new CourierService();
        courierService.setFlip(true);
        courierService.setAddress("Moscow city");
        courierService.setFragile(true);
        courierService.setWeight(55);



        Dimensions dimensions = new Dimensions(5, 5, 5, courierService);

        System.out.println(dimensions);
        System.out.println(dimensions.volume());


    }
}
