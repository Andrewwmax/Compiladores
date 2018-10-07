package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {

    private Simbolo variavel;

    public void ComandoEntrada(Simbolo _simb) {
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

    public Simbolo getVariavel() {
        return variavel;
    }

}
