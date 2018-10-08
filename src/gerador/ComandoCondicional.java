package gerador;

import primitivo.ListaComandosPrimitivos;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	Expressao _exp;
	ListaComandosAltoNivel _lista;
	
    public ComandoCondicional(Expressao _exp, ListaComandosAltoNivel _lista) {
		super();
		this._exp = _exp;
		this._lista = _lista;
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	// TODO Auto-generated method stub
    	return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

}
