package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // статус выбора пункта меню: 0 - главное меню, 1 - меню покупки кофе, 2 - меню пополнения запасов
        // 3 - проверка остатка запасов,
        int menuStatus = 0;
        String action;


        CoffeeMachine machine = new CoffeeMachine(100, 100, 100, 2, 100);
       // CoffeeMachine machine = new CoffeeMachine(100, 100, 100, 100, 100);

        CoffeeMaker maker = new CoffeeMaker();


        Scanner in = new Scanner(System.in);
        System.out.println(machine.toString());
        System.out.println();


        while (true) {
            if (menuStatus == 0) {
                System.out.print("Write action(buy, fill, take, remaining, exit): ");
                action = in.nextLine();
                switch (action) {
                    case "buy":
                        System.out.println("Покупка");
                        menuStatus = 1;
                        break;
                    case "fill":
                        System.out.println("Пополнение запасов");
                        menuStatus = 2;
                        break;
                    case "remaining":
                        menuStatus = 3;
                        break;
                    case "exit":
                        in.close();
                        System.out.println("Машина остановлена");
                        System.exit(0);
                        break;
                    default: {
                        System.out.println("Введена неверная команда");
                    }
                }
            } else if (menuStatus == 1) {
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 0 - exit to main menu: ");
                action = in.nextLine();
                switch (action) {
                    case "1":
                        maker.makeACoffee(new Espresso(), machine);
                        break;
                    case "2":
                        maker.makeACoffee(new Latte(), machine);
                        break;
                    case "3":
                        maker.makeACoffee(new Cappuccino(), machine);
                        break;
                    case "0":
                        menuStatus = 0;
                        System.out.println("Выход в главное меню");
                        break;
                    default: {
                        System.out.println("Введена неверная команда");
                    }
                }
            } else if (menuStatus == 3) {
                System.out.println(machine.toString());
                menuStatus = 0;
            } else if (menuStatus == 2) {
                System.out.print("What do you want to remain? 1 - water, 2 - milk, 3 - coffee_beams, 4 - disposable_cups, 5 - money, 0 - exit to main menu: ");
                action = in.nextLine();
                switch (action) {
                    case "1":
                        System.out.println("Сколько Water пополнить?");
                        action = in.nextLine();
                        Replenishment.replenWater(machine, action);
                        System.out.println("Пополнено " + action + " water");
                        break;
                    case "2":
                        System.out.println("Сколько milk пополнить?");
                        action = in.nextLine();
                        Replenishment.replenMilk(machine, action);
                        System.out.println("Пополнено " + action + " milk");
                        break;
                    case "3":
                        System.out.println("Сколько coffee_beams пополнить?");
                        action = in.nextLine();
                        Replenishment.replenCoffee_beams(machine,action);
                        System.out.println("Пополнено " + action + " coffee_beams");
                        break;
                    case "4":
                        System.out.println("Сколько disposable_cups пополнить?");
                        action = in.nextLine();
                        Replenishment.replenDisposable_cups(machine,action);
                        System.out.println("Пополнено " + action + " disposable_cups");
                        break;
                    case "5":
                        System.out.println("Сколько money пополнить?");
                        action = in.nextLine();
                        Replenishment.replenMoney(machine,action);
                        System.out.println("Пополнено " + action + " money");
                        break;
                    case "0":
                        menuStatus = 0;
                        System.out.println("Выход в главное меню");
                        break;
                    default:
                        System.out.println("Введена неверная команда");
                }

            }

        }
    }
}