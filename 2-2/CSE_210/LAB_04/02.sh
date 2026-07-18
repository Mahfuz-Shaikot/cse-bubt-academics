#!/bin/bash

echo "Input: "

read n
a=0
b=1
#result=0

for (( i=0; i<n; i++ ))
do
	echo "$b"
	result=$((a+b))
	a=$b
	b=$result
	
done
