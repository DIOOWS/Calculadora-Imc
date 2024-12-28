import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraImc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Calcular o IMC
        double resultado = peso / (altura * altura);

        // Formatar o resultado com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.00");
        String imcFormatado = df.format(resultado);

        // Determinar a categoria do IMC
        String categoria;
        if (resultado < 18.5) {
            categoria = "Abaixo do peso";
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            categoria = "Peso normal";
        } else if (resultado >= 25 && resultado < 29) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obeso";
        }

        // Exibir o resultado
        System.out.println("Seu IMC é: " + imcFormatado);
        System.out.println("Categoria: " + categoria);
    }
}
