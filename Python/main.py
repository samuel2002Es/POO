''' primero importamos el elemento '''
from account import Account
from car import Car

if __name__ == "__main__":
    print("hola mundo")
    car = Car("AMS234", Account("pedro","ASDD34"))
    print(vars(car))
    print(vars(car.driver))
    
    
    ''' Getters y Setters Python
En python no existen como tal las variables privadas, pero se pueden “esconder” o volver privadas con solo colocarle doble guion bajo al nombre de la variable.
def setPassenger(self,passengerNum):
        if passengerNum >= 4:
            self.__passenger = int(passengerNum)
            print("Passengers asgindados : " + str(self.__passenger)) 

        else:
            print("El número de pasajeros es demasiado bajo para esta categoría")

    def getPassenger(self):
        if self.__passenger != int:
            print(self.__passenger)```
 '''