package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        Scanner alan = new Scanner(System.in);
        System.out.println("kılavyeden kısa kenarı giriniz");
        System.out.println("kılavyeden uzun kenarı giriniz");
        double kısakenar = alan.nextDouble();
        double uzunkenar = alan.nextDouble();
        System.out.println("alan = " + (kısakenar*uzunkenar));
    }
}
