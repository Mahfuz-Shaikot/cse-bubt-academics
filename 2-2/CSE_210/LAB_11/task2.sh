#!/bin/bash

read -p "" s

# Array te convert
arr=($s)

# Reverse print
for (( i=${#arr[@]}-1; i>=0; i-- )); do
    echo -n "${arr[$i]} "
done
echo
