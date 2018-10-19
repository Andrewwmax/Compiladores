package primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo {

    private TipoDado tipo;
    private String expDestinoAssembler;

    public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler) {
        this.tipo = tipo;
        this.expDestinoAssembler = expDestinoAssembler;
    }

    public PrimitivoSaida(TipoDado tipo) {
		this.tipo = tipo;
	}

	@Override
    public String geraCodigoDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return "\nPrimitivo Saida:"
        	 + "\nTipo:" + this.tipo 
        	 + "\nExpressao Destino:" + this.expDestinoAssembler;
    }

}
