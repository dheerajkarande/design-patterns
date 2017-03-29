package com.example.patterns.creational.factory.phones;

import com.example.patterns.creational.factory.phonefeatures.Gsm;
import com.example.patterns.creational.factory.phonefeatures.OperatingSystem;
import com.example.patterns.creational.factory.phonefeatures.Storage;
import com.example.patterns.creational.factory.phonefeatures.WiFiEnabled;

public class Blackberry extends Phone {

    @Override
    public void createPhone() {
        features.add(new Storage());
        features.add(new Gsm());
        features.add(new OperatingSystem());
        features.add(new WiFiEnabled());
    }

}
