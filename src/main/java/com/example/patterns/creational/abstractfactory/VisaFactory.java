package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.abstractfactory.creditcards.CardType;
import com.example.patterns.creational.abstractfactory.creditcards.CreditCard;
import com.example.patterns.creational.abstractfactory.creditcards.VisaBlackCreditCard;
import com.example.patterns.creational.abstractfactory.creditcards.VisaGoldCreditCard;
import com.example.patterns.creational.abstractfactory.validators.Validator;
import com.example.patterns.creational.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
            default:
                throw new IllegalArgumentException("Invalid card type");
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
