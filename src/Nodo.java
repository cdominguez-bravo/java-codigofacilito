public class Nodo {

  int dato;
  Nodo ref;

  public Nodo(int d){
    dato = d;
  }

  public int getDato(){
    return dato;
  }

  public void setRef(Nodo referencia){
      ref = referencia;
  }

  public Nodo getRef(){
    return ref;
  }

}
