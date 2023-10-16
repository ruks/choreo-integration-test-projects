import ballerina/io;
import ballerina/lang.runtime;

public function main() {
    io:println("Hello, World! 1");
    io:println("Hello, World! 2");
    io:println("Hello, World! 3");
    io:println("Hello, World! 4");
    io:println("Hello, World! Sleeping");
    runtime:sleep(90);
    io:println("Hello, World! 5");
    io:println("Hello, World! 6");
    io:println("Hello, World! 7");

}
