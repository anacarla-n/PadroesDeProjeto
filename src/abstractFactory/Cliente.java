/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author bol.ana.santos
 */
public class Cliente {
    public static void main(String[] args) {
        FabricaPlano plano = new FabricaCidade();
        PlanoSaude cidade = plano.criarPlanoSaude();
        cidade.exibirInfo(1);
        System.out.println();
        
        FabricaPlano plano2 = new FabricaEspecial();
        PlanoSaude especial = plano2.criarPlanoSaude();
        especial.exibirInfo(1);
        System.out.println();

        FabricaPlano plano3 = new FabricaNacional();
        PlanoSaude nacional = plano3.criarPlanoSaude();
        nacional.exibirInfo(1);
        System.out.println();
    }
    
}
