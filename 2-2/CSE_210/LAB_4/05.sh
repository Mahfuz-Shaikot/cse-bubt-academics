#!/bin/bash

echo "Input: "
read n
count=0

if (( n<= 1)); then
echo "$n is not a prime number."

fi

for (( i=1; i<=n; i++ ))
do
	if (( n%i == 0 )); then
		((count++))
	fi
done

if (( count == 2 )); then
	echo "$n is a prime number."
else
	echo "$n is not a prime number."
fi


