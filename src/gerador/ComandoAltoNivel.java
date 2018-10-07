package gerador;

import parser.Token;
import primitivo.ListaComandosPrimitivos;

/**
 *
 * @author andrewwmax
 */
public abstract class ComandoAltoNivel {

    private Token token; //somente o Principal

    public String getLexema() {
        return null;
    }

    public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();

    public abstract String toString();
}
