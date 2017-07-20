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
public enum TipoDePlano {
    
     Cidade {
         @Override
         public Plano obterPlano() {
            return new Cidade();   
         }
     },
     Especial {
         @Override
         public Plano obterPlano() {
             return new Especial();
         }
     },
     Nacional {
         @Override
         public Plano obterPlano() {
             return new Nacional();
         }
     };
    
    
    public abstract Plano obterPlano();
}
