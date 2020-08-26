# Spring Errors
Provide a series of exception classes inherited from spring ResponseStatusException, such as `BadRequestException`, `NotFoundException`.

All 4xx Exception are there.

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
