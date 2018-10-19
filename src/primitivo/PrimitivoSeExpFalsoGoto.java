package primitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo {

    private String expDestinoAssembler;
    private PrimitivoLabel labelFalse;
    private ListaComandosPrimitivos listaComandosPrimitivosTrue;

    public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
        this.expDestinoAssembler = expDestinoAssembler;
        this.labelFalse = labelFalse;
        this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
    }
    

    public PrimitivoSeExpFalsoGoto(PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}


	@Override
    public String geraCodigoDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return "\nPrimitivo Se Exp Falso Goto:" 
        	 + "\nExpressao Destino:" + this.expDestinoAssembler
        	 + this.labelFalse.toString()
        	 + this.listaComandosPrimitivosTrue.toString();
    }

}
