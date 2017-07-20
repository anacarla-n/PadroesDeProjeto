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
public class MenuCalcularPlano {
    
    
    public void calcularPlano(int op, int qntPessoas){
        TipoDePlano tipoPlano = TipoDePlano.values()[op-1];
        Plano plano = tipoPlano.obterPlano();
        double totPlano = plano.calcularPlano(qntPessoas);
        System.out.print(totPlano);
    }
    
             
    
}
