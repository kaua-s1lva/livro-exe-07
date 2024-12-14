public class Principal {
    public static void main (String[] args) {
        Cliente cliente = new Cliente(
                        20, 
                        0, 
                        30, 
                        4, 
                        3
                        );

        SeguroHandler basico = new PlanoSeguroBasico();
        SeguroHandler completo = new PlanoSeguroCompleto();
        SeguroHandler premium = new PlanoSeguroPremium();

        basico.setProximo(completo);
        completo.setProximo(premium);

        basico.calcularSeguro(cliente);

        System.out.println(cliente.getSeguro().getNome());
        System.out.println(cliente.getSeguro().getBeneficios());
    }
}