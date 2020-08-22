public class ListaEnlazada {

  protected Nodo primero;

  public ListaEnlazada(){
    primero = null;
  }

  public ListaEnlazada agregarInicio(int dato){
    Nodo nuevo;
    nuevo = new Nodo(dato);
    nuevo.ref = primero;
    primero = nuevo;
    return this;
  }

  public void agregarFinal(int dato){
    Nodo nuevoF;
    nuevoF = new Nodo(dato);
    nuevoF.ref = null;
    if(primero ==null){
      primero=nuevoF;
    }

    Nodo tmp;
    for(tmp=primero; tmp.getRef()!=null;tmp=tmp.getRef());
      tmp.setRef(nuevoF);

  }

  public void buscar(){}

  public void eliminar(int dato){
    boolean encontrado;
    Nodo actual,anterior;
    actual = primero;
    anterior = null;
    encontrado = false;

    while(actual!=null && !encontrado){
      encontrado = (actual.dato == dato);
      if(!encontrado){
        anterior = actual;
        actual = actual.getRef();
      }
    }

    if(actual!=null){
      if(actual==primero){
        primero = actual.ref;
      }else{
        anterior.setRef(actual.ref);
      }
    }

  }

  public void verLista(){
    Nodo nodov;
    nodov = primero;
    while(nodov != null){
      System.out.println(nodov.dato);
      nodov = nodov.ref;
    }
  }

}
