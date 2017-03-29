package com.example.patterns.creational.factory.phones;

import com.example.patterns.creational.factory.phonefeatures.Feature;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    protected List<Feature> features = new ArrayList<>();

    public List<Feature> getFeatures() {
        return features;
    }

    public Phone() {
        this.createPhone();
    }

    public abstract void createPhone();

}
