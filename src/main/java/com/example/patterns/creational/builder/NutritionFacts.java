package com.example.patterns.creational.builder;

//Have taken this example from Effective Java
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        //Required Parameters
        private final int servingSize;
        private final int servings;

        //Optional Parameters - Should be initialized to default value
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

}

/*
    //Use of builder
    NutritionFacts nutritionFacts = new NutritionFacts.Builder(12, 11)
            .calories(21)
            .fat(56)
            .carbohydrate(25)
            .build();
*/

