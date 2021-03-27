package exercicio3;

import java.util.Scanner;


public class Exercicio3 {

   
    public static void main(String[] args) {
        
        Scanner leia;
        
        Scanner entrada=new Scanner(System.in);
        
        int Num;
        float fracao;
        double arredondamento ;
        double resultado;
       
        
        System.out.println("Digite um número");
        
        Num = entrada.nextInt();
        
        
        System.out.println("parte facionária");
        fracao = Num/10;
        System.out.println(fracao);
        
        System.out.println("arredondamento");
        arredondamento =(int) Math.ceil (fracao);
        
        
        System.out.println(arredondamento);
        
        
        
       
     
}
}