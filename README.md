# Spring Boot Thymeleaf Example

This repository showcases a simple and modern Spring Boot app with Thymeleaf for managing books. Bootstrap is included as a WebJar for styling all pages.

* using the Thymeleaf Layout Dialect, `layout.html` is applied as the page template  
* an `inputRow` fragment in `fragments/forms.html` helps with form setup
* `error.html` is displayed for all application errors, including 404  
* `LocalDevConfig` enables true [hot reload](https://bootify.io/frontend/thymeleaf-templates-hot-reload.html) – all changes are instantly visible in the browser during development  

**Create a Spring Boot application with Thymeleaf and your own database schema** at [Bootify.io](https://bootify.io). Choose from a wide range of settings to match your preferences and enable CRUD functions for your entities.

## Development

Update your local database connection in `application.properties` or create your own `application-local.properties` file to override settings for development.

During development it is recommended to use the profile `local`. In IntelliJ `-Dspring.profiles.active=local` can be added in the VM options of the Run Configuration after enabling this property in "Modify options".

After starting the application it is accessible under `localhost:8080`.

## Build

The application can be built using the following command:

```
mvnw clean package
```

Start your application with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./target/thymeleaf-0.0.1-SNAPSHOT.jar
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as environment variable when running the container.

```
mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=io.bootify/thymeleaf
```

## Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/reference/jpa.html)
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)  
