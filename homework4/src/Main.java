import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите английскую букву : ");
        char a = sc.next().charAt(0);
        String qwerty = "qwertyuiopasdfghjklzxcvbnm";

        for (int i = 0; i < qwerty.length(); i++) {
            if (a == qwerty.charAt(i)) {

                if (i == qwerty.length() - 1 ) {
                    System.out.print("Далее на клавиатуре буква : " + qwerty.charAt(0));
                }
                else {
                    System.out.print("Справа на клавиатуре буква : " + qwerty.charAt(i + 1));
                }
            }
        }
    }
}
