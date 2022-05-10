/* function Car(license,driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
    
}

Car.prototype.printDataCar = function (){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
} */
/* clase y constructor no hace falta primero poner los atributos */
class Car{
    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
/* dentro de la clase car hacemos un tostring */
   /*  printDataCar = () =>{
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
    } */
    printDataCar(){
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
        }
}