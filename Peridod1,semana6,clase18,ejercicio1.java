import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  double valor, descuento, recargo, tota1;
  String tipo_pago;
  Scanner entrada = new Scanner(System.in);
  System.out.print("Ingrese el valor de la compra: ");
  valor = entrada.nextDouble();
  System.out.print("Ingrese tipo de pago: ");
  tipo_pago=entrada.next();
  descuento=0.05*valor;
  recargo=0.03*valor;
  if (tipo_pago.equalsIgnoreCase("contado")) {
  System.out.println("El descuento es: " + descuento);
  tota1= valor - descuento;
  System.out.println("El tota1 es: " + tota1);
  }
  else if (tipo_pago.equalsIgnoreCase("tarjeta")) {
  System.out.println("El recargo es: " + recargo);
  tota1=valor + recargo;
  System.out.println("El tota1 es: " + tota1);
  }
  else {
  System.out.println("Metodo de pago invalido");
  }
  }  
}