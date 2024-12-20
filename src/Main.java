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
    }
}