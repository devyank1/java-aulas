package example;

public class Car extends AllVehicles{

    public void ligarMotor(){
        System.out.println("CARRO LIGADO");
        confereCambio();
        confereCombustivel();
    }

    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO SE O CARRO ESTÁ NO 'P'");
    }
}
