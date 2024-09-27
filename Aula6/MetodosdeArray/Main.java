import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // 1 - Criação de um array
    int[] numbers = { 5, 4, 3, 2, 1, 0 };
    int[] numbersRandom = { 6, 5, 2, 0, 5, 3, 1, 4 };
    System.out.println("Meu array de números: " + Arrays.toString(numbers));

    // 2 - Acessando um elemento pelo index
    System.out.println("O elemento da posição 2 é: " + numbers[2]);

    // 3 - Modificado um valor especifico no array
    numbers[3] = 0;
    System.out.println("O novo valor da posição 3 é: " + Arrays.toString(numbers));

    // 4 - Criando um array de strings
    String[] frutas = { "Maçã", "Banana", "Laranja", "Uva", "Morango", "Abacaxi", "Melancia", "Manga", "Abacate",
        "Pera" };
    // Exibindo a lista de frutas
    for (int i = 0; i < frutas.length; i++) {
      System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
    }

    // 5 - Instanciando um array de strings
    String[] carros = new String[4];
    // Adicionando valores no array
    carros[0] = "Porche";
    carros[1] = "Mercedes";
    carros[2] = "Audi";
    carros[3] = "Tesla";

    System.out.println("-----------------------");

    for (int i = 0; i < carros.length; i++) {
      System.out.println("Carro " + (i + 1) + ": " + carros[i]);
    }
    // Exibindo o array o array inteiro sem o for:
    // System.out.println(Arrays.toString(carros));

    System.out.println("-----------------------");
    // 6 - Ordenando o Array ordem crescente
    Arrays.sort(numbersRandom);
    System.out.println("Array ordenado(crescente): " + Arrays.toString(numbersRandom));

    // Array ordem decrescente
    Integer[] numeros = { 6, 5, 2, 0, 5, 3, 1, 4 };
    Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Array ordenado(decrescente): " + Arrays.toString(numeros));

    // 7 - Buscando um elemento método binarySearch - Varre o array encontra a
    // informação e te entrega sem for
    int index = Arrays.binarySearch(numbers, 6);
    if (index >= 0) {
      System.out.println("Valor encontrado na posição: " + index);
    } else {
      System.out.println("Valor não encontrado");
    }

    // 8 - Preencher um array com um determinado valor
    int[] lista = new int[5];
    Arrays.fill(lista,10);
    System.out.println("Lista preenchida: " + Arrays.toString(lista));
  }
}