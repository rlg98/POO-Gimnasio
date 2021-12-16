package itr;

import lib.Util;

public interface Imprimible {
   public abstract String toStringCompleto();

   public default void imprimir() {
      System.out.println(this.toStringCompleto());
      Util.mostrar("Imprimiendo", this.toStringCompleto());
   }
}
