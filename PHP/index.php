<?php

require_once('Car.php');
require_once('Account.php');
require_once("UberX.php");

$UberX = new UberX("CBS234", new Account("Andres HErrera", "AND345"), "Chevrollet","Spark");
$UberX->printDataCar();
?>