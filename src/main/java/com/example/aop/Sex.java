package com.example.aop;

public enum Sex {
    MAN(1),
    WOMAN(2000);
    private final Integer value;

    private Sex(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
