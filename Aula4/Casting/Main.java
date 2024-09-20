
public class Main {
  public static void main(String[] args) {
    int meuInt = 10;
    double meuDouble = meuInt;

    System.out.println("Valor do meuInt: " + meuInt);
    System.out.println("Valor do meu double após o casting(conversão): " + meuDouble);

    // Casting explicito
    double outroDouble = 9.78;
    int outroInt = (int)outroDouble;

    System.out.println("Esse é o valor do meu outroDouble: " + outroDouble);
    System.out.println("Esse é o valor do meu outroDouble: " + outroInt);
  }
}