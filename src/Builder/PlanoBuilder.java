package Builder;

/**
 *
 * @author Ana Carla
 */
public abstract class PlanoBuilder {

    

        protected PlanoProduct plano = new PlanoProduct();
        public abstract void buildPreco(int qntPessoa);
        public abstract void buildDscPlano();
        public abstract void buildTipoPlano();
        
        public PlanoProduct getPlano() {
            return plano;
        }

    
}
