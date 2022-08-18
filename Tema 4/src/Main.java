public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int numeroIf = 1;
        if (numeroIf > 0) {
            System.out.println("mayor a 0");
        } else if (numeroIf < 0) {
            System.out.println("menor a 0");
        } else System.out.println("0");


        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }


        do {
            System.out.println("numeroWhile en do while = " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }


        var estacion = "invierno";
        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación del año");
        }
    }

}