#!/bin/bash

armstrong() {

num=$1
original_num=$num
sum=0
num_digits=${#num}

for (( i=0; i<num_digits; i++ )); do
	digit=$((num % 10))
	sum=$((sum + digit**num_digits))
	num=$((num / 10))
done

if [ $sum -eq $original_num ]; then
	echo "Armstrong Number"
else
 	echo "Not Armstrong"
fi

}


read n
armstrong "$n"
