package com.example.patterns.creational.factory.phones;

import com.example.patterns.creational.factory.phonefeatures.Gsm;
import com.example.patterns.creational.factory.phonefeatures.OperatingSystem;

public class Nokia extends Phone {

    @Override
    public void createPhone() {
        features.add(new Gsm());
        features.add(new OperatingSystem());
    }

}
