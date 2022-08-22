public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Cliente cliente1 = new Cliente();


        cliente1.nombre= "Juan";
        System.out.println("El cliente se llama " + cliente1.nombre + ".");

        cliente1.edad = 25;
        System.out.println("Tiene " + cliente1.edad + " años de edad.");

        cliente1.telefono = 12345678;
        System.out.println("El telefono es " + cliente1.telefono + ".");

        cliente1.credito = 1500;
        System.out.println("Y tiene " + cliente1.credito + "$ de credito a favor.");



        Trabajador trabajador1 = new Trabajador();

        trabajador1.nombre= "Alberto";
        System.out.println("El trabajador se llama " + trabajador1.nombre + ".");

        trabajador1.edad = 35;
        System.out.println("Tiene " + trabajador1.edad + " años de edad.");

        trabajador1.telefono = 901234567;
        System.out.println("El telefono es " + trabajador1.telefono + ".");

        trabajador1.salario = 3000;
        System.out.println("Y gana " + trabajador1.salario + "$ mensuales.");
    }
}

class Persona {
    int edad;

    String nombre;

    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}