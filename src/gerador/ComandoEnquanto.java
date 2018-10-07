package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoEnquanto extends ComandoAltoNivel {

    private Expressao expressao;
    private ListaComandosAltoNivel listaComandosAltoNivelTrue;

    public void ComandoEnquanto(Expressao _exp, ListaComandosAltoNivel _lista) {
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
        return listaComandosAltoNivelTrue;
    }

}
