#! /bin/bash
USER_TOKEN=1166d8e953e059e58077914465742b9138
JOB_TOKEN=MAVpx24F2cp30Th8FZOjrqHkvcowGBuS
WEB_LINK=http://user01:$USER_TOKEN@localhost:8080/job/mvn_artifactory-TEST/build?token=$JOB_TOKEN

curl -X POST $WEB_LINK