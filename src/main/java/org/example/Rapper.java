package org.example;

public class Rapper {
    //Atributos
    String nome;
    float nota;
    int idade;
    Microfone microfone; //guarda a instância de microfone

    //Métodos
    //Construtor de rapper
    public Rapper(String nome, float nota, int idade, String material) {
        this.nome = nome.toLowerCase();
        this.nota = nota;
        this.idade = idade;
        this.microfone = new Microfone(material);
    }

    //Mostra as infos do rapper
    void mostraInfo(){
        //Esse sout vai pegar a substring de microfone (primeira letra neste caso) e formatar para primeira letra
        //permitindo capitalização
        //não importa como o usuário insira o material, sempre será: Dourado, Madeira, Plastico
        String string = this.nome;
        System.out.println("Nome do Rapper: " + string.substring(0,1).toUpperCase().concat(string.substring(1)));
        System.out.println("Nota do Rapper: " + this.nota);
        System.out.println("Idade do Rapper: " + this.idade);
        string = this.microfone.material;
        System.out.println("Microfone do Rapper: " + string.substring(0,1).toUpperCase().concat(string.substring(1)));
    }
}
