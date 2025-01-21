import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи градусы по форингейту:");
            int a = scanner.nextInt();
        System.out.println("Градусы по форингейту: " + a);
       int b = ((a - 32)*5/9);

        System.out.println("Градусы по цельсию: " + b);


    }
}