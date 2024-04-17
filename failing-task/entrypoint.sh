#!/bin/bash

ID=$RANDOM
for i in {1..100}; do
    echo "$ID: Hello world!: $i"
done
exit 42
