package com.example.patterns.creational.abstractfactory.validators;

import com.example.patterns.creational.abstractfactory.creditcards.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}
