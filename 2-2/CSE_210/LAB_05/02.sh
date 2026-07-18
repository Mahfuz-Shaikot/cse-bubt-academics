#!/bin/bash

factorial() {
n=$1
result=1
for (( i=1; i<=n; i++ )); do

	(( result *= i ))

	done
	echo "$result"
}


read n
factorial "$n"
