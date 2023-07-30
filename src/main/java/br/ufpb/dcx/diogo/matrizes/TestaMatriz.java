package br.ufpb.dcx.diogo.matrizes;

import java.util.Scanner;

public class TestaMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linhas, colunas;
        int elemento;

        try {
            System.out.print("Digite a quantidade de linhas: ");
            linhas = entrada.nextInt();

            System.out.print("Digite a quantidade de colunas: ");
            colunas = entrada.nextInt();

            Matriz matriz = new Matriz(linhas, colunas);

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("Digite o elemento da %sª linha e %sª coluna: ", i + 1, j + 1);
                    elemento = entrada.nextInt();
                    matriz.setElemento(i, j, elemento);
                }
            }
            System.out.println();
            System.out.println(matriz);
            System.out.println(matriz.calcularDeterminante());

            entrada.close();
        } catch (MatrizNaoQuadradaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
