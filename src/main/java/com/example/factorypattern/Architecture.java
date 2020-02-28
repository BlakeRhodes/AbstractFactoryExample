package com.example.factorypattern;

public enum Architecture {
    EMBER("EmberFactory"),
    ENGINOLA("EnginolaFactory"),
    ALPHA("AlphaFactory");

    private String className;

    Architecture(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}

