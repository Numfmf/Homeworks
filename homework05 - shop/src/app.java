import products.*;

import java.lang.module.FindException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
            product bread = new Bread();
            product milk = new Milk();
            product cake = new Cake();
            product IceCream = new IceCream();
            product cofee = new Cofee();

            person First = new person();

        System.out.println("Введите имя покупателя: ");
            Scanner scanner = new Scanner(System.in);

        First.setName(scanner.nextLine());

        System.out.println("Введите баланс пользователя " +First.getName() + ": ");
        First.setMoney(scanner.nextInt());


        System.out.printf("Хотите выбрать " +
                " " + bread.getName() + " - " + bread.getValue() + "?  " +
                "1 - Да" + "  2 - Нет");
        int a = scanner.nextInt();

            if (a == 1) {

                    First.setMoney(First.getMoney() - bread.getValue());

                    First.addProductToCart(bread);

                if (First.getMoney() >= milk.getValue()) {
                    System.out.println("Вы положили " + bread.getName() + " " + "Ваш остаток - " + First.getMoney());
                } else {}
            } else {}

        System.out.printf("Хотите выбрать " +
                " " + milk.getName() + " - " + milk.getValue() + "?  " +
                "1 - Да" + "  2 - Нет");

        int b = scanner.nextInt();
            if (b == 1) {

                    First.setMoney(First.getMoney() - milk.getValue());
                    First.addProductToCart(milk);

                if (First.getMoney() >= milk.getValue()) {
                    System.out.println("Вы положили " + milk.getName() + " " + "Ваш остаток - " + First.getMoney());
                } else {}
            } else {}


        System.out.printf("Хотите выбрать " +
                " " + IceCream.getName() + " - " + IceCream.getValue() + "?  " +
                "1 - Да" + "  2 - Нет");

        int g = scanner.nextInt();
        if (g == 1) {

                First.setMoney(First.getMoney() - IceCream.getValue());
                First.addProductToCart(IceCream);

            if (First.getMoney() >= IceCream.getValue()) {
                System.out.println("Вы положили " + IceCream.getName() + " " + "Ваш остаток - " + First.getMoney());
            } else {}
        } else {}


        System.out.printf("Хотите выбрать " +
                " " + cake.getName() + " - " + cake.getValue() + "?  " +
                "1 - Да" + "  2 - Нет");

        int t = scanner.nextInt();
        if (t == 1) {
                First.setMoney(First.getMoney() - cake.getValue());
                First.addProductToCart(cake);

            if (First.getMoney() >= cake.getValue()) {
                System.out.println("Вы положили " + cake.getName() + " " + "Ваш остаток - " + First.getMoney());
            } else {}
        } else {}

        System.out.printf("Хотите выбрать " +
                " " + cofee.getName() + " - " + cofee.getValue() + "?  " +
                "1 - Да" + "  2 - Нет");

        int p = scanner.nextInt();
        if (p == 1) {

                First.setMoney(First.getMoney() - cofee.getValue());
                First.addProductToCart(cofee);

            if (First.getMoney() >= cofee.getValue()) {
                System.out.println("Вы положили " + cofee.getName() + " " + "Ваш остаток - " + First.getMoney());
            } else {}
        } else {}

        System.out.println("Вы купили: " + First.toString());

//        if (c == 1) {
//            System.out.println("Вы выбралли: " + bread.getName() + " Что-нибудь ещё? "+
//                    " 2. " + milk.getName() + " " + milk.getValue() +
//                    " 3. " + cake.getName() + " " + cake.getValue() +
//                    " 4. " + IceCream.getName() + " " + IceCream.getValue() +
//                    " 5. Нет, это все.");
//
//            int cc = scanner.nextInt();
//
//            if (cc==2); {
//                System.out.println("Вы выбралли: " + bread.getName() + milk.getName() + " Что-нибудь ещё? " +
//                        " 3. " + cake.getName() + " " + cake.getValue() +
//                        " 4. " + IceCream.getName() + " " + IceCream.getValue() +
//                        " 5. Нет, это все.");
//
//
//                int ccc = scanner.nextInt();
//
//
//                if (ccc==3); {
//                    int cccd = (First.getMoney() - bread.getValue() - milk.getValue() - cake.getValue());
//                    First.setMoney(cccd);
//                    System.out.println("Вы выбралли: " + bread.getName() + milk.getName() + cake.getName());
//                }
//                if (ccc==4); {
//                    int cccd = (First.getMoney() - bread.getValue() - milk.getValue() - IceCream.getValue());
//                    First.setMoney(cccd);
//                    System.out.println("Вы выбралли: " + bread.getName() + milk.getName() + IceCream.getName());
//                    System.out.println("Ваш баланс: " + First.getMoney());
//
//                }
//                if (cc==4); {
//                    int cccd = (First.getMoney() - bread.getValue() - milk.getValue() - IceCream.getValue());
//                    First.setMoney(cccd);
//                    System.out.println("Вы выбралли: " + bread.getName() + milk.getName() + IceCream.getName());
//                    System.out.println("Ваш баланс: " + First.getMoney());
//
//                }
//
//            }


//            int d = (First.getMoney() - bread.getValue());
//                First.setMoney(d);
//
//            System.out.println("Вы выбрали " + bread.getName() + "  Осталось: " + First.getMoney() + " Что возьмёте ещё?  " +
//                    " 1. " + bread.getName() + " " + bread.getValue() +
//                    " 2. " + milk.getName() + " " + milk.getValue() +
//                    " 3. " + cake.getName() + " " + cake.getValue() +
//                    " 4. " + IceCream.getName() + " " + IceCream.getValue() +
//                    " 5. Это все, что я хотел");
//            int dd = scanner.nextInt();
//            if (dd == 5);{
//                System.out.println("Вы купили " + bread.getName() + " Осталось: " + d);
//            }
//            if (dd == 2);{
//                int vd = (First.getMoney()- milk.getValue());
//                First.setMoney(vd);
//                    System.out.println("Вы купили " + bread.getName() + " " + milk.getValue() + "Осталось: " +First.getMoney());
//
//                System.out.println();
//            }


        }
    }
