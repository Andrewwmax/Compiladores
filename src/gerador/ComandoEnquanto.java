package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoAtribuicao;
import semantico.Simbolo;

public class ComandoEnquanto extends ComandoAltoNivel {

    private Expressao expressao;
    private ListaComandosAltoNivel listaComandosAltoNivelTrue;

    public ComandoEnquanto(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
    	return lista;
	}

    @Override
    public String toString() {
    	return "Comando Enquanto:" + this.expressao.toString() 
    		 + "\nLista de Comandos True:" + this.listaComandosAltoNivelTrue.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
        return listaComandosAltoNivelTrue;
    }

}
