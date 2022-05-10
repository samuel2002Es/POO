package Java;

class Main{
    public static void main(String[] args) {
    /* (String license, Account driver, String brand, String model */
    UberX uberX =new UberX("Amq123", new Account( "Pedro el loco", "document" ),"Chevrolet","sonic");
    uberX.setPassenger(4);
    uberX.PrintDataCar();

    /* Car car2 =new Car("QWE567", new Account(1, "Maria", "document"));
    car2.passanger = 3;
    car2.PrintDataCar(); */
    UberVan uberVan= new UberVan("FH689",new Account("pedro", "and230-948"));
    uberVan.setPassenger(6);
    uberVan.PrintDataCar();
}
}