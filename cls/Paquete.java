package cls;

import itr.Imprimible;

public class Paquete implements Imprimible{
   private Integer id;
   private String  nombre;
   private Integer precio;
   
   public Paquete() {
      this(0);
   }
   public Paquete(Integer pId) {
      this(pId, "Sin Nombre");

   }
   public Paquete(Integer pId, String pNombre) {
      this(pId, pNombre, 0);
   }
   public Paquete(Integer pId, String pNombre, Integer pPrecio) {
      this.id    =pId;
      this.nombre=pNombre;
      this.precio=pPrecio;
   }
   public Integer getId() {
      return this.id;
   }
   @Override
   public String toString() {
      return String.format("%s ($%d)", this.nombre, this.precio);
   }
   public String toStringArchivo() {
      return String.format("| %1d | %-15s | %6d |\n" , this.id, this.nombre, this.precio);
   }
   public String toStringPaquete() {
      return String.format("( %1d ( %-15s ( %6d (" , this.id, this.nombre, this.precio);
   }
   @Override
   public String toStringCompleto() {
      return String.format(
            "Datos del Paquete\n"
            + "Nombre : %s\n"
            + "Precio : %d\n",
           this.id,
           this.nombre,
           this.precio
            );
   }
}
