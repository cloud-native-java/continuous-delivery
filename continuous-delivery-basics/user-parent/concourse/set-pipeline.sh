#!/usr/bin/env bash

fly -t lite set-pipeline -p account-microservice -c pipeline.yml -l .pipeline-config.yml