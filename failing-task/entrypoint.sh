#!/bin/bash

ID=$RANDOM
for i in {1..1000}; do
    echo "$ID: Hello world!: $i"
    sleep 1
done
exit 42
