
package atividade02gabrielavelino.java;

import java.util.Scanner;

public class Atividade02GabrielAvelino {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 1

        /*System.out.println("Raio do Círculo: ");
        double raioCirculo = scanner.nextDouble();

        double AreaCirculo = 3.14 * (Math.pow(raioCirculo, 2));
        double circunCirculo = 2 * 3.14 * raioCirculo;

        System.out.println(AreaCirculo);
        System.out.println(circunCirculo);

        scanner.close();*/

        // 2

        /*System.out.println("Peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();
        
        double IMC = peso / Math.pow(altura, 2);
        
        System.out.println(IMC); */
        
        // 3
        
        /* System.out.print("Cateto 1: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Cateto 2: ");
        double cateto2 = scanner.nextDouble();
        
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.print(hipotenusa); */

        // 4 
        // a)
        /* System.out.print("Valor em Reais: ");
        double reais = scanner.nextDouble();
        
        double dolar = 5.30;
        System.out.print("\"Cotacao do Dolar: " +  dolar + "\"");
        
        double qtdRD = Math.floor(reais / dolar);
        
        System.out.print("\"Pode Comprar " + qtdRD + " Dolares. " + "\"");
        
        // b)
        
        double troco = reais - (dolar * qtdRD);
        
        System.out.print("\"Troco: " + troco + "\""); */
        
        //5 
        
        int n, j1,j2,s;
        System.out.print("Insira a quantidade de jogadas");
        n = scanner.nextInt();
        
        System.out.print ("Insiza o 1º valor: ");
        j1 = scanner.nextInt();
        
        System.out.print("Insira o 2º valor: ");
        j2 = scanner.nextInt();
        
        s = (j1 + j2)/n;
        System.out.print("A média e: "+ s);
        
        System.out.print("N maior é "+ Math.max(j1, j2));
        System.out.print("N menor é "+ Math.min(j1, j2));
        
        
    }
}

