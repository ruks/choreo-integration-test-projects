# Use the official Golang image as the base image
FROM golang:latest

# Set the working directory inside the container
WORKDIR /app

RUN useradd -u 10001 -ms /bin/bash myuser

# Give the non-root user ownership of the working directory
RUN chown -R myuser /app

# Switch to the non-root user
USER 10001

# Copy the current directory contents into the container at /app
COPY . /app

# Build the Go application
RUN go build -o main .

# Command to run the executable
CMD ["./main"]
