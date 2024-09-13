package klavyedenGirilenSayinınİlk2basamağıSon2basamağıToplamı;

import java.util.Scanner;

public class deneme8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden beş basamaklı bir sayı giriniz");
        int number = input.nextInt();
        int ilkikibasamak =number/1000;
        int sonilkikibasamak =number%100;
        System.out.println(ilkikibasamak+sonilkikibasamak);
    }
}
