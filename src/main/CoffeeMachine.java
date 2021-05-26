package main;

import java.util.Objects;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffee_beams;
    private int disposable_cups;
    private int money;

    public CoffeeMachine(int water, int milk, int coffee_beams, int disposable_cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee_beams = coffee_beams;
        this.disposable_cups = disposable_cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee_beams() {
        return coffee_beams;
    }

    public void setCoffee_beams(int coffee_beams) {
        this.coffee_beams = coffee_beams;
    }

    public int getDisposable_cups() {
        return disposable_cups;
    }

    public void setDisposable_cups(int disposable_cups) {
        this.disposable_cups = disposable_cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "The coffee machine has: " + "\n" +
                 water + " of water " + "\n" +
                 milk + " of milk " + "\n" +
                 coffee_beams + " of coffee beans " + "\n" +
                 disposable_cups + " of disposable cups " + "\n" +
                "$" + money + " of money" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoffeeMachine)) return false;
        CoffeeMachine that = (CoffeeMachine) o;
        return water == that.water &&
                milk == that.milk &&
                coffee_beams == that.coffee_beams &&
                disposable_cups == that.disposable_cups &&
                money == that.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(water, milk, coffee_beams, disposable_cups, money);
    }
}
