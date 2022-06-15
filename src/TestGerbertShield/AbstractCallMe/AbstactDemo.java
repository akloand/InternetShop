package TestGerbertShield.AbstractCallMe;

public class AbstactDemo {
    public static void main(String[] args) {
        B b = new B();

        A a = new A() {
            @Override
            void callme() {
                System.out.println("sdfsdfsdfsdf");
            }
        };


        b.callme();
        b.callMeTo();

        a.callme();
        a.callMeTo();

    }
}
