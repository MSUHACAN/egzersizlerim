package egzersizDenemeDikdörtgenAlanCevre;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("küçük kenar");
        System.out.println("büyük kenar");
        float küçükkenar = input.nextFloat();
        float büyükkenar = input.nextFloat();
        System.out.println("alan = " + (küçükkenar*büyükkenar));
        System.out.println("cevre = " +(2*küçükkenar+2*büyükkenar));
    }
}
