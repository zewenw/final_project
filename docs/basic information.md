# basic information about project
## Port:
- Eureka: 8999
  - Eureka should be deployed in a cluster mode
- Authorization Server: 9000
  - auth server uri: http://auth-server:9000, if start application on local machine, should config host file
- Client: 9002
- Gateway: 
    - dev: 9001
    - test: 80
    - prod: 80
- User: 9003
- Photo: 9004

## Precautions
- calls between resource server should use gRPC, no need to validate authorities

