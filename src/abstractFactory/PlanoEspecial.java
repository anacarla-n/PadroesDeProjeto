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
class PlanoEspecial implements PlanoSaude{

    @Override
    public void exibirInfo(int qntPessoa) {
        int valorPagar = 350 * qntPessoa;
        System.out.println("Plano: Especial");
        System.out.println("CONTRATO: COM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
        System.out.print("VALOR:" + valorPagar);
       
    }
}
