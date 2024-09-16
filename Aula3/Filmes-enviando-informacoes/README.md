---

 Projeto Filmes em Java

Este projeto é uma aplicação simples em Java que demonstra a criação e manipulação de objetos da classe `Filmes`. O código consiste em duas classes principais: `Filmes` e `Main`.

 Descrição das Classes

 `Filmes`

A classe `Filmes` representa um filme com três atributos:

- `titulo` (String): O título do filme.
- `anoLancamento` (int): O ano em que o filme foi lançado.
- `duracao` (int): A duração do filme em minutos.

 Atributos

- `private String titulo`: O título do filme.
- `private int anoLancamento`: O ano em que o filme foi lançado.
- `private int duracao`: A duração do filme em minutos.

 Construtor

O construtor da classe `Filmes` inicializa os atributos do filme com base nos parâmetros fornecidos:

```java
public Filmes(String titulo, int anoLancamento, int duracao) {
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
}
```

 Métodos

- `public String exibirInfo()`: Retorna uma String formatada contendo informações sobre o filme, como título, ano de lançamento e duração. Exemplo de saída:
  ```
  Titulo: Vingadores: Ultimato, Ano Lançamento: 2019, Duração: 180
  ```

 `Main`

A classe `Main` é o ponto de entrada da aplicação e contém o método `main`, que cria várias instâncias da classe `Filmes` e exibe suas informações.

 Código

```java
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("Vingadores: Ultimato", 2019, 180);
    Filmes filme2 = new Filmes("Senhor dos Anéis", 2001, 178);
    Filmes filme3 = new Filmes("Não Olhe para cima", 2021, 150);
    Filmes filme4 = new Filmes("Oppenheimer", 2023, 180);
    Filmes filme5 = new Filmes("Avatar: O Caminho da Água", 2022, 189);

    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
    System.out.println(filme4.exibirInfo());
    System.out.println(filme5.exibirInfo());
  }
}
```

 Explicação

1. **Criação de Objetos**: O método `main` cria cinco objetos da classe `Filmes`, cada um representando um filme diferente.
2. **Exibição de Informações**: Utiliza o método `exibirInfo` de cada objeto `Filmes` para imprimir suas informações no console.

 Como Executar

1. **Compilar**: Compile os arquivos Java usando o comando:
   ```
   javac Filmes.java Main.java
   ```

2. **Executar**: Execute a classe `Main` com o comando:
   ```
   java Main
   ```

Isso exibirá as informações sobre os filmes no console.

 Contribuições

Sinta-se à vontade para fazer melhorias, sugestões ou adicionar novas funcionalidades ao projeto. Para contribuir, basta fazer um fork do repositório, criar uma branch para suas alterações e enviar um pull request.

---
