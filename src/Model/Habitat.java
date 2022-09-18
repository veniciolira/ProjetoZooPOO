package Model;

public class Habitat {
    Animal[] listaDeAnimal;

    public Habitat(int capacidadeDoAmbiente) {
        listaDeAnimal = new Animal[capacidadeDoAmbiente];
    }

    public void getlistaDeAnimal() {
        for (int i = 0; i < this.listaDeAnimal.length; i++) {
            System.out.println(listaDeAnimal[i]);
        }
    }

    public void setListaDeAnimal(Animal[] listaDeAnimal) {
        this.listaDeAnimal = listaDeAnimal;
    }

    @Override
    public String toString() {
        this.getlistaDeAnimal();
        return "lista";
    }
}