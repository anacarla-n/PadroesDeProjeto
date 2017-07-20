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
public class PlanoCidadePrototype extends PlanoPrototype{
    
    protected PlanoCidadePrototype(PlanoCidadePrototype especial) {
        this.qntPessoas = especial.getQntPessoas();
    }

    public PlanoCidadePrototype() {
        qntPessoas = 0;
    }
    
        
    @Override
    public String exibirInfo() {
       System.out.println("Plano: CIDADE");
        System.out.println("CONTRATO: SEM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
       return ("VALOR:"+ getQntPessoas() * 200);
        
        }

    @Override
    public PlanoPrototype clonar() {
        return new PlanoCidadePrototype(this);
    }
}
