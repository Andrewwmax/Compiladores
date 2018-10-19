package gerador;

import primitivo.*;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel {
    
	private Simbolo variavel;
    private Expressao expressao;
    
    public ComandoAtribuicao(Simbolo _simb, Expressao _exp) {
    	this.variavel = _simb;
    	this.expressao = _exp;
    }
    
    @Override
    public String toString() {
    	return "\n\nComando Atribuicao de simbolo:" + this.variavel.toString() 
    		  + this.expressao.toString();
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
       	lista.addComando(new PrimitivoAtribuicao(this.variavel.getReferencia(), this.variavel.getTipo(), this.expressao.toString()));
    	return lista;
    }

    public Simbolo getVariavel() {
        return variavel;
    }

    public Expressao getExpressao() {
        return expressao;
    }
    
}
