package itr;

public interface Imprimible {
   public abstract String toString();

   public default void imprimir() {
      System.out.println(this.toString());
   }
}
