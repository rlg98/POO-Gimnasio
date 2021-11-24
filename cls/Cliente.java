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
}
