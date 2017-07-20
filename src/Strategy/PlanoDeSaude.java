/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.util.Scanner;

/**
 *
 * @author bol.ana.santos
 */
public class PlanoDeSaude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        MenuCalcularPlano menu = new MenuCalcularPlano();
        
        System.out.println("Informe a quantidade de pessoas que pretende adquirir o plano");
        int qntPessoas = ler.nextInt();
        System.out.println("Qual o tipo de Plano? (1) Estado (2)Especial Estado (3)Nacional");
        int op = ler.nextInt();
        
        switch(op){
            case 1:
                menu.calcularPlano(op, qntPessoas);
                break;
            case 2:
                menu.calcularPlano( op, qntPessoas);
                break;
            case 3:
                menu.calcularPlano(op, qntPessoas);
                break;
               default:
                   System.out.println("Erro");
                break;
        }
        
        }
        
    }
    

