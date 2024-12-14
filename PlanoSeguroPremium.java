import java.util.ArrayList;
import java.util.List;

public class PlanoSeguroPremium extends SeguroHandler {

    private List<String> beneficios;

    public PlanoSeguroPremium () {
        beneficios = new ArrayList<>();
        beneficios.add("cobertura de danos a terceiros");
        beneficios.add("cobertura de danos ao próprio veículo");
        beneficios.add("cobertura contra furto");
        beneficios.add("assistência 24 horas");
    }

    @Override
    public void calcularSeguro(Cliente cliente) {
        if (cliente.getNumVeiculos() > 2 && 
            cliente.getIdade() <= 35 && cliente.getIdade() >= 25 && 
            cliente.getAnosBonusSeguro() < 5
        ) {
            cliente.getSeguro().setNome(getPlanoSeguro());
            for (String beneficio : beneficios) {
                cliente.getSeguro().setBeneficios(beneficio);
            }
        } else if (seguroHandlerSucessor != null) {
            seguroHandlerSucessor.calcularSeguro(cliente);
        }
    }

    @Override
    public String getPlanoSeguro() {
        return "Plano de seguro premium";
    }
}
