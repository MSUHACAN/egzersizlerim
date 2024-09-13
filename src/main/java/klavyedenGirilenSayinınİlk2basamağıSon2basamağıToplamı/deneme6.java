package klavyedenGirilenSayinınİlk2basamağıSon2basamağıToplamı;

import java.util.Scanner;

public class deneme6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden 5 basaklı bir sayı giriniz");
        int number = input.nextInt();
        int ilkikibasamak=number/1000;
        int sonikibasamak =number%100;
        System.out.println(sonikibasamak+ilkikibasamak);
    }
}
