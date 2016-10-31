#!/usr/bin/env bash

CUR_DIR=$PWD
HAZELCAST_CP=lib/*

groovysh -cp "${HAZELCAST_CP}" -Duser.home="${CUR_DIR}" $*
