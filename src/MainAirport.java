import com.skillbox.airport.Airport;

public class MainAirport {

    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        System.out.println("Терминалы: " + airport.getTerminals());
        System.out.println("Самолеты: " + airport.getAllAircrafts());

        int lenghtJet = airport.getAllAircrafts().toArray().length;
        int lenghtTerminal = airport.getTerminals().toArray().length;
        int arrayJet[] = new int[lenghtJet];
        System.out.println("Количество терминалов: " + lenghtJet);
        System.out.println("Количество самолетов: " + lenghtTerminal);
//        for (int i = 0; i < lenghtJet ; i++) {
//            arrayJet[i] = airport.getAllAircrafts();
//
//        }

    }
}

