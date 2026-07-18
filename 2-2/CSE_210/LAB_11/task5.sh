#!/bin/bash

s1="$1"
s2="$2"

common=""

for ((i=0; i<${#s1}; i++)); do
    ch="${s1:$i:1}"
    
    if [[ "$s2" == *"$ch"* ]]; then
        if [[ "$common" != *"$ch"* ]]; then
            common+="$ch"
        fi
    fi
done

echo "$common"
