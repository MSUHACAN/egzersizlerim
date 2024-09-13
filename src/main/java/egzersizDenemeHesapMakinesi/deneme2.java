package egzersizDenemeHesapMakinesi;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir adet sayı giriniz");
        System.out.println("ikinci bir sayı giriniz");
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();
        System.out.println("toplama = " + (firstnumber+secondnumber));
        System.out.println("çıkarma = " +(firstnumber-secondnumber));
        System.out.println("çarpma = " + (firstnumber*secondnumber));
        System.out.println("bölme  = " + (firstnumber/secondnumber));







    }
}
