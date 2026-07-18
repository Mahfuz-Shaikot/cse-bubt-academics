#!/bin/bash


echo "Input: "
read year

if (( year%400 == 0 || (year%4 == 0 && year%100 != 0) )); then
	echo "The year $year is itself a leap year."
else
	offset=1
	while true
	do
		prev=$((year - offset))
		next=$((year + offset))

		if (( prev%400 == 0 || (prev%4 == 0 && prev%100 != 0) )); then
			echo "The nearest leap year to $year is $prev"
			break
		elif (( next%400 == 0 || (next%4 == 0 && next%100 != 0) )); then
			echo "The nearest leap year to $year is $next"
			break
		fi
		((offset++))
	done
fi

