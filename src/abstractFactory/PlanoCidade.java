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
public class PlanoCidade implements PlanoSaude{
    
    
    @Override
    public void exibirInfo(int qntPessoa) {
        int valorPagar = 200 * qntPessoa;
        System.out.println("Plano: Cidade");
        System.out.println("CONTRATO: SEM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
        System.out.print("VALOR:" + valorPagar);
       
    }
}
