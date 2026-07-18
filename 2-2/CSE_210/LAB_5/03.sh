#!/bin/bash

palindrome() {
    str=$1
    rev=$( echo "$str" | rev )

    if [ "$str" = "$rev" ]; then
        echo "Palindrome"
    else
        echo "Not Palindrome"
    fi
}

read str
palindrome "$str"
