import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int mu13,mu15,valor,f;
    mu13=0;
    mu15=0;
    for(f=1;f<=10;f++) {
      System.out.print("Ingrese un valor:");
      valor=teclado.nextInt();
      if (valor%3==0) {
        mu13=mu13+1;
      }
      if (valor%5==0) {
        mu15=mu15+1;
      }
    }
    System.out.print("Cantidad de valores ingresados multiplos de 3:");
    System.out.println(mu13);
    System.out.print("Cantidad de valores ingresados multiplos de 5:");
    System.out.print(mu15);
  }
}