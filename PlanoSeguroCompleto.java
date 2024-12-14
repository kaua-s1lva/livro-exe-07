import java.util.ArrayList;
import java.util.List;

public class PlanoSeguroCompleto extends SeguroHandler {

    private List<String> beneficios;

    public PlanoSeguroCompleto () {
        beneficios = new ArrayList<>();
        beneficios.add("cobertura de danos a terceiros");
        beneficios.add("cobertura de danos ao próprio veículo");
        beneficios.add("cobertura contra furto");
    }

    @Override
    public void calcularSeguro(Cliente cliente) {
        if (cliente.getNumAcidentesUltimosCincoAnos() <= 1 && 
            cliente.getIdade() <= 35 && cliente.getIdade() >= 25 && 
            cliente.getAnosBonusSeguro() >= 5
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
        return "Plano de seguro completo";
    }
    
}
