public class Main {


  public static void main(String[] args) {
    String x = "Hola mundo !!!p";
    System.out.println(x.charAt(6));
    System.out.println(x.charAt(x.length()-1));
    for (int i = 0; i <x.length();i++){
      System.out.println(x.charAt(i));

    }
    int c = x.indexOf("m");
    System.out.println(c);
  }
}
