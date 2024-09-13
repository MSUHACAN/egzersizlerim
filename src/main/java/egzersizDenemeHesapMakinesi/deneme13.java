package egzersizDenemeHesapMakinesi;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class deneme13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("klavyeden bir sayı giriniz");
        double number= input.nextDouble();
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();
        System.out.println("toplama = " + (firstnumber+secondnumber));
        System.out.println("çıkarma= " + (firstnumber-secondnumber));
        System.out.println("çarpma = " + (firstnumber*secondnumber));
        System.out.println("bölme = " + (firstnumber/secondnumber));
    }
}
