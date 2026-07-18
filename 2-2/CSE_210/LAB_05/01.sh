#!/bin/bash



missing_num() {

	read n  
	for (( i=0; i<n; i++ )); do
		read value
		arr[i]=$value
	done

	max=${arr[0]}
	for num in "${arr[@]}"; do
		(( num > max )) && max=$num
	done

	for (( i=0; i<=max; i++ )); do
	found=0
		for num in "${arr[@]}"; do
			if (( num == i )); then
				found=1
				break
			fi
		done

			if (( found == 0 )); then
				echo "$i"
				break
			fi
		done

}

missing_num  
