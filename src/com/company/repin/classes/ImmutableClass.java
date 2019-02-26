package com.company.repin.classes;

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
