from account import Account
class Car:
    id =int
    license =  str
    driver   =   Account("","")
    passanger = int
    
    def __init__(self,license,driver):
        self.license = license
        self.driver = driver