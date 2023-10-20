# Use an official Python runtime as a parent image
FROM python:3.8

# Set the working directory to /app
WORKDIR /app

# Create a non-root user
RUN useradd -ms /bin/bash myuser

# Give the non-root user ownership of the working directory
RUN chown -R myuser /app

# Switch to the non-root user
USER myuser

# Copy the current directory contents into the container at /app
COPY . /app

# Run the Python script when the container launches
CMD ["python", "app.py"]
