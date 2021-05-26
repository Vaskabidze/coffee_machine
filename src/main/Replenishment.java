package main;
/**
 * Класс отвечает за пополнение ресурсов кофемашины
 * */


public class Replenishment {

    static void replenWater(CoffeeMachine machine, String water) {
        machine.setWater(machine.getWater() + Integer.parseInt(water));
    }

    static void replenMilk(CoffeeMachine machine, String milk) {
        machine.setMilk(machine.getMilk() + Integer.parseInt(milk));
    }

    static void replenCoffee_beams(CoffeeMachine machine, String coffee_beams) {
        machine.setCoffee_beams(machine.getCoffee_beams() + Integer.parseInt(coffee_beams));
    }

    static void replenDisposable_cups(CoffeeMachine machine, String disposable_cups) {
        machine.setDisposable_cups(machine.getDisposable_cups() + Integer.parseInt(disposable_cups));
    }
    static void replenMoney(CoffeeMachine machine, String money) {
        machine.setMoney(machine.getMoney() + Integer.parseInt(money));
    }


}
