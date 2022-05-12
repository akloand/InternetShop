import All.Country;

public class MainCountryGetterSetter {

    public static void main(String[] args) {

        String nameCapital, name;
        int population;
        double square;


        Country country = new Country("India");
        country.setNameCapital("Индия");
        country.setName("Дели");
        country.setPopulation(50600000);
        country.setSquare(123485.568);
        country.setSeaBorder(true);

        nameCapital = country.getNameCapital();
        name = country.getName();
        square = country.getSquare();
        population = country.getPopulation();
        //seaBorder = country.isSeaBorder();
        String seaBorder = country.isSeaBorder() ? "Граничит с морем" : "Не граничит с морем";

        System.out.println("Страна: " + nameCapital + "\nСтолица: " + name + "\nНаселение: " + population + " человек\nПлощадь: " + square + " м²\nНаличе моря: " + seaBorder);

    }

}
