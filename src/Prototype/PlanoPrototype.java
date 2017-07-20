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
public abstract class PlanoPrototype {
    protected  int qntPessoas;
    
    public abstract String exibirInfo();
    
    public abstract PlanoPrototype clonar();

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }
    
    
}
