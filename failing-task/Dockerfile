# Use a lightweight base image
FROM alpine:latest

USER 10014
# Run the command
# CMD ["sh", "-c", "echo \"Hello world!\" && sleep 5 && exit 42"]
CMD ["sh", "-c", "for i in {1..10}; do echo \"Process ID: $$ - Hello world!\"; sleep 1; done && exit 42"]
