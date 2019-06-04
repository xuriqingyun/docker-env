#!/bin/sh
docker rm -vf docker-env
docker rmi zhouxu/docker-env:v0.2
docker build -t zhouxu/docker-env:v0.2 .
echo "container create ok"
