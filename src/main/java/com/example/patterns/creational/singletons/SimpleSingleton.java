package com.example.patterns.creational.singletons;

//Lazy loaded singleton
public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public SimpleSingleton getInstance() {
        if (null == instance) {
            instance = new SimpleSingleton();
        }

        return instance;
    }

}
