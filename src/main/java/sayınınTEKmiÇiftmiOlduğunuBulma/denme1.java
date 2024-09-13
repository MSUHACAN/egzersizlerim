package sayınınTEKmiÇiftmiOlduğunuBulma;

import java.util.Scanner;

public class denme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kılavyeden lütfen bir sayı giriniz");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("çift sayıdır");
        }
        if (number%2!=0){
            System.out.println("tek sayıdır");
        }
    }
}
