package com.example.patterns.creational.factory;

import com.example.patterns.creational.factory.phones.Blackberry;
import com.example.patterns.creational.factory.phones.IPhone;
import com.example.patterns.creational.factory.phones.Nokia;
import com.example.patterns.creational.factory.phones.Phone;
import com.example.patterns.creational.factory.phones.PhoneType;
import com.example.patterns.creational.factory.phones.Samsung;

public class PhoneFactory {

    public static Phone getPhone(PhoneType phoneType) {
        switch (phoneType) {
            case BLACKBERRY:
                return new Blackberry();
            case IPHONE:
                return new IPhone();
            case NOKIA:
                return new Nokia();
            case SAMSUNG:
                return new Samsung();
            default:
                throw new IllegalArgumentException("Invalid phone type.");
        }
    }

}
