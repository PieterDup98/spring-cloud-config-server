# spring-cloud-config-server
Implementation of Spring Cloud Config Server


### Spring Cloud compatibility matrix with Spring Boot:
https://github.com/spring-cloud/spring-cloud-release/wiki/Supported-Versions#supported-releases


### Register access token to your config github repo.
Settings > Developer Settings > Personal Access Tokens
(Give your token "repo" rights.)


## To run locally:
1. Add a .env file to your base project dir.
2. Define the following in the .env file:
```properties
GIT_CONFIG_URI= # The git URI where your config is stored.
GIT_USERNAME= # Your Github username.
GIT_PASSWORD= # The token you generated above.
```

### Read config with rest (local and test branch created on config repo):


```shell
#(application name: application, profiles: default, label: local )
curl http://localhost:8888/app/default/local
```
```shell
#(application name: application, profiles: default, label: test )
curl http://localhost:8888/app/default/test
```
