package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenarı giriniz");
        System.out.println("uzun kenarı giriniz");
        double kısakenar = input.nextDouble();
        double uzunkenar = input.nextDouble();
        System.out.println("alan = " + (kısakenar*uzunkenar));
        System.out.println("cevre = " + (2*kısakenar+2*uzunkenar));
    }
}
