package sayınınTEKmiÇiftmiOlduğunuBulma;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden bir sayı giriniz");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("sayı çift sayıdır");
        }
        if (number%2!=0){
            System.out.println("sayı tek bir sayıdır");
        }
    }
}
