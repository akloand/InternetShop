package Date;

public class MainPersonInfo {
    public static void main(String[] args) {

        PersonInfo dima = new PersonInfo("Dima", "Bosh", 2011, 10, 21);
        PersonInfo andy = new PersonInfo("Andy", "Bosh", 1983, 01, 27);
        PersonInfo test = new PersonInfo("Mama", "Bosh", 1961, 05, 30);

        dima.info();
        andy.info();
        test.info();

    }
}
