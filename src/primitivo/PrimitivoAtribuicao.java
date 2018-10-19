package primitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

    private int referencia;
    private TipoDado tipo;
    private String expDestinoAssembler;

    public PrimitivoAtribuicao(int referencia, TipoDado tipo, String expDestinoAssembler) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.expDestinoAssembler = expDestinoAssembler;
    }

    public PrimitivoAtribuicao(int referencia, TipoDado tipo) {
		this.referencia = referencia;
		this.tipo = tipo;
	}

	@Override
    public String geraCodigoDestino() {
    	return null;
    }

    @Override
    public String toString() {
        return "\n\nReferencia: " + this.referencia
        	 + "\nTipo: " + this.tipo.toString() 
        	 + "\nExpressao Destino: " + this.expDestinoAssembler;
    }

    public int getReferencia() {
        return referencia;
    }

    public TipoDado getTipo() {
        return tipo;
    }

    public String getExpDestinoAssembler() {
        return expDestinoAssembler;
    }

}
