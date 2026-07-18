#!/bin/bash

echo "Input your choice: 1. Celsius to Fahrenheit 2. Fahrenheit to Celcius 3. Kelvin to Celcius"
read n

if [ "$n" -eq 1 ]; then
	echo "Enter temp"
	read temp 
	f = $($temp * 9/5 + 32")
	echo "Temperature in Fahrenheit: $f"

elif [ "$n" -eq 2 ]; then
	echo "Enter temp"
	read temp
	c = $($temp - 32) * 5/9)
	echo "Temperature in Celcus: $c"
elif [ "$n" -eq 3 ]; then
	echo "Enter temp: "
	read temp
	k = $($temp + 273.15)
	echo "Temperature in Kelvin: $k"
elif [ "$n" -eq 4 ]; then
	echo "Enter temp: "
	read temp
	c =  $($temp - 273.15)
	echo "Temperature in Celcius: $c"
else
	echo "Invalid"
