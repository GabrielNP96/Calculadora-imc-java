import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Bem vindo, Vamos calcular seu imc");

        //recebendo dados do usuario
        System.out.println("Digite seu peso?");
        double weight = reading.nextDouble();
        System.out.println("Digite sua altura: ");
        double height = reading.nextDouble();

        //Calculo e formatação
        double imc = weight /(height * height);
        DecimalFormat df = new DecimalFormat("#.##");
        String imcFormated = df.format(imc);

        System.out.println(imcFormated);

        //avaliação do imc
        if (imc < 18.5) {
            System.out.println("Seu imc é " + imcFormated + " e você está muito magro(a)");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu imc é " + imcFormated + " e você está no peso correto.");
        } else if (imc >=25 && imc < 30) {
            System.out.println("Seu imc é " + imcFormated + " e você está acima do peso!");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Seu imc é " + imcFormated + " e você está com obesidade grau 1!");
        } else if (imc >=35 && imc < 40) {
            System.out.println("Seu imc é " + imcFormated + " e você está com obesidade grau 2!!");
        } else if (imc >= 40) {
            System.out.println("Seu imc é " + imcFormated + " e você está com obesidade grau 3!!!");
        } else {
            System.out.println("Ocorreu algum erro....");
        }
    }
}