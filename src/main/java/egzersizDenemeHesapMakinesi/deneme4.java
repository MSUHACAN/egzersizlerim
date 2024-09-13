package egzersizDenemeHesapMakinesi;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Klavyeden bir sayı giriniz");
        System.out.println("Klavyeden bir sayı daha giriniz");
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();
        System.out.println("toplama = " + (firstnumber+secondnumber));
        System.out.println("çıkarma = " +(firstnumber-secondnumber));
        System.out.println("çarpma = " + (firstnumber*secondnumber));
        System.out.println("bölme = " +(firstnumber/secondnumber));




    }
}
