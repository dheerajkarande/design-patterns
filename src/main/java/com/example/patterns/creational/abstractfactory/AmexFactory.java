package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.abstractfactory.creditcards.AmexGoldCreditCard;
import com.example.patterns.creational.abstractfactory.creditcards.AmexPlatinumCreditCard;
import com.example.patterns.creational.abstractfactory.creditcards.CardType;
import com.example.patterns.creational.abstractfactory.creditcards.CreditCard;
import com.example.patterns.creational.abstractfactory.validators.AmexGoldValidator;
import com.example.patterns.creational.abstractfactory.validators.AmexPlatinumValidator;
import com.example.patterns.creational.abstractfactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                throw new IllegalArgumentException("Invalid card type");
        }

    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                throw new IllegalArgumentException("Invalid card type");
        }
    }
}
