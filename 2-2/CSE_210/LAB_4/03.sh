#!/bin/bash

echo "Year: "
read n

if (( n%400 == 0 || n%4 == 0)); then
	echo "$n is a Leap Year."
elif (( n%100 == 0 )); then
	echo "$n is not a Leap Year."
else
	echo "$n is not a Leap Year."
fi
