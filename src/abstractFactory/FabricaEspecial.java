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
public class FabricaEspecial implements FabricaPlano{

    @Override
    public PlanoSaude criarPlanoSaude() {
        return new PlanoEspecial();
    }
    
}
