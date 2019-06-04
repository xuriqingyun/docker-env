#!/bin/sh
#docker rmi docker-env
docker run --privileged=true --restart=always -d -p 8082:8082 -e DB_HOST=server.natappfree.cc -e DB_PORT=33610 --name docker-env zhouxu/docker-env:v0.2
echo "start docker env"
