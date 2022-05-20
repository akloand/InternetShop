public class TestStackShield {
    private int stack[];
    private int tos;


    /// Герберт Шилдт страница 206-207

    TestStackShield(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Стек заполнен "+item);

        } else stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек загружен");
            return 0;
        } else return stack[tos--];
    }


    public static void main(String[] args) {
        TestStackShield myStack1 = new TestStackShield(5);
        TestStackShield myStack2 = new TestStackShield(8);

        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
}
}
