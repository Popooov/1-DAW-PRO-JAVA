package banco;

public class Banco {

    public static void main(String[] args) {
        Persona p1 = new Persona("00000000A", "Olek", true, true);
        Cliente c1 = p1;
        c1.ingresarSaldo(100.0);
        
        Empleado e1 = p1;
        e1.setHorasTrabajadas(20);
        
        System.out.println(e1);
        
        Persona p2 = new Persona("00000000A", "Olek", false, true);
        Cliente c2 = p2;
        c2.ingresarSaldo(100.0);
        System.out.println(c2);
        
        Persona p3 = new Persona("00000000A", "Olek", true, false);
        Empleado e2 = p3;
        e2.setHorasTrabajadas(10);
        System.out.println(e2);
    }

}
