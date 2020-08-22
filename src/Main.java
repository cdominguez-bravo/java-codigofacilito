import java.util.Scanner;
import java.util.Vector;

public class Main {

  /**INICIO: Curso estructura de datos - seccion arreglo como parametro -> https://codigofacilito.com/videos/arreglo-como-parametro
   * **/

  /*public static void modificar(int x){
    x = 2;
    System.out.println("metodo modificar - "+x);
  }
  public static void main(String[] args) {

    //int num[]= {1,2,3,4};
    int x = 1;
    modificar(x);
    System.out.println(x);

  }*/
  /**FIN: Curso estructura de datos - seccion arreglo como parametro
   * **/


  /**
   * INICIO: Curso estructura de datos - Vectores -> https://codigofacilito.com/videos/vectores
   **/


  public static void main(String[] args) {

    Vector vector = new Vector(20);
    vector.add("h");
    vector.add("hola");
    vector.insertElementAt("jj", 1);
    System.out.println(vector);
    vector.remove("h");
    System.out.println(vector);
    System.out.println(vector.elementAt(0));

  }
  /**FIN: Curso estructura de datos - seccion Vectores
   * **/

  // OTRAS SECCIONES ANTERIORES
  //arreglo de una dimension
    /*
    int arreglo[] = new int[10];
    arreglo[4] = 9;
    for(int i=0; i < 10; i++){
      System.out.println(arreglo[i]);
    }
    System.out.println(arreglo.length);
    */

  //arreglo de 2 dimensiones

    /*
    int matriz [][] = new int [3][3];
    int matrizp[][] = {{1,2,3},{4,5,6},{7,8,9}};

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingres x e y !!");
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    int m[][] = new int [x][y];
    int n;

    for (int i=0; i <x; i++){
        for (int j=0;j<y;j++){
          n = (int)(Math.random()*1000);
          m[i][j] = n;
        }
    }

    //imprimir
    for (int i=0; i <x; i++){
      for (int j=0;j<y;j++){
        System.out.println(m[i][j]);
      }
    }

    */

  //int x


}
