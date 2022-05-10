<?php
require_once ('Car.php');
class UberVan extends Car{
    public $typeCarAccepted;
        public $material;
        public function __construct ($licence, $driver, $typeCarAccepted,$material){
            parent::__construct($licence,$drver);
                $this->typeCarAccepted = $typeCarAccepted;
                $this->material = $material;
        }
}


?>