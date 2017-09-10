#!/bin/sh
docker build -t psbox/ps-beneficiary-web -f container.docker .
docker run -d -p 18080:8080 psbox/ps-beneficiary-web
