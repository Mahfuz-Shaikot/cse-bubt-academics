#!/bin/bash

echo "Enter a string:"
read s

count=0

for (( i=0; i<${#s}; i++ )); do
    ch=${s:$i:1}
    if [[ $ch =~ [aeiouAEIOU] ]]; then
        count=$((count+1))
    fi
done

echo "Vowels: $count"
