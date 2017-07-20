/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author bol.ana.santos
 */
public class Cidade implements Plano{

    @Override
    public double calcularPlano(int qntPessoa) {
        System.out.println("CONTRATO: SEM APARTAMENTO (ATENDIMENTO NO PRÓPRIO ESTADO)");
        System.out.print("VALOR:");
        return qntPessoa * 200;
    }
    
}
