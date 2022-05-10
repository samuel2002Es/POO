package Java;

public class UberX extends Car {
    String brand;
    String model;
    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
        
    }
    @Override
    public void PrintDataCar() {
        super.PrintDataCar();
        System.out.println("Modelo: "+model + "brand: "+brand );
    }
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
