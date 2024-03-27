package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variáveis auxiliares da main + scanner
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        //Entra com os dados da arena
        System.out.print("Insira o nome da Arena: ");
        String nomeArena = sc.nextLine();
        System.out.print("Insira o local da Arena: ");
        String localArena = sc.nextLine();

        //Cria a nova arena
        Arena arena = new Arena(nomeArena,localArena);

        //Início do programa
        System.out.println("Olá, bem-vindo à Arena " + arena.nome);
        while(!sair){
            //Lista de opções
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar um rapper");
            System.out.println("2 - Mostrar informações (rappers e arena)");
            System.out.println("3 - Mostrar rappers com microfones dourados");
            System.out.println("4 - Mostrar o primeiro e último lugar");
            System.out.println("5 - sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            switch (opcao){
                //Adicionar um rapper
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Digite o nome do rapper: ");
                    String nome = sc.nextLine();
                    float nota;
                    //Limitador de nota (de 0 até 10)
                    do {
                        System.out.print("Digite a nota do rapper: ");
                        nota = sc.nextFloat();
                    }while(nota < 0 || nota > 10);
                    System.out.print("Digite a idade do rapper: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    String material;
                    //Limitador de material
                    do {
                        System.out.print("Digite o microfone do rapper: ");
                        material = sc.nextLine();
                    }while(!material.equalsIgnoreCase("dourado") && !material.equalsIgnoreCase("madeira") && !material.equalsIgnoreCase("plastico"));
                    //a comparação é feita ignorando a case (maiúsculo e minúsculo) feita pelo usuário
                    //pode escrever DouRADo que funciona :)
                    Rapper rapper = new Rapper(nome,nota,idade,material);
                    arena.addRapper(rapper);
                }
                //Mostra info da arena e dos rappers
                case 2 -> arena.mostraInfo();

                //Mostra os rappers que possuem microfone dourado
                case 3 -> arena.microfoneDou();

                //Mostra o primeiro e último lugar
                case 4 -> arena.ranking();

                //Sai do programa
                case 5 -> {
                    sair = true;
                    System.out.println("Obrigado por usar o programa!");
                }

                //Verificação de entrada inválida
                default -> System.out.println("Inválido");
            }
        }
        sc.close();
    }
}