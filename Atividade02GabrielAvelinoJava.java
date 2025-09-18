
package atividade02gabrielavelino.java;

import java.util.Scanner;
import java.util.Random;

public class Atividade02GabrielAvelino {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 1
        /*
        System.out.print("Raio do Círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double circunferencia = 2 * Math.PI * raio;

        System.out.println("Área: " + area);
        System.out.println("Circunferência: " + circunferencia);
        */

        // 2
        /*
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.println("IMC: " + imc);
        */

        // 3
        /*
        System.out.print("Cateto 1: ");
        double cat1 = scanner.nextDouble();

        System.out.print("Cateto 2: ");
        double cat2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.println("Hipotenusa: " + hipotenusa);
        */

        // 4
        /*
        System.out.print("Valor em reais: ");
        double reais = scanner.nextDouble();

        System.out.print("Cotação do dólar: ");
        double dolar = scanner.nextDouble();

        int qtdDolares = (int)(reais / dolar);
        double troco = reais - (qtdDolares * dolar);

        System.out.println("Pode comprar " + qtdDolares + " dólares.");
        System.out.println("Troco em reais: " + troco);
        */

        // 5
        /*
        Random rand = new Random();

        System.out.print("Quantidade de rolagens: ");
        int n = scanner.nextInt();

        int soma = 0;
        int menor = 7; // maior que 6 (limite do dado)
        int maior = 0;

        for (int i = 0; i < n; i++) {
            int valor = rand.nextInt(6) + 1; // de 1 a 6
            soma += valor;
            if (valor < menor) menor = valor;
            if (valor > maior) maior = valor;
        }

        double media = (double) soma / n;
        System.out.println("Média: " + media);
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        */

        // 6
        /*
        System.out.print("Ângulo em graus: ");
        double graus = scanner.nextDouble();

        double rad = Math.toRadians(graus);

        System.out.println("Seno: " + Math.sin(rad));
        System.out.println("Cosseno: " + Math.cos(rad));
        System.out.println("Tangente: " + Math.tan(rad));
        */

        // 7
        /*
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distância: " + distancia);
        */

        // 8
        /*
        System.out.print("Número 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Número 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Número 3: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        double somaAbs = Math.abs(n1) + Math.abs(n2) + Math.abs(n3);
        double maiorDif = Math.max(Math.max(Math.abs(n1 - n2), Math.abs(n1 - n3)), Math.abs(n2 - n3));

        System.out.println("Média: " + media);
        System.out.println("Soma dos valores absolutos: " + somaAbs);
        System.out.println("Maior diferença: " + maiorDif);
        */

        // 9
        /*
        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Sem raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
        */

        // 10
        /*
        System.out.print("Temperatura em Fahrenheit: ");
        double f = scanner.nextDouble();

        double c = (f - 32) * 5/9;

        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + c);
        */

        scanner.close();
    }
}


