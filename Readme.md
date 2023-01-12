# Spring Product Microservice

> Ejemplo de microservicio con Spring basado en arquitectura hexagonal. Se trata de un ejemplo concreto en el que se intenta aplicar principios del desarrollo como Arquitectura Hexagonal, principios SOLID y Clean Code.

## Descripción

El ejemplo consiste en la creación de un microservicio REST que recibe una petición y a su vez conecta con otro microservicio para obtener la información, unificarla y servirla al cliente final.

## Usos

Es posible ejecutar el ejemplo a través de Docker con el comando:
```
    docker build -t [Nombre de la imagen] .
``` 
> La imagen no está optimizada y es posible que ocupe alrededor de 500MB

Por ello se recomienda su ejecución a través de un IDE como IntelliJ, Eclipse o NetBeans.

## Arquitectura

- Domain
    - Model
    - Repository
    - Service
        - Product
        - Rest

- Application
    - Controller

- Infrastruture
    - Config

## Más info

- [MIT](https://opensource.org/licenses/MIT)

## Información de contacto

> alejandro93mm@gmail.com || Alejandro Martinez Martinez

## Licencia

[MIT](https://opensource.org/licenses/MIT)
