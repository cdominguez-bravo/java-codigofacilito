package magikas.es.youtube;

public class Main {

  public static void main(String[] args) {
    Lista lista = new Lista();
    lista.insertarPrincipio(new Libro("Seleccion Natural", "Charles Darwin", "123123123"));
    lista.insertarPrincipio(new Libro("Conspiraciones", "Dan Brown", "44444444444"));
    lista.insertarPrincipio(
        new Libro("Alicia en el pais de las maravillas", "Lewis Carroll", "55555555555"));

    System.out.println(lista.contar());
    Libro libro = new Libro(lista.obtener(1).getTitulo(), lista.obtener(1).getAutor(),
        lista.obtener(1).getIsbn());
    System.out.println(libro.getAutor());

  }


}
