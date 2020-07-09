#!/bin/bash

mvn liquibase:update \
  -Dliquibase.url="jdbc:postgresql://${SPRINGDEMO_DB_SERVER}/${SPRINGDEMO_DB_NAME}" \
  -Dliquibase.username="${SPRINGDEMO_DB_USERNAME}" \
  -Dliquibase.password="${SPRINGDEMO_DB_PASSWORD}"
