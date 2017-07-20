/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author bol.ana.santos
 */
public class PlanoEspecialPrototype extends PlanoPrototype{

    protected PlanoEspecialPrototype(PlanoEspecialPrototype especial) {
        this.qntPessoas = especial.getQntPessoas();
    }

    public PlanoEspecialPrototype() {
        qntPessoas = 0;
    }
    
        
    @Override
    public String exibirInfo() {
       System.out.println("Plano: ESPECIAL");
       System.out.println("CONTRATO: COM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
       return ("VALOR:"+ getQntPessoas() * 350);
        
        }

    @Override
    public PlanoPrototype clonar() {
        return new PlanoEspecialPrototype(this);
    }
    
}
