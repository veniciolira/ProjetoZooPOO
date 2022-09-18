package Model;

public class Arara extends Animal{
    boolean bico;
    boolean garras;
    String cor;

    public Arara(String nome, String especie, String genero, String alimentacao, int idade,
                 boolean riscoDeExtincao, boolean bico, boolean garras, String cor) {
        super(nome, especie, genero, alimentacao, idade, riscoDeExtincao);
        this.bico = bico;
        this.garras = garras;
        this.cor = cor;
    }

    public boolean isBico() {
        return bico;
    }

    public void setBico(boolean bico) {
        this.bico = bico;
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Arara(String nome, String especie, String genero, String alimentacao, int idade, boolean riscoDeExtincao) {
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
        return "Ararara{" +
                "nome='" + nome + '\'' +
                ", especie ='" + especie + '\'' +
                ", genero ='" + genero + '\'' +
                ", alimentacao ='" + alimentacao + '\'' +
                ", idade =" + idade +
                ", risco De Extincao=" + riscoDeExtincao +
                ", bico =" + bico +
                ", garras =" + garras +
                ", cor ='" + cor + '\'' +
                '}';
    }
}
