package lbd2;

interface Taxi{
    double reservar(String origem, String destino);

}

public class Main {
    public static void main(String[] args) {

        Taxi taxi = (origem, destino) -> {
            System.out.println("Taxi reservado. Origem: " + origem + " Indo para: " + destino);
            return 80.60;
        };
        double valorReserva = taxi.reservar("São Luís.", "São José do Rio Preto.");
        System.out.println("O valor da reserva é de: " + valorReserva);
    }
}


