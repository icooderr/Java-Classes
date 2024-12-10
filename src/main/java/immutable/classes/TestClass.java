package immutable.classes;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        // Test immutable class

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(7);

        Address address = new Address("Pune", 1234);

        List<Integer> mobileNumbers = new ArrayList<>();
        mobileNumbers.add(2);
        mobileNumbers.add(4);

        Date date = new Date();
        ImmutableClass ic = new ImmutableClass(
                1,
                "Rocky",
                set, address, date, mobileNumbers);

        // changing
        int id = ic.getId();
        String name = ic.getName();

        // changing
        Set<Integer> getSet = ic.getSet();
        getSet.add(10);
        getSet.add(12);

        // changing
        set.add(33);
        set.add(44);

        // changing
        ic.getAddress().setCity("Noida");
        address.setCity("Noida");

        // changing
        ic.getDate().setDate(16);
        date.setDate(16);

        // changing
        ic.getMobileNumbers().remove(Integer.valueOf(2));
        mobileNumbers.remove(Integer.valueOf(2));

        System.out.println("Id: " + ic.getId());
        System.out.println("Name: " + ic.getName());
        System.out.println("Set: " + ic.getSet());
        System.out.println("Address: City==> " + ic.getAddress().getCity() + " Zip==> " + ic.getAddress().getZip());
        System.out.println("Date: " + ic.getDate());
        System.out.println("Mobile Numbers: " + ic.getMobileNumbers());

        id = 7;
        name = "Harry";

        System.out.println("Id: " + ic.getId());
        System.out.println("Name: " + ic.getName());

    }
}
