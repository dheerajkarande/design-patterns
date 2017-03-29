package com.example.patterns.creational.factory.phones;

import com.example.patterns.creational.factory.phonefeatures.Gsm;
import com.example.patterns.creational.factory.phonefeatures.OperatingSystem;
import com.example.patterns.creational.factory.phonefeatures.WiFiEnabled;

public class IPhone extends Phone {

    @Override
    public void createPhone() {
        features.add(new OperatingSystem());
        features.add(new WiFiEnabled());
        features.add(new Gsm());
    }

}
