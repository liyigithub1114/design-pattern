package com.liyi.design.pattern.structure.decorator;

public class MyDecorator extends Drink{

    Drink drink;

    public MyDecorator(Drink drink){
        setDrink(drink);
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    float cost() {
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDes() {
        return drink.getDes() + " " + super.getDes();
    }

    @Override
    public float getPrice() {
        return drink.getPrice() + super.getPrice();
    }
}
