package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.abstractfactory.creditcards.CardType;
import com.example.patterns.creational.abstractfactory.creditcards.CreditCard;
import com.example.patterns.creational.abstractfactory.validators.Validator;

//AbstractFactory
public abstract class CreditCardFactory {
    public static final int CREDIT_SCORE_LIMIT = 650;

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > CREDIT_SCORE_LIMIT) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
