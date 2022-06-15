package TestGerbertShield.AbstractCallMe;

abstract class A {
    abstract void callme();

    void callMeTo() {
        System.out.println("Это конкретный метод класса A. ");
    }
}
