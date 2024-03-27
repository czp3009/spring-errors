# Spring Errors
Provide a series of exception classes inherited from spring ResponseStatusException, such as `BadRequestException`, `NotFoundException`.

Include all 4xx exceptions.

# Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.czp3009:spring-errors:0.0.2'
}
```

# Runtime Dependency
```
org.springframework:spring-web:6.X
```

# Example
```java
@RestController
@RequestMapping("/")
class GreetingController {
    @GetMapping
    String get(String name) {
        //http code 400
        if (name == null) throw new BadRequestException("Name can't be null");
        return "Hello " + name;
    }
}
```

# License
Apache 2.0
