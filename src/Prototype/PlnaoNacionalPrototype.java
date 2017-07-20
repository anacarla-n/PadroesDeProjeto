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
public class PlnaoNacionalPrototype extends PlanoPrototype{
    
    protected PlnaoNacionalPrototype(PlnaoNacionalPrototype especial) {
        this.qntPessoas = especial.getQntPessoas();
    }

    public PlnaoNacionalPrototype() {
        qntPessoas = 0;
    }
    
        
    @Override
    public String exibirInfo() {
       System.out.println("Plano: NACIONAL");
        System.out.println("CONTRATO: SEM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
       return ("VALOR:"+ getQntPessoas() * 700);
        
        }

    @Override
    public PlanoPrototype clonar() {
        return new PlnaoNacionalPrototype(this);
    }
}
