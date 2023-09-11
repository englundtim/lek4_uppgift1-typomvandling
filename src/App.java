import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a)");
        Scanner tal = new Scanner(System.in);
        System.out.println("Skriv in ditt första heltal");
        int tal1 = tal.nextInt();
        System.out.println("Skiirv in ditt andra heltal");
        int tal2 = tal.nextInt();

        double kvot_dec = (double)tal1/tal2;
        System.out.println("kvoten är: "+kvot_dec);
        int kvot_hel = tal1/tal2;
        System.out.println("kvoten är: "+kvot_hel);

    }
}
