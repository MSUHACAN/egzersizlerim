package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenarı giriniz");
        System.out.println("uzun kenarı giriniz");
        float kısakenar = input.nextFloat();
        float uzunkısakenar = input.nextFloat();
        System.out.println("alan = " + (kısakenar*uzunkısakenar));
        System.out.println("çevre = " +(2*kısakenar+2*uzunkısakenar));
    }
}
