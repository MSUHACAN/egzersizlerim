package egzersizDenemeHesapMakinesi;

import java.util.Scanner;

public class deneme19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("klavyeden bir sayı giriniz");
        System.out.println("Klavyeden bir sayı daha giriniz");
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();
        System.out.println("TOPLAMA = " + (firstnumber+secondnumber));
        System.out.println("çıkarma = " + (firstnumber-secondnumber));
        System.out.println("çarpma = " + (firstnumber*secondnumber));
        System.out.println("bölme = " +(firstnumber/secondnumber));
    }
}
