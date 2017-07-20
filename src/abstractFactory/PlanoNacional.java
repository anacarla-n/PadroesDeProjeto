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
class PlanoNacional implements PlanoSaude{

    @Override
    public void exibirInfo(int qntPessoa) {
        int valorPagar = 700 * qntPessoa;
        System.out.println("Plano: Nacional");
        System.out.println("CONTRATO: COM APARTAMENTO (ATENDIMENTO NIVEL NACIONAL)");
        System.out.print("VALOR:" + valorPagar);
       
    }
    
}
