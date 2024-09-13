package sayınınTEKmiÇiftmiOlduğunuBulma;

import java.util.Scanner;

public class denem7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden bir sayı giriniz");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("tebrik ederim çift sayı");
        }
        if (number%2!=0){
            System.out.println("tebrik ederim tek sayı");
        }
    }
}
