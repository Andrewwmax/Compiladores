package primitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {

    LinkedList<ComandoPrimitivo> listaComandosPrimitivos;

    public ListaComandosPrimitivos() {
    	this.listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
    }

    public void addComando(ComandoPrimitivo _cmd) {
    	this.listaComandosPrimitivos.add(_cmd);
    }
    
    public ListaComandosPrimitivos concatListaPrimitivo(ListaComandosPrimitivos _cmd, ListaComandosPrimitivos _cmd2) {
    	_cmd.listaComandosPrimitivos.addAll(_cmd2.getListaComandosPrimitivos());
    	return _cmd;
    }
    
    
    public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos() {
        return listaComandosPrimitivos;
    }
    
    public String toString() {
        return "\nLista de Comandos Primitivos:" + this.listaComandosPrimitivos.toString();
    }
}
