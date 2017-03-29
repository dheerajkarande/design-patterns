package com.example.patterns.creational.singletons;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public ThreadSafeSingleton getInstance() {

        if (null == instance) {
            synchronized (ThreadSafeSingleton.class) {
                if (null == instance) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

}
