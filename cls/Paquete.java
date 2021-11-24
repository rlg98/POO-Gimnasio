package cls;

public class Paquete {
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
}
