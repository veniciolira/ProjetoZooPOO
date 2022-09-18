package Model;

public class Animal {
    String nome;
    String especie;
    String genero;
    String alimentacao;
    int idade;
    boolean riscoDeExtincao;

    public Animal(String nome, String especie, String genero, String alimentacao, int idade, boolean riscoDeExtincao) {
        this.nome = nome;
        this.especie = especie;
        this.genero = genero;
        this.alimentacao = alimentacao;
        this.idade = idade;
        this.riscoDeExtincao = riscoDeExtincao;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isRiscoDeExtincao() {
        return riscoDeExtincao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        this.riscoDeExtincao = riscoDeExtincao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", genero='" + genero + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", idade=" + idade +
                ", riscoDeExtincao=" + riscoDeExtincao +
                '}';
    }
}
