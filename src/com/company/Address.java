package com.company;
import java.util.Objects;

public final class Address {
    private final int building;
    private final String street;

    public Address(int aid, String street) {
        this.building = aid;
        this.street = street;
    }

        public int getAid() {
        return building;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address ad = (Address) o;
        return building == ad.building &&
                Objects.equals(street, ad.street);
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address:" + "Street=" + street + '\'' + ", building=" + building;
    }
}