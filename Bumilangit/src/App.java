import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Assalamualaikum");
        System.out.println("Nama Pahlawan : 1. VENOM 2. GUNDALA");
        int Hero = input.nextInt();

        switch (Hero) {
            case 1:
                System.out.println("VENOM HULK || VENOM KURUS || VENOM GEMUK");
                System.out.print("Silahkan Input Nama Varian : ");
                input.nextLine();
                String Varian = input.nextLine();
                System.out.println("20% || 50% || 100%");
                System.out.print("Silahkan Input Darah Hero : ");
                int darah = input.nextInt();
                System.out.println("MENGIGIT || MELEMPAR || MENGAMUK");
                System.out.println("Silahkan Input Kesaktian : ");
                input.nextLine();
                String kesaktian = input.nextLine();
                Venom hero = new Venom(Varian, kesaktian, darah);
                System.out.println("Pilih Kesaktian Venom :");
                System.out.println("1. Melawan    2. mengelabuhi    3.terbang ");
                int ketangguhan = input.nextInt();

                switch (ketangguhan) {
                    case 1:
                    hero.melawan();
                    break;

                    case 2:
                    hero.mengelabuhi();
                    break;

                    case 3:
                    hero.terbang();
                    break;
                }
                break;
            case 2:
                System.out.println("Silahkan Input Nama Varian : ");
                System.out.println("GUNDALA PETIR || GUNDALA HALILINTAR || GUNDALA LISTRIK");
                input.nextLine();
                Varian = input.nextLine();
                System.out.println("20% || 50% || 100%");
                System.out.print("Silahkan Input Darah Hero : ");
                darah = input.nextInt();
                System.out.println("Silahkan Input Kesaktian : ");
                input.nextLine();
                kesaktian = input.nextLine();
                Gundala heroindo = new Gundala(Varian, kesaktian, darah);
                System.out.println("1. Melawan    2. mengelabuhi    3.terbang ");
                ketangguhan = input.nextInt();

                switch (ketangguhan) {
                    case 1:
                    heroindo.melawan();
                    break;

                    case 2:
                    heroindo.mengelabuhi();
                    break;

                    case 3:
                    heroindo.terbang();
                    break;
                }
                break;
            default:
                break;
        }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        } finally{
            input.close();
        }
        
    }
}
