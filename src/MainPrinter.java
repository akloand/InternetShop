import All.Printer;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer1 = new Printer();

        printer1.append("\"Хороший документ\"");
        printer1.append("\"Не совсем хороший документ\"", "Второй док-нт", 5);
        printer1.append("\"Тоже не совсем хороший документ\"", "Четвертый док-нт", 6);
        printer1.append("\"О чем-то интересном\"", "Третий док-нт");

        printer1.print();

        //printer1.clear();
        printer1.print();
        printer1.getPendingPagesCount();
        
    }
}
