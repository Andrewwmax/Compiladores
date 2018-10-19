package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoLabel;
import primitivo.PrimitivoSeExpFalsoGoto;

public class ComandoCondicionalSimples extends ComandoCondicional {

    public ComandoCondicionalSimples(Expressao _exp, ListaComandosAltoNivel _lista) {
    	super(_exp, _lista);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
    	return null;
    }

}
