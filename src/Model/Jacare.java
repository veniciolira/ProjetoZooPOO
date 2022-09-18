package Model;

public class Jacare extends Animal {

    boolean verde;
    boolean presas;
    boolean garras;
    boolean escamas;

    public Jacare(String nome, String especie, String genero, String alimentacao,
                  int idade, boolean riscoDeExtincao, boolean verde, boolean presas, boolean garras, boolean escamas) {
        super(nome, especie, genero, alimentacao, idade, riscoDeExtincao);
        this.verde = verde;
        this.presas = presas;
        this.garras = garras;
        this.escamas = escamas;
    }

    public boolean isVerde() {
        return verde;
    }

    public void setVerde(boolean verde) {
        this.verde = verde;
    }

    public boolean isPresas() {
        return presas;
    }

    public void setPresas(boolean presas) {
        this.presas = presas;
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public Jacare(String nome, String especie, String genero, String alimentacao, int idade, boolean riscoDeExtincao) {
        super(nome, especie, genero, alimentacao, idade, riscoDeExtincao);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public String getAlimentacao() {
        return super.getAlimentacao();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public boolean isRiscoDeExtincao() {
        return super.isRiscoDeExtincao();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public void setAlimentacao(String alimentacao) {
        super.setAlimentacao(alimentacao);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        super.setRiscoDeExtincao(riscoDeExtincao);
    }

    @Override
    public String toString() {
        return "Jacare{" +
                "nome ='" + nome + '\'' +
                ", especie ='" + especie + '\'' +
                ", genero ='" + genero + '\'' +
                ", alimentacao ='" + alimentacao + '\'' +
                ", idade =" + idade +
                ", risco De Extincao=" + riscoDeExtincao +
                ", verde=" + verde +
                ", presas =" + presas +
                ", garras =" + garras +
                ", escamas =" + escamas +
                '}';
    }
}



