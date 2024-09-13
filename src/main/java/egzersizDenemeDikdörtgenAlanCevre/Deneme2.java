package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenar uzunluğunu girinizi");
        System.out.println("uzun kenar uzunluğunu giriniz");
        float kısakenar = input.nextFloat();
        float uzunkenar = input.nextFloat();
        System.out.println("alan = " +(kısakenar*uzunkenar));
        System.out.println("cevre = " + ((2*kısakenar)+(2*uzunkenar)));
    }
}
