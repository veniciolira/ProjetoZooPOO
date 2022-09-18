package Main;

import Model.*;

public class Main {
    private static boolean Zoologico;
    private static Model.Habitat Habitat;

    public static void main(String[] args) {
        Model.Zoologico terrestre = new Zoologico(3);

        Leao leao = new Leao("Mufasa","Felino","Masculino",
                "Carnivoro",4,false,true,true);

        terrestre.setListaDeAnimais(0,leao);

        System.out.println(leao);

        Jacare jacare = new Jacare("Geraldo","Jacare-de-papo-amarelo","Masculino","Carnivoro",
                2,true,true,true,true,true);

        System.out.println(jacare);

        terrestre.setListaDeAnimais(1,jacare);

        Model.Zoologico aquaticos = new Zoologico(3);

        Golfinho golfinho = new Golfinho("Olly","Boto","Femea","Carnivoro",1,true,
                true,true,"Azul");
        aquaticos.setListaDeAnimais(0,golfinho);

        System.out.println(golfinho);


        Model.Zoologico aereos = new Zoologico(3);
        Arara arara = new Arara("Biscoito","Arara-Azul","Macho","Herbivoro",
                3,true,true,true,"Albino");
        aereos.setListaDeAnimais(0,arara);

        Zoologico zoologicoigoParaiso = new Zoologico(
                "Zoo Paraiso",
                Habitat
        );

        System.out.println(zoologicoigoParaiso);

    }
}