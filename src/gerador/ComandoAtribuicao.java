package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel {
    private Simbolo variavel;
    private Expressao expressao;
    public void ComandoAtribuicao(Simbolo _simb, Expressao _exp) {
    }
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Simbolo getVariavel() {
        return variavel;
    }

    public Expressao getExpressao() {
        return expressao;
    }
    
}
