# Proyecto Spring Boot: solid

Este proyecto es un microservicio básico creado con Spring Boot 3 y Java 17.

## Dependencias principales
- Spring Web
- Spring Boot DevTools
- Spring Boot Actuator

## Estructura del paquete base
El paquete base es: `com.solid`

## Cómo ejecutar

```
./mvnw spring-boot:run
```

O bien, puedes compilar y ejecutar el JAR:

```
./mvnw clean package
java -jar target/solid-0.0.1-SNAPSHOT.jar
```

## Personalización
Agrega tus controladores, servicios y repositorios en el paquete `com.solid`.

---

Generado automáticamente para iniciar un microservicio siguiendo principios SOLID.
