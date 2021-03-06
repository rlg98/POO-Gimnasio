package cls;

import abs.Persona;
import enu.FormaPago;

public class Cliente extends Persona {
   private FormaPago formaPago;
   private Paquete   paquete;

   public Cliente() {
      super();
   }

   public Cliente(Integer pId) {
      super(pId);
   }

   public Cliente(Integer pId, String pNombre) {
      super(pId, pNombre);
   }

   public Cliente(Integer pId, String pNombre, String pPaterno) {
      super(pId, pNombre, pPaterno, "");
   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno) {
      super(pId, pNombre, pPaterno, pMaterno);
   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad);
   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono);
   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono,String pDomicilio) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, pDomicilio);

   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono,String pDomicilio, FormaPago pFormaPago) {
      this(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, pDomicilio, pFormaPago, null);

   }

   public Cliente(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono,String pDomicilio, FormaPago pFormaPago, Paquete pPaquete) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, pDomicilio);
      this.formaPago = pFormaPago;
      this.paquete   = pPaquete;
   }
   @Override
   public String toString() {
      return String.format("%d, %s, %s, %s, %d, %d, %s, %s, %s", this.id, this.nombre, this.paterno, this.materno, this.edad, this.telefono, this.domicilio, this.formaPago, this.paquete);
   }
   public String toStringArchivo() {
      return String.format("| %-8d | %-15s | %-15s | %-15s | %-8d | %10d | %-100s | %-10s | %-32s |\n",
            this.id, this.nombre, this.paterno, this.materno, this.edad, this.telefono, this.domicilio.replaceAll("\n", "!"), this.formaPago, this.paquete.toStringPaquete());
   }
   @Override
   public String toStringCompleto() {
      return String.format(
            "Datos de Cliente\n"
          + "Id            : %d\n"
          + "Nombre        : %s\n"
          + "Paterno       : %s\n"
          + "Materno       : %s\n"
          + "Edad          : %d\n"
          + "Tel??fono      : %d\n"
          + "Domicilio     : %s\n"
          + "Forma de Pago : %s\n"
          + "Paquete       : %s\n",
             this.id,
             this.nombre,
             this.paterno,
             this.materno,
             this.edad,
             this.telefono,
             this.domicilio,
             this.formaPago,
             this.paquete
            );
      
   }
}
