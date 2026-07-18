#!/bin/bash


echo "Input your age: "
read age

if [ $age -ge 18 ]; then 
echo "Adult"
else
echo "Minor"
fi
