package cls;

import abs.Persona;
import enu.NivelEnt;

public class Entrenador extends Persona {
   public NivelEnt nivel; 

   public Entrenador() {
      super();

   }

   public Entrenador(Integer pId) {
      super(pId);
   }

   public Entrenador(Integer pId, String pNombre) {
      super(pId, pNombre);
   }

   public Entrenador(Integer pId, String pNombre, String pPaterno) {
      super(pId, pNombre, pPaterno);
   }

   public Entrenador(Integer pId, String pNombre, String pPaterno, String pMaterno) {
      super(pId, pNombre, pPaterno, pMaterno);
   }

   public Entrenador(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad);

   }

   public Entrenador(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono);
   }

   public Entrenador(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono, String pDomicilio) {
      this(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, pDomicilio, null);
   }

   public Entrenador(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono, String pDomicilio, NivelEnt pNivel) {
      super(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, pDomicilio);
      this.nivel = pNivel;
   }

   @Override
   public String toStringCompleto() {
      return String.format(
            "Datos del Entrenador\n"
           +"Id         : %d\n"
           + "Nombre    : %s\n"
           + "Paterno   : %s\n"
           + "Materno   : %s\n"
           + "Edad      : %d\n"
           + "Teléfono  : %d\n"
           + "Domicilio : %s\n"
           + "Nivel     : %s\n",
           this.id,
           this.nombre,
           this.paterno,
           this.materno,
           this.edad,
           this.telefono,
           this.domicilio,
           this.nivel
           );
   }
}