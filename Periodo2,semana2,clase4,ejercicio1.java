class Main {
  public static void main(String[] args) {
    // Programa Java para demostrar switch case
    // con tipo de datos primitivos (int)
    int day = 5;
    String dayString;
    // instruccion switch con tipo de datos int
    switch (day)
    {
      case 1: dayString = "Lunes";
              break;
      case 2: dayString = "Martes";
              break;
      case 3: dayString = "Miercoles";
              break;
      case 4: dayString = "Jueves";
              break;
      case 5: dayString = "Viernes";
              break;
      case 6: dayString = "Sabado";
              break;
      case 7: dayString = "Domingo";
              break;
      default: dayString = "Dia invalido";
    }
    System.out.println(dayString);
  }
}