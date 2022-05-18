package Animal;

public class Cat extends Animal {

    String name = "кошка";


    @Override
    public void voice() {
        System.out.println("Мяу");;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
