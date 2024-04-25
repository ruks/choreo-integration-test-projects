# Hello World Service Sample

## About

This sample contains a simple REST API, which is exposed via the HTTP protocol.

When the API gets invoked, a simple message is generated and sent back to the client as the response.

This sample contains a simple REST API called ‘HelloWorld’. When you invoke it, it generates a JSON message and sends it to the client.

## Deploying 
1. Download and start the latest Micro Integrator server.
https://mi.docs.wso2.com/en/latest/install-and-setup/install/running-the-mi/

2. Build the sample
3. Copy the HelloWorldService_1.0.0-SNAPSHOT.car to <MI_HOME>/repository/deployment/server/carbonapps location.

## How to invoke

curl for add operation
```
curl --location 'http://localhost:8290/HelloWorld' --header 'Accept: application/json' 
```
