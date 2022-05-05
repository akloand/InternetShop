package All;

public class Printer {
    private String queue = "";
    private int totalPage = 0;
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
    }

    public void clear() {
        queue = "";
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("\nОчередь печати пуста");
        }
        System.out.println(queue);
        queue = "";

    }

    public void getPendingPagesCount() {
        totalPage = totalPage + pages;
        System.out.println("\nНапечатано: "+totalPage+" стр.");
    }

}
