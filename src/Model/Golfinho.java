package Model;

public class Golfinho extends Animal {

    boolean sonar;
    boolean barbatanas;
    String cor;

    public Golfinho(String nome, String especie, String genero, String alimentacao,
                    int idade, boolean riscoDeExtincao, boolean sonar, boolean barbatanas, String cor) {
        super(nome, especie, genero, alimentacao, idade, riscoDeExtincao);
        this.sonar = sonar;
        this.barbatanas = barbatanas;
        this.cor = cor;
    }

    public boolean isSonar() {
        return sonar;
    }

    public void setSonar(boolean sonar) {
        this.sonar = sonar;
    }

    public boolean isBarbatanas() {
        return barbatanas;
    }

    public void setBarbatanas(boolean barbatanas) {
        this.barbatanas = barbatanas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Golfinho(String nome, String especie, String genero, String alimentacao, int idade, boolean riscoDeExtincao) {
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
        return "Golfinho{" +
                "nome ='" + nome + '\'' +
                ", especie ='" + especie + '\'' +
                ", genero ='" + genero + '\'' +
                ", alimentacao ='" + alimentacao + '\'' +
                ", idade=" + idade +
                ", risco De Extincao=" + riscoDeExtincao +
                ", sonar =" + sonar +
                ", barbatanas =" + barbatanas +
                ", cor ='" + cor + '\'' +
                '}';
    }
}
