package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoEntrada;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel {

    private Simbolo variavel;

    public ComandoEntrada(Simbolo variavel) {
		this.variavel = variavel;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
       	lista.addComando(new PrimitivoEntrada(this.variavel.getReferencia(), this.variavel.getTipo()));
    	return lista;
    }

    @Override
    public String toString() {
        return "\n\nComando Le:" + this.variavel.toString();
    }

    public Simbolo getVariavel() {
        return variavel;
    }

}
