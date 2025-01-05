import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
            int a = scanner.nextInt();
        System.out.println("Ваше число: a=" + a);
        System.out.println("Введите второе целое число");
        int b = scanner.nextInt();
        System.out.println("Ваше число: b=" + b);
        int c = (a+b);
        int d = (a-b);
        int e = (a*b);
        int f = ((a+b)/2);
        
        System.out.println("Результат работы программы: сумма = "+ c + "; разность = " + d +"; произведение = " + e +"; Среднее значение = "+ f + ";");
        if (a>b) {
            int j = (a-b);
            System.out.println("Расстояние между первым и вторым числом: " +j);
                    } else {
            int k = (b-a);
            System.out.println("Расстояние между первым и вторым числом: " +k);
        }
        if (a>b) {
            System.out.println("Самое большое число: " + a);
        } else {
            System.out.println("самое большое число: " + b);
        }
        if (a<b) {
            System.out.println("Самое маленькое число: " + a);
        } else {
            System.out.println("самое маленькое число: " + b);
        }

    }
}