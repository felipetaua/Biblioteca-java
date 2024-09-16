---

 Explicação do Código

Este projeto em Java contém duas classes principais: `Main` e `Pessoa`. A seguir, uma explicação de cada parte do código:

 Classe `Pessoa.java`

Esta classe representa uma pessoa com dois atributos principais: `nome` e `idade`. Ela inclui:

1. Atributos:
   - `nome` (String): guarda o nome da pessoa.
   - `idade` (int): guarda a idade da pessoa.

2. Construtor:
   - O construtor `Pessoa(String nome, int idade)` é usado para inicializar um objeto `Pessoa` com um nome e uma idade específicos.

3. Métodos:
   - `getNome()`: retorna o nome da pessoa.
   - `getIdade()`: retorna a idade da pessoa.
   - `exibirInfo()`: retorna uma string que combina o nome e a idade da pessoa.

 Classe `Main.java`

Esta classe contém o método `main`, semelhante ao `index.html`. que executa o programa. Aqui, criamos três objetos da classe `Pessoa` e chamamos seus métodos para exibir informações:

1. Instanciando Objetos:
   - Criamos três pessoas: `Miguel`, `Tauã` e `Suelem`, com suas respectivas idades.

2. Chamando Métodos:
   - `getNome()`: é chamado para exibir o nome de `Suelem`.
   - `getIdade()`: exibe a idade de `Tauã`.
   - `exibirInfo()`: mostra o nome e a idade de `Miguel`.

 Exemplo de Saída:

Ao executar o código, a saída será:

```
Suelem
18
Nome: Miguel Idade: 17
```

--- 
