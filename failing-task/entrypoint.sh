#!/bin/bash

ID=$RANDOM
for i in {1..10}; do
    echo "$ID: Hello world!"
    sleep 1
done
exit 42