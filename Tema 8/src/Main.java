public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona persona1 = new Persona();

        persona1.setNombre("Conrado");
        System.out.println("La persona se llama " + persona1.getNombre() + ".");

        persona1.setEdad(25);
        System.out.println("Tiene " + persona1.getEdad() + " años de edad.");

        persona1.setTelefono(123456789);
        System.out.println("Su telefono es " + persona1.getTelefono() + ".");
    }
}


class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }


    public void  setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
