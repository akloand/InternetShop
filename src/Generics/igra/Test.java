package Generics.igra;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 15);
        Schoolar schoolar2 = new Schoolar("Tonya", 19);
        Schoolar schoolar3 = new Schoolar("2Ivan", 15);
        Schoolar schoolar4 = new Schoolar("2Tonya", 19);

        Student student1 = new Student("Oleg", 23);
        Student student2 = new Student("Olya", 20);

        Employee employee1 = new Employee("Nikola", 42);
        Employee employee2 = new Employee("Roma", 59);
        Employee employee3 = new Employee("2Nikola", 42);
        Employee employee4 = new Employee("2Roma", 59);


        Team<Schoolar> scholarTeam = new Team<>("КомандаШкольники");
        scholarTeam.addNewParticipant(schoolar1);
        scholarTeam.addNewParticipant(schoolar2);

//        scholarTeam.addNewParticipant(student1);

        Team<Schoolar> scholarTeam2 = new Team<>("КомандаШкольники22");
        scholarTeam.addNewParticipant(schoolar3);
        scholarTeam.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("КомандаСтуденты");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("КомандаРаботники");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Employee> employeeTeam2 = new Team<>("КомандаРаботники22");
        employeeTeam.addNewParticipant(employee3);
        employeeTeam.addNewParticipant(employee4);


        scholarTeam.playWith(scholarTeam2);
        employeeTeam.playWith(employeeTeam2);






    }
}
