package sample;


import java.util.*;

public class parentCompany {
    private String companyName;
    private HashMap<String, supplier> supplierList;
    private supplier s;

    public parentCompany(String name) {
        this.companyName = name;
        supplierList = new HashMap<>();
    }
    public String getName() { return companyName; }

    public void addSupplier(String name, String location) {
        supplier s = new supplier(name, location);
        supplierList.put(name, s);
    }

    public void removeSupplier(String name) {
        if(supplierList.containsKey(name)) supplierList.remove(name);
        else System.out.println("Supplier does not exist in the list");
    }

    public supplier getSupplier(String name){
        return supplierList.get(name);
    }
}
