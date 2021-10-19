package com.company;

public class Main {

    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();
        BurgerStore store = new BurgerStore(factory);

        Burger burger = store.orderBurger("hamburger");
        System.out.println("You ordered a " + burger.getName() + "\n");
        System.out.println(burger);

        burger = store.orderBurger("cheeseburger");
        System.out.println("You ordered a " + burger.getName() + "\n");
        System.out.println(burger);

        burger = store.orderBurger("steakhouse");
        System.out.println("You ordered a " + burger.getName() + "\n");
        System.out.println(burger);
    }
}
