package com.company;

public class BurgerFactory {
    public Burger createBurger(String type) {
        Burger burger = null;

        if (type.equals("hamburger")) {
            burger = new Hamburger();
        } else if (type.equals("cheeseburger")) {
            burger = new Cheeseburger();
        } else if (type.equals("steakhouse")) {
            burger = new Steakhouse();
        }
        return burger;
    }
}
