/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Ana Carla
 */
public class EmpresaDirector {

    protected PlanoBuilder TipoPlano;

    public EmpresaDirector(PlanoBuilder plano) {
        this.TipoPlano = plano;
    }

    public void construirPlano(int qnt) {
        TipoPlano.buildPreco(qnt);
        TipoPlano.buildDscPlano();
        TipoPlano.buildTipoPlano();

    }

    public PlanoProduct getPlano() {
        return TipoPlano.getPlano();

    }
}
