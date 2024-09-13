package klavyedenGirilenSayinınİlk2basamağıSon2basamağıToplamı;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("kılavyeden 5 basamaklı bir sayı giriniz");
        //kılvayeden girilen sayının ilk 2 basamağındaki sayı ile
        //sayının son 2 basamağının toplamı

        int number = input.nextInt();
        int ilkikirakam =number/1000;
        int sonikirakam =number%1000;
        System.out.println(ilkikirakam+sonikirakam);
    }
}
