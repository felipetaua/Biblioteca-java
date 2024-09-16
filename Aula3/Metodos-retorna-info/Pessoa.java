
// Definir classe Pessoa
public class Pessoa {
  // Atributos da classe
  private String nome;
  private int idade;

  // Constructor para inicializar a classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Métodos da classe
  public String exibirInfo() {
    return "Nome: " + nome + " Idade: " + idade;
  }

  // Retornar apenas o nome
  public String getNome() {
    return nome;
  }
  // Retornar a idade
  public int getIdade() {
    return idade;
  }
}