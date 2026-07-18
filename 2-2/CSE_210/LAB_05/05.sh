#!/bin/bash

gcd() {
    a=$1
    b=$2
    g=1
    for (( i=1; i<=a && i<=b; i++ ))
    do
        if (( a % i == 0 && b % i == 0 )); then
            g=$i
        fi
    done
    echo $g
}

read a b
gcd $a $b

