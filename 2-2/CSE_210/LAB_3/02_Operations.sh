#!/bin/bash

echo "Enter your first Number: "
read a

echo "Enter your Second Number: " 
read b

add=$(($a + $b))
sub=$(($a - $b))
multi=$(($a * $b))
div=$(($a / $b))

echo "Addition: "$add
echo "Substraction: "$sub
echo "Multiplication: "$multi
echo "Division: "$div
