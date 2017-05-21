#!/usr/bin/env bash

fly -t lite set-pipeline -p user-microservice -c pipeline.yml -l .pipeline-config.yml