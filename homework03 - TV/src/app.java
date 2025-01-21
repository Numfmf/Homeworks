import java.util.Scanner;

public class app {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);
            TV defTV  = new TV();
            TV VIP_TV = new TV(50, 8000, "grey", "on wall", "металл");
            TV defTVWALL =  new TV();
                defTVWALL.setType("Wall");
            TV VIP_TV_Tabletop = new TV(50, 8000, "grey", "tabletop", "металл");

        System.out.println("Выберите класс телевизора: 1. Стандартный,  2. VIP ");
        int a = scanner.nextInt();

        if (a == 1) {
            System.out.println("Выберите тип расположения: 1. На стол, 2. На стену");
            int b = scanner.nextInt();
                 if (b == 1) {
                System.out.println("Ваше телевизор:  Диагональ  " + defTV.getDioganal() + " Разрешение  " + defTV.getQuality() + "  Материал  " + defTV.getMaterial());
                }
                 if (b == 2) {
                System.out.println("Ваше телевизор:  Диагональ  " + defTVWALL.getDioganal() + " Разрешение  " + defTVWALL.getQuality() + "  Материал  " + defTVWALL.getMaterial());
                }
        }
        if (a == 2) {
            System.out.println("Выберите тип расположения: 1. На стол, 2. На стену");
            int c = scanner.nextInt();
                if (c == 1) {
                System.out.println("Ваше телевизор:  Диагональ  " + VIP_TV_Tabletop.getDioganal() + " Разрешение  " + VIP_TV_Tabletop.getQuality() + "  Материал  " + VIP_TV_Tabletop.getMaterial());
                }
                if (c == 2) {
                System.out.println("Ваше телевизор:  Диагональ  " + VIP_TV.getDioganal() + " Разрешение  " + VIP_TV.getQuality() + "  Материал  " + VIP_TV.getMaterial());
                }
        }
    }
}

