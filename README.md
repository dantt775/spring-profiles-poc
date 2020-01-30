### Spring profiles

POC that show some examples of how to use spring profiles with profile on a bean and application.properties

Running the application with ```-Dspring.profiles.active=local``` will load the application-local.properties and the beans that are anotated with ```@Profile("local")```. 

```java
    @Bean
    @Profile("local")
    public ExampleBean  localBean(){
        return new ExampleBean("localhost:3306", "local");
    }
```


Same baheaviour when running with ```-Dspring.profiles.active=dev```. The ```application-dev.properties``` will be loaded and the below bean will be instantiated
```java
    @Bean
    @Profile("dev")
    public ExampleBean  devBean(){
        return new ExampleBean("192.168.0.1:8080", "dev");
    }
```

But, when no arguments are passed, the default .properties file ```application.properties``` will be chosen.
And in the bean we have to explict say that this bean will be instantiated if local AND dev profiles are not active.
I thin you can achieve the same thing with Conditional, and it offer more resources, but i think this way more simple.
```java
    @Bean
    @Profile("!local & !dev")
    public ExampleBean  productionBean(){
        return new ExampleBean("172.18.19.20:3306", "production");
    }
```
