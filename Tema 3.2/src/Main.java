public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Auto auto1 = new Auto(4);
        System.out.println(auto1.puerta);
        auto1.sumarPuerta();
        System.out.println(auto1.puerta);
    }




}


class Auto {
    int puerta;

    public Auto(int puerta) {
        this.puerta = puerta;
    }

    public int sumarPuerta() {
        return this.puerta++;
    }
}

