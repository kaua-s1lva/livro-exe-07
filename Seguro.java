import java.util.ArrayList;
import java.util.List;

public class Seguro {
    private String nome;
    private List<String> beneficios;

    public Seguro () {
        beneficios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficio) {
        beneficios.add(beneficio);
    }
}
