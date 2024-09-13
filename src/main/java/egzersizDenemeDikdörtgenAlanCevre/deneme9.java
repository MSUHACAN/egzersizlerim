package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenarın uzunluğunu giriniz");
        System.out.println("uzun kenarın uzunluğunu giriniz");
        float kısakenar = input.nextFloat();
        float uzunkenar = input.nextFloat();
        System.out.println("alan = " + (kısakenar*uzunkenar));
        System.out.println("cevre uzunlugu = " + (2*kısakenar+2*uzunkenar));
    }
}
