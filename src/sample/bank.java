package sample;

import java.util.*;

public class bank {
    private ArrayList<String> clients;
    private supplier workSource;
    private String name;

    private worker lastWorker;


    /*
    private worker[] workers() {
        worker[] ws = new workers[clients.size()];
        for (int i = 0; i < clients.size(); i ++) {
            ws[i] = workSource.
        }
    }
    */

    public bank (String name, supplier wS) {
        this.name = name;
        this.workSource = wS;
        lastWorker = null;
        clients = new ArrayList<>();
    }

    public boolean clientCheck(String accNumber) {
       // System.out.println(workSource.getName());
       // System.out.println(workSource.hasWorker("7"));
       // System.out.println(clients.contains("7"));
        return (workSource.hasWorker(accNumber) && clients.contains(accNumber));
    }

    public worker fetchWorker(String accNumber) {
        if (!clientCheck(accNumber) ) throw new RuntimeException("Worker does not exist");
        return workSource.getWorker(accNumber);
    }

    public void setActiveWorker(String accNumber) {
        if (!clientCheck(accNumber) ) throw new RuntimeException("Worker does not exist");
        lastWorker = workSource.getWorker(accNumber);
    }

    public worker getActiveWorker() {
        return lastWorker;
    }

    public String getName() {
        return name;
    }

    public void addClient(String bankAccount) {
        if (clients.contains(bankAccount)) throw new RuntimeException("Client already in the list");
        //System.out.println("Heyyyyyy");
        clients.add(bankAccount);
    }

    public void removeClient(String bankAccount) {
        for(String c: clients) {
            if(clients.contains(bankAccount)) clients.remove(bankAccount);
            else throw new RuntimeException("Client does not exist in the list");
        }
    }






    public void validateWorker(boolean a, boolean p, boolean t) {
        worker w = lastWorker;
        if (a) w.verifyAge();
        if (p) w.verifyPay();
        if (t) w.verifyPaidOnTime();

    }

}

