public abstract class SeguroHandler {
    protected SeguroHandler seguroHandlerSucessor;
    
    public void setProximo(SeguroHandler seguroHandlerSucessor) {
        this.seguroHandlerSucessor = seguroHandlerSucessor;
    }

    public abstract void calcularSeguro(Cliente cliente);
    public abstract String getPlanoSeguro();
}
