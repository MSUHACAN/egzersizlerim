package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kısa kenar uzunluğunu giriniz");
        System.out.println("uzun kenar uzunluğunu giriniz");
        int kısakenar= input.nextInt();
        int uzunkenar = input.nextInt();
        System.out.println("alan = " + (kısakenar*uzunkenar));
        System.out.println("cevre = " +(2*kısakenar+2*uzunkenar));
    }
}
