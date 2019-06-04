#!/bin/sh

EXEC_PARAM_COMMAND="-jar docker-env.jar"

if [ $DB_HOST ];then
    EXEC_PARAM_COMMAND=${EXEC_PARAM_COMMAND}" --db.host=$DB_HOST "
fi

if [ $DB_PORT ];then
    EXEC_PARAM_COMMAND=${EXEC_PARAM_COMMAND}" --db.port=$DB_PORT "
fi

if [ $DB_USERNAME ];then
    EXEC_PARAM_COMMAND=${EXEC_PARAM_COMMAND}" --db.username=$DB_USERNAME "
fi

if [ $DB_PASSWORD ];then
    EXEC_PARAM_COMMAND=${EXEC_PARAM_COMMAND}" --db.password=$DB_PASSWORD "
fi

echo "EXEC COMMAND:java" ${EXEC_PARAM_COMMAND}
java ${EXEC_PARAM_COMMAND}
