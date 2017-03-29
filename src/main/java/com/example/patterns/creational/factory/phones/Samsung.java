package com.example.patterns.creational.factory.phones;

import com.example.patterns.creational.factory.phonefeatures.Gsm;
import com.example.patterns.creational.factory.phonefeatures.OperatingSystem;
import com.example.patterns.creational.factory.phonefeatures.Storage;

public class Samsung extends Phone {

    @Override
    public void createPhone() {
        features.add(new Storage());
        features.add(new Gsm());
        features.add(new OperatingSystem());
    }

}
