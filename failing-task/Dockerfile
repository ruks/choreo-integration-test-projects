# Use a lightweight base image
FROM alpine:latest

RUN apk update && apk add bash

COPY entrypoint.sh /entrypoint.sh
RUN chown 10014:10014 /entrypoint.sh && chmod +x /entrypoint.sh

USER 10014
ENTRYPOINT ["/entrypoint.sh"]

