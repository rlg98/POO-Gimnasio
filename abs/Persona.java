package abs;

import itr.Imprimible;

public abstract class Persona implements Imprimible {
   protected Integer id;
   protected String  nombre;
   protected String  paterno;
   protected String  materno;
   protected Integer edad;
   protected Long    telefono;
   protected String  domicilio;

   public Persona() {
      this(0);
   }

   public Persona(Integer pId) {
      this(pId, "Sin Nombre");
   }

   public Persona(Integer pId, String pNombre) {
      this(pId, pNombre, "Sin Paterno");
   }

   public Persona(Integer pId, String pNombre, String pPaterno) {
      this(pId, pNombre, pPaterno, "Sin Materno");
   }

   public Persona(Integer pId, String pNombre, String pPaterno, String pMaterno) {
      this(pId, pNombre, pPaterno, pMaterno, 0);
   }

   public Persona(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad) {
      this(pId, pNombre, pPaterno, pMaterno, pEdad, 0L);
   }

   public Persona(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono) {
      this(pId, pNombre, pPaterno, pMaterno, pEdad, pTelefono, "Sin Domicilio");
   }

   public Persona(Integer pId, String pNombre, String pPaterno, String pMaterno, Integer pEdad, Long pTelefono,String pDomicilio) {
      this.id        = pId;
      this.nombre    = pNombre;
      this.paterno   = pPaterno;
      this.materno   = pMaterno;
      this.edad      = pEdad;
      this.telefono  = pTelefono;
      this.domicilio = pDomicilio;
   }

//Setter y Getters
   public Integer getId() {
      return this.id;
   }

   public void setId(Integer pId) {
      this.id = pId;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String pNombre) {
      this.nombre = pNombre;
   }

   public String getPaterno() {
      return this.paterno;
   }

   public void setPaterno(String pPaterno) {
      this.paterno = pPaterno;
   }

   public String getMaterno() {
      return this.materno;
   }

   public void setMaterno(String pMaterno) {
      this.materno = pMaterno;
   }

   public int getEdad() {
      return this.edad;
   }

   public void setEdad(Integer pEdad) {
      this.edad = pEdad;
   }

   public Long getTelefono() {
      return this.telefono;
   }

   public void setTelefono(Long pTelefono) {
      this.telefono = pTelefono;
   }

   public String getDomicilio() {
      return this.domicilio;
   }

   public void setDomicilio(String pDomicilio) {
      this.domicilio = pDomicilio;
   }
}