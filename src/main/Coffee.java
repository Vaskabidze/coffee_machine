package main;

public interface Coffee {
    public int getWater();

    public int getMilk();

    public int getCoffee_beams();

    public int getDisposable_cups();

    public int getMoney();

    public String toString();

}


class Espresso implements Coffee {
    protected int water = 3;
    protected int milk = 0;
    protected int coffee_beams = 3;
    protected int disposable_cups = 1;
    protected int money = 5;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee_beams() {
        return coffee_beams;
    }

    public int getDisposable_cups() {
        return disposable_cups;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Espresso";
    }
}

class Cappuccino implements Coffee {
    protected int water = 5;
    protected int milk = 2;
    protected int coffee_beams = 2;
    protected int disposable_cups = 1;
    protected int money = 8;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee_beams() {
        return coffee_beams;
    }

    public int getDisposable_cups() {
        return disposable_cups;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Cappuccino";
    }
}

class Latte implements Coffee {
    protected int water = 4;
    protected int milk = 3;
    protected int coffee_beams = 2;
    protected int disposable_cups = 1;
    protected int money = 7;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee_beams() {
        return coffee_beams;
    }

    public int getDisposable_cups() {
        return disposable_cups;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Latte";
    }
}