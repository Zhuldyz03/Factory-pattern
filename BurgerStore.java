package com.company;

public class BurgerStore {
    BurgerFactory factory;

    public BurgerStore(BurgerFactory factory) {
        this.factory = factory;
    }

    public Burger orderBurger(String type) {
        Burger burger;

        burger = factory.createBurger(type);

        burger.prepare();
        burger.bake();
        burger.box();

        return burger;
    }
}
