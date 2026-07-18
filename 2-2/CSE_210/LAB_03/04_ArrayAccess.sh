#!/bin/bash

arr=("noOne" "18" "Earth")


echo "0-Name, 1-Age, 2-City"
echo "Input a number: "
read input

if [ $input -eq 0 ]; then
echo "${arr[$input]}"

elif [ $input -eq 1 ]; then
echo "${arr[$input]}"

elif [ $input -eq 2 ]; then
echo "${arr[$input]}"

else
echo "Invalid Input"

fi


