import java.util.ArrayList;
import java.util.List;

public class PlanoSeguroBasico extends SeguroHandler {

    private List<String> beneficios;

    public PlanoSeguroBasico () {
        beneficios = new ArrayList<>();
        beneficios.add("cobertura de danos a terceiros");
    }

    @Override
    public void calcularSeguro(Cliente cliente) {
        if (cliente.getAnosExperiencia() > 10 && 
            cliente.getNumAcidentesUltimosCincoAnos() == 0 && 
            cliente.getIdade() > 35
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
        return "Plano de seguro básico";
    }
}
