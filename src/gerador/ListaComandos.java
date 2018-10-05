package gerador;

import java.util.LinkedList;

public class ListaComandos {	
	public LinkedList<ComandoAltoNivel> comandos;
	
	public ListaComandos() {
	   this.comandos = new LinkedList<ComandoAltoNivel>();
	}
	
	public void novoComando(ComandoAltoNivel com) {
	   this.comandos.add(com);
	}
	
    public String toString() {
    	return this.comandos.toString();
    }

}