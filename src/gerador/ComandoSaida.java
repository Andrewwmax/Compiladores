package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoAtribuicao;
import primitivo.PrimitivoSaida;
import semantico.Simbolo;
import semantico.*;

public class ComandoSaida extends ComandoAltoNivel {

    private Expressao expressao;

    public ComandoSaida(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
       	lista.addComando(new PrimitivoSaida(TipoDado.STR));
    	return lista;
    }

    @Override
    public String toString() {
    	return "\n\nComando Exibe:" + this.expressao.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

}
