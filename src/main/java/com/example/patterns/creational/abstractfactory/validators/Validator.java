package com.example.patterns.creational.abstractfactory.validators;

import com.example.patterns.creational.abstractfactory.creditcards.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
