package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenarın uzunluğunu girin");
        System.out.println("uzun kenarın uzunluğunu girin");
        int kısakenar = input.nextInt();
        int uzunkenar = input.nextInt();
        System.out.println("alan = " +(kısakenar*uzunkenar));
        System.out.println("çevre = " + (2*kısakenar+2*uzunkenar));
    }
}
