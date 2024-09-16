// Métodos que retornam informações

public class Main {
  public static void main(String[] args) {
    
    // Instanciando o objeto pessoa
    Pessoa pessoa1 = new Pessoa("Miguel", 17);
    Pessoa pessoa2 = new Pessoa("Tauã", 18);
    Pessoa pessoa3 = new Pessoa("Suelem", 18);
    
   // Os métodos

    // Retornar apenas o nome
    System.out.println(pessoa3.getNome());
    // Retorna apenas a idade
    System.out.println(pessoa2.getIdade());
    // Retornando as duas informações
     System.out.println(pessoa1.exibirInfo());
  }
}
