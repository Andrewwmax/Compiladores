package apoio;

import semantico.Tabela;
import semantico.Tipo;
import semantico.Simbolo;

public class AcoesSemanticas {

	public static void verificarInicializacao(Tabela tabela, String t, int l) {
	     if(!(tabela.isExiste(t))) {
	    	 throw new ErroSemantico("Erro sem�ntico vari�vel "+t+ " n�o foi declarada na linha "+l);
	      }
	}
	
	public static void adicionarTabela (Tabela tabela, String t, String tipo, int l) {
		if((tabela.isExiste(t))) {
			throw new ErroSemantico("Erro: vari�vel "+t+" duplicada na linha "+l);
		}
		else {
			if(tipo.equals("NUMERO")) {
				Simbolo simb = new Simbolo(t,Tipo.NUMERO);
				tabela.inclui(simb);
				
			}
			else {
				Simbolo simb = new Simbolo(t,Tipo.PALAVRA);
				tabela.inclui(simb);
			
			}
		}
	}
}
