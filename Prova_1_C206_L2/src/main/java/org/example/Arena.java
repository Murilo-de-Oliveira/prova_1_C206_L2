package org.example;

public class Arena {
    //Atributos
    String nome;
    String lugar;
    Rapper[] rappers = new Rapper[10]; //array de rapper

    //Métodos
    //Construtor
    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    //Adicionar rapper
    void addRapper(Rapper rapper){
        for(int i = 0; i < rappers.length; i++){
            //verificação de tipos nulos (só adiciona se for nulo)
            if(rappers[i] == null){
                rappers[i] = rapper;
                System.out.println("Rapper adicionado!");
                break;
            }
        }
    }

    //Mostra infos dos rappers e da arena
    void mostraInfo(){
        System.out.println("Arena: " + this.nome);
        System.out.println("Local: " + this.lugar);
        for(Rapper rapper : rappers){
            if(rapper != null){
                rapper.mostraInfo();
            }
        }
    }

    //Mostra os rappers que possuem microfone dourado
    void microfoneDou(){
        System.out.println("Microfones dourados: ");
        for(Rapper rapper : rappers){
            //tratamento de tipos nulos (não mostra se for nulo)
            if(rapper != null){
                if(rapper.microfone.material.equals("dourado")){
                    //mesmo esquema de mostrar string capitalizadas
                    System.out.println(rapper.nome.substring(0,1).toUpperCase().concat(rapper.nome.substring(1)));
                }
            }
        }
    }

    //Mostra o ranking dos rappers (primeiro e último lugar baseado na nota)
    void ranking(){
        int maior = 0;
        int menor = 0;
        for(int i = 0; i < rappers.length; i++){
            //tratamento de tipos nulos (não mostra se for nulo)
            if(rappers[i] != null){
                //armazena o índex do primeiro rapper para comparação
                if(i == 0){
                    maior = i;
                    menor = i;
                }
                else{
                    if(rappers[i].nota > rappers[maior].nota){
                        maior = i;
                    }
                    if(rappers[i].nota < rappers[menor].nota){
                        menor = i;
                    }
                }
            }
        }
        String string = rappers[maior].nome;
        System.out.println("Ganhador: " + string.substring(0,1).toUpperCase().concat(string.substring(1)) + " " + rappers[maior].nota);
        string = rappers[menor].nome;
        System.out.println("Último lugar: " + string.substring(0,1).toUpperCase().concat(string.substring(1)) + " " + rappers[menor].nota);
    }
}
