package gym;

import cls.Cliente;
import cls.Paquete;
import enu.FormaPago;

public class MGimnasio {

   public static void main(String[] args) {
      Paquete paq1 = new Paquete("Básico", 80);
              paq1.imprimir();
      new Cliente(1, "Raul", "Lara", "Sánchez", 21, 9931173247L, "Calle Principal S/N", FormaPago.EFECTIVO, paq1).imprimir();
   }

}
