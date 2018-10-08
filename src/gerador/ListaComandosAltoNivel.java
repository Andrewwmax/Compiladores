package gerador;

import java.util.LinkedList;

public class ListaComandosAltoNivel {

    LinkedList<ComandoAltoNivel> ListaComandosAltoNivel;

    public void ListaComandosAltoNivel() {
    }

    public void addComando(ComandoAltoNivel _cmd) {
    	this.ListaComandosAltoNivel.add(_cmd);
    }

    public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel() {
        return this.ListaComandosAltoNivel;
    }

    public String toString() {
        return null;
    }
}
