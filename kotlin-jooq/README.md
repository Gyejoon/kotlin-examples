# kotlin-jooq example

# Specification

1. Core
   - Kotlin 1.3
   - Spring Framework 5+
   - Spring Boot 2+
   - Spring Web Mvc

2. Database Library
   - Jooq

3. Database Engine
   - H2 Database
   - H2 Console

4. Test Framework
   - Junit5
   - mokito

5. Etc
   - gradle 4.7 version


# Run the app
```
./gradlew bootRun
```

# H2 Console
[h2-console 접속](http://localhost:8080/h2-console)


# Test
```
(window)
gradlew test

(macOs, Linux)
./gradlew test
```

## Jdbc url
  - jdbc:h2:mem:testdb;