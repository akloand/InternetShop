package Animal;

public class MainAnimals {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animal = new Animal();


        cat.jump();
        cat.voice();

        dog.jump();
        dog.voice();

        animal.voice();


        String str1 = "I love Java";
        String str2 = str1.toUpperCase();


        String strTest = str1.replace("Java", "Python").toUpperCase().concat(" GHJAHN");

        System.out.println(str2);
        System.out.println(strTest);

    }

}
