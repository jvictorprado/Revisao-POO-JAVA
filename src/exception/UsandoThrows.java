package exception;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Digite um numero decimal");
        try {
            double num1 = lerNum();
            System.out.println("Você digitou :" + num1);
        }catch (Exception e){
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }

    public static double lerNum() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
