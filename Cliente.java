public class Cliente {
    private int anosExperiencia;
    private int numAcidentesUltimosCincoAnos;
    private int idade;
    private int anosBonusSeguro;
    private int numVeiculos;
    private Seguro seguro;
    
    public Cliente(int anosExperiencia, int numAcidentesUltimosCincoAnos, int idade, int anosBonusSeguro, int numVeiculos) {
        this.anosExperiencia = anosExperiencia;
        this.numAcidentesUltimosCincoAnos = numAcidentesUltimosCincoAnos;
        this.idade = idade;
        this.anosBonusSeguro = anosBonusSeguro;
        this.numVeiculos = numVeiculos;
        seguro = new Seguro();
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getNumAcidentesUltimosCincoAnos() {
        return numAcidentesUltimosCincoAnos;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosBonusSeguro() {
        return anosBonusSeguro;
    }

    public int getNumVeiculos() {
        return numVeiculos;
    }

    public Seguro getSeguro() {
        return seguro;
    }

}
