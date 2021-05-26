package main;

public class CoffeeMaker {

    private int water;
    private int milk;
    private int coffee_beams;
    private int disposable_cups;
    private int money;


    public void makeACoffee(Coffee coffee, CoffeeMachine machine) {
        this.water = coffee.getWater();
        this.milk = coffee.getMilk();
        this.coffee_beams = coffee.getCoffee_beams();
        this.disposable_cups = coffee.getDisposable_cups();
        this.money = coffee.getMoney();

        if (machine.getWater() >= water
                && machine.getMilk() >= milk
                && machine.getCoffee_beams() >= coffee_beams
                && machine.getDisposable_cups() >= disposable_cups
        ) {
            makeTransaction(machine);
            System.out.println("Your "  + coffee.toString() + " is ready");
        } else {
            errMassage(machine);
        }
    }

    private void makeTransaction(CoffeeMachine machine) {
        machine.setWater(machine.getWater() - water);
        machine.setMilk(machine.getMilk() - milk);
        machine.setCoffee_beams(machine.getCoffee_beams() - coffee_beams);
        machine.setDisposable_cups(machine.getDisposable_cups() - disposable_cups);
        machine.setMoney(machine.getMoney() + money);
    }

    private void errMassage(CoffeeMachine machine){
        if (machine.getWater() < water){
            System.out.println("Not enough water. Refill water through the refill menu");
        }
        if (machine.getMilk() < milk){
            System.out.println("Not enough milk. Refill milk through the refill menu");
        }
        if (machine.getCoffee_beams() < coffee_beams){
            System.out.println("Not enough coffee beams. Refill coffee beams through the refill menu");
        }
        if (machine.getDisposable_cups() < disposable_cups){
            System.out.println("Not enough disposable cups. Refill disposable cups through the refill menu");
        }
    }
}
