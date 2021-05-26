package main;

/**
 * Класс отвечает за пополнение ресурсов кофемашины
 */


public class Replenishment {

    static void replenWater(CoffeeMachine machine, String water) {
        if (checkIfInteger(water)) {
            machine.setWater(machine.getWater() + Integer.parseInt(water));
            System.out.println("Replenished " + water + " liters of water");
        } else {
            System.out.println("Wrong amount of water entered");
        }
    }

    static void replenMilk(CoffeeMachine machine, String milk) {
        if (checkIfInteger(milk)) {
            machine.setMilk(machine.getMilk() + Integer.parseInt(milk));
            System.out.println("Replenished " + milk + " liters of milk");
        } else {
            System.out.println("Wrong amount of milk entered");
        }
    }

    static void replenCoffee_beams(CoffeeMachine machine, String coffee_beams) {
        if (checkIfInteger(coffee_beams)) {
            machine.setCoffee_beams(machine.getCoffee_beams() + Integer.parseInt(coffee_beams));
            System.out.println("Replenished " + coffee_beams + " of coffee beams");
        } else {
            System.out.println("Wrong amount of coffee beams entered");
        }
    }

    static void replenDisposable_cups(CoffeeMachine machine, String disposable_cups) {
        if (checkIfInteger(disposable_cups)) {
            machine.setDisposable_cups(machine.getDisposable_cups() + Integer.parseInt(disposable_cups));
            System.out.println("Replenished " + disposable_cups + " of disposable cups");
        } else {
            System.out.println("Wrong amount of disposable cups entered");
        }
    }

    static void replenMoney(CoffeeMachine machine, String money) {
        if (checkIfInteger(money)) {
            machine.setMoney(machine.getMoney() + Integer.parseInt(money));
            System.out.println("Replenished " + money + " of money");
        } else {
            System.out.println("Wrong amount of money entered");
        }
    }

    private static boolean checkIfInteger(String checkIt) throws NumberFormatException {
        boolean ifInteger = true;
        int a = -1;

        try {
            a = Integer.parseInt(checkIt);
        } catch (NumberFormatException exception) {
            ifInteger = false;
        }

        if (a < 0) {
            ifInteger = false;
        }

        return ifInteger;
    }

}
