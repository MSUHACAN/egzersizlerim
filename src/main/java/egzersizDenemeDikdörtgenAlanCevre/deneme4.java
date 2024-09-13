package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden küçük kenarı giriniz");
        System.out.println("klavyeden büyük kenarı giriniz");
        float küçükkenar = input.nextFloat();
        float büyükkenar = input.nextFloat();
        System.out.println("alan " + (küçükkenar*büyükkenar));
        System.out.println("cevre " +(2*küçükkenar+2*büyükkenar));
    }
}
