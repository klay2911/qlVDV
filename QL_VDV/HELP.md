# Read Me First
The following was discovered as part of building this project:

* The following dependencies are not known to work with Spring Native: 'Groovy Templates, MS SQL Server Driver, Apache Derby Database, Spring LDAP, Cloud Bootstrap, Spring Web Services, Spring Configuration Processor, Oracle Driver, Apache Freemarker, Spring Boot DevTools, Rest Repositories, Vault Configuration'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Groovy Templates](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.reactive)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.security)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.nosql.ldap)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#io.webservices)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.r2dbc)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#using.devtools)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jdbc)
* [Function](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#spring-aot-maven)
* [R2DBC Homepage](https://r2dbc.io)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples)

## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-buildpacks).

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 QL_VDV:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-native-build-tools).

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:
```
$ target/QL_VDV
```
