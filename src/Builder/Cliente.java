/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.Scanner;

/**
 *
 * @author Ana Carla
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        EmpresaDirector saude = new EmpresaDirector(new CidadeBuilder());
	   
        System.out.println("Quantidade de Pessoas?");
	
        saude.construirPlano(ler.nextInt());
	PlanoProduct plano = saude.getPlano();
        System.out.println("\nValor: " + plano.preco);

        /*
	    System.out.println();
	 
	    concessionaria = new ConcessionariaDirector(new VolksBuilder());
	    concessionaria.construirCarro();
	    carro = concessionaria.getCarro();
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	            + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	            + carro.dscMotor + "\nValor: " + carro.preco);
        */

    }
    
}
