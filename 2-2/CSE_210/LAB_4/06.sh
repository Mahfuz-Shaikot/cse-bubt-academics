#!/bin/bash

echo "Input: "
read a b

for (( n=a; n<=b; n++ ))
do
	if (( n > 1 )); then
		count=0
		for (( i=1; i<=n; i++ ))
		do
			if (( n%i == 0 )); then
				((count++))
			fi
		done

		if (( count == 2 )); then
			echo -n "$n "
		fi
	fi
done
echo
