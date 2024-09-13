package sayınınTEKmiÇiftmiOlduğunuBulma;

import java.util.Scanner;

public class deneme9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("klavyeden lütfen bir sayı giriniz");
        int number= input.nextInt();
        if (number%2==0){
            System.out.println("sayınız çift bir sayıdır");
        }
        if (number%2!=0){
            System.out.println("sayınız tek bir sayıdır");
        }
    }
}
