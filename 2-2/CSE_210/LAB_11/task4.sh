#!/bin/bash

declare -A seen   

for num in "$@"; do
    if [[ -z "${seen[$num]}" ]]; then
        echo -n "$num "
        seen[$num]=1
    fi
done

echo
