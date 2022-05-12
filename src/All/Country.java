package All;

public class Country {

    private String name;
    private int population;
    private double square;
    private String nameCapital;
    private boolean seaBorder;

    public Country(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isSeaBorder() {
        return seaBorder;
    }

    public void setSeaBorder(boolean seaBorder) {
        this.seaBorder = seaBorder;
    }
}
