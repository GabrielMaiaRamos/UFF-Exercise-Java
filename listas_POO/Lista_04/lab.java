package listas_POO.Lista_04;

import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        // int n;
        // float media = 0;
        // float [] notas;
        // Scanner kb = new Scanner(System.in);
        // System.out.print("Escreva a qnt de alunos: ");
        // n = kb.nextInt();
        // notas = new float[n];
        // for (int i = 0; i<n;i++){
        // System.out.printf("Escreva a nota do aluna %d: ", i+1);
        // notas[i] = kb.nextFloat();
        // media += notas[i];
        // }
        // media /= n;
        // System.out.printf("Alunos acima da media (%.2f)\n", media);
        // for(int i =0; i<n; i++){
        // if (notas[i] >= media)
        // System.out.println(notas[i]);
        // }
        // kb.close();

        // int n, k;
        // boolean isIn = false;
        // int [] vetor;
        // Scanner kb = new Scanner(System.in);
        // System.out.print("Escreva a qnt de numeros do vetor: ");
        // n = kb.nextInt();
        // vetor = new int[n];
        // for (int i = 0; i<n;i++){
        // System.out.printf("Escreva o numero %d: ", i+1);
        // vetor[i] = kb.nextInt();
        // }
        // System.out.print("Escreva 'k': ");
        // k = kb.nextInt();
        // for (int i = 0; i<n; i++){
        // if (vetor[i] == k){
        // System.out.printf("Indice %d possui o valor de k\n", i);
        // isIn = true;
        // }
        // }
        // if (!isIn)
        // System.out.printf("Numero %d nao en
        // econtrado!\n", k);
        // kb.close();

        // int n, k, p;
        // int[] vet;
        // Scanner kb = new Scanner(System.in);
        // System.out.print("Digite o tamanho do vetor: ");
        // n = kb.nextInt();
        // if (n==0){
        // System.out.print("vetor nulo!");
        // System.exit(1);
        // }
        // vet = new int[n];
        // for (int i = 0; i<n; i++){
        // System.out.printf("Digite o numero %d: ", i+1);
        // vet[i] = kb.nextInt();
        // }
        // for(int i = 0; i<n; i++)
        // System.out.printf("%d - ", vet[i]);
        // System.out.print("\n");
        // System.out.print("Digite o numero pra inserir");
        // k = kb.nextInt();
        // System.out.print("Digite a posicao do numero: ");
        // p = kb.nextInt();
        // if (p-1 > n){
        // System.out.print("P fora de alcance");
        // System.exit(1);
        // }

        // for (int i = n-1; i>p-1; i--){
        // vet[i] = vet[i-1];
        // }
        // vet[p-1]=k;
        // for(int i = 0; i<n; i++)
        // System.out.printf("%d - ", vet[i]);
        // kb.close();
        // }
        Scanner kb = new Scanner(System.in);
        int tempInt, NUM = 3;
        String tempStr;
        int[] idades = new int[NUM];
        String[] nomes = new String[NUM];
        for (int i = 0; i < NUM; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
            nomes[i] = kb.nextLine();
            System.out.printf("Digite a idade da pessoa %d: ", i + 1);
            idades[i] = kb.nextInt();
            kb.nextLine();
        }

        for (int i = 0; i < NUM - 1; i++) {
            for (int j = 0; j < NUM - i - 1; j++) {
                if (idades[j] > idades[j + 1]) {
                    tempInt = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempInt;

                    tempStr = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempStr;
                }
            }
        }
        for (int i = 0; i < NUM; i++)
            System.out.printf("Nome: %s, Idade: %d\n", nomes[i], idades[i]);

        for (int i = 0; i < NUM - 1; i++) {
            for (int j = 0; j < NUM - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    tempStr = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempStr;

                    tempInt = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempInt;
                }
            }
        }
        for (int i = 0; i < NUM; i++)
            System.out.printf("Nome: %s, Idade: %d\n", nomes[i], idades[i]);
        kb.close();
    }

}
