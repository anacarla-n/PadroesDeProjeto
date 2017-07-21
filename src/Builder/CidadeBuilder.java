/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Ana Carla
 */
public class CidadeBuilder extends PlanoBuilder{

    @Override
    public void buildPreco(int qntPessoa) {
        System.out.println("VALOR:"+ qntPessoa * 200);
    }

    @Override
    public void buildDscPlano() {
        System.out.println("CONTRATO: SEM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
    }

    @Override
    public void buildTipoPlano() {
        System.out.println("Cidade");
    }
    
}
