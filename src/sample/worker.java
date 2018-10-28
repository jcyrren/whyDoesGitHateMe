package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class worker {
    private String name;
    private int age;
    private float wage;
    private int hours = 0;
    private String bankAccount;

    private boolean ageVerified;
    private boolean payVerified;
    private boolean paidOnTime;

    private LocalDate birthday;
    private LocalDate dateLastPaid;

    private static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public worker (String name, int age, float wage, String bankAccount) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.bankAccount = bankAccount;

        this.ageVerified = false;
        this.payVerified = false;
        this.paidOnTime = false;


    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBankAccount() { return bankAccount; }

    public void setMonthlyHours(int newHours) {
        hours = newHours;
    }

    public void addHours(int addedHours) {
        hours += addedHours;
    }

    public float getExpectedPay(){
        return wage * hours;
    }

    public void verifyAge(){
        ageVerified = true;
    }

    public void verifyPaidOnTime(){
        paidOnTime = true;
    }

    public void verifyPay(){
        payVerified = true;
    }

    public boolean overallVerity(){
        return (ageVerified && payVerified && paidOnTime);
    }

    public boolean ageVerity() { return  ageVerified; }

    public boolean payVerity() { return payVerified; }

    public boolean timeVerity() { return paidOnTime; }






}