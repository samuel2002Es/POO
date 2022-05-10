<?php
require_once ('Car.php');
class uberX extends Car{
    public $brand;
    public $model;
    public function __construct($license, $driver, $model, $brand){
        parent::__consturct($license, $driver);
        $this->license = $license;
        $this->driver = $driver;
    }
    public function printDataCar(){
        echo "licencia: $this->license Driver: $this->driver".$this->name;
    }
}
?>