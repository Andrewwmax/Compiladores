package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoSaida extends ComandoAltoNivel {

    private Expressao expressao;

    public void ComandoSaida(Expressao _exp) {
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    public Expressao getExpressao() {
        return expressao;
    }

}
