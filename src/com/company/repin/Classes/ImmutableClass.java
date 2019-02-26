package com.company.repin.Classes;

import com.company.repin.Car;

public final class ImmutableClass {

    private final String name;
    private final Integer integer;

    public ImmutableClass(String name, Integer integer) {
        this.name = name;
        this.integer = integer;
    }

    public String getName() {
        return name;
    }

    public Integer getInteger() {
        return integer;
    }
}
