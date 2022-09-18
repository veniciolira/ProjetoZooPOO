package Model;
public class Zoologico {
    String nome;
    Habitat habitat;

    public Zoologico(Object zoo_paraiso) {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Zoologico(String nome, Habitat habitat) {
        this.nome = nome;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setListaDeAnimais(int i, Leao leao) {
    }

    public void setListaDeAnimais(int i, Arara arara) {
    }

    public void setListaDeAnimais(int i, Golfinho golfinho) {
    }

    public void setListaDeAnimais(int i, Jacare jacare) {
    }
}