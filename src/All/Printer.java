package All;

import java.util.function.ToDoubleBiFunction;

public class Printer {
    private String queue = "";
    private int totalPage = 0; //стр.
    private int limitPages; //стр. в принтере
    private int pages = 0;

    public void append(String text) {
        queue = queue + "\nТекст документа: " + text;
    }

    public void append(String text, String nameDoc) {
        queue = queue + "\nТекст документа: " + text + " - " + nameDoc;
    }

    public void append(String text, String nameDoc, int pages) {
        queue = queue + "\nТекст документа: " + text + " - " + nameDoc + " - " + pages + " стр.";
        this.pages += pages;
        totalPage = totalPage + pages;
    }

    public void clear() {
        queue = "";
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("\n\u26D4 Очередь печати пуста \u26D4");
        }
        System.out.println(queue);
        queue = "";

    }

    public void getPendingPagesCount() {
        System.out.println("Напечатано: " + totalPage + " стр.");
    }

}
