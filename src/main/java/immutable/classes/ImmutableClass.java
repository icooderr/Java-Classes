package immutable.classes;

import java.util.*;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Set<Integer> set;
    private final Address address;
    private final Date date;
    private final List<Integer> mobileNumbers;

    public ImmutableClass(int id, String name, Set<Integer> set, Address address, Date date, List<Integer> mobileNumbers) {
        this.id = id;
        this.name = name;
        this.set = new HashSet<>(set);
        this.address = new Address(address.getCity(), address.getZip());
        this.date = (Date) date.clone();
        this.mobileNumbers = new ArrayList<>(mobileNumbers);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Integer> getSet() {
        return new HashSet<>(set);
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public List<Integer> getMobileNumbers() {
        return Collections.unmodifiableList(mobileNumbers);
//      return new ArrayList(mobileNumbers);
        // -------------------
//        List<Integer> mobile = new ArrayList<>();
//        for(Integer num: mobileNumbers) {
//            mobile.add(num);
//        }
//        return mobile;
    }
}
