package cls;

import itr.Imprimible;

public class Paquete implements Imprimible{
   private String  nombre;
   private Integer precio;

   public Paquete() {
      this("Sin Nombre");

   }
   public Paquete(String pNombre) {
      this(pNombre, 0);
   }
   public Paquete(String pNombre, Integer pPrecio) {
      this.nombre=pNombre;
      this.precio=pPrecio;
   }
   @Override
   public String toString() {
      return String.format("%s ($%d)", this.nombre, this.precio);
   }
   @Override
   public String toStringCompleto() {
      return String.format(
            "Datos del Paquete\n"
            + "Nombre : %s\n"
            + "Precio : %d\n",
           this.nombre,
           this.precio
            );
   }
}
