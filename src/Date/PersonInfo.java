package Date;

import java.time.LocalDate;
import java.time.Period;

public class PersonInfo {

    private String name = "";
    private String surName = "";
    private int year;
    private int month;
    private int day;

    public PersonInfo(String name, String surName, int year, int month, int day) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void info() {
        LocalDate birthday = LocalDate.of(this.year, this.month, this.day);
        Period period = birthday.until(LocalDate.now());
        System.out.println(name +" "+surName +" родился - "+birthday +", ему: "+period.getYears()+" лет "+period.getMonths()+" месяцев "+period.getDays()+" дней");
    }

}
