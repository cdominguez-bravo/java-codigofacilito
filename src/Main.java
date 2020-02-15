public class Main {


  public static void main(String[] args) {
    int arreglo[] = new int[10];
    arreglo[4] = 9;
    for(int i=0; i < 10; i++){
      System.out.println(arreglo[i]);
    }
    System.out.println(arreglo.length);
  }
}
