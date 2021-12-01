package itr;

public interface Imprimible {
   public abstract String toStringCompleto();

   public default void imprimir() {
      System.out.println(this.toStringCompleto());
   }
}
