# Registro de visitantes

Registro de visitantes
Integrantes:
Amehd Antonio Velez Lopez
Jhon Angel Arroyo Baldovino
Carlos andres Correa Jimenez

Asignatura
Programación III – Universidad de Córdoba

API REST desarrollada con Java 21 y Spring Boot para estudiar el alcance de los miembros de instancia, los miembros `static` y los beans singleton de Spring.

## Tecnologías

- Java 21
- Spring Boot
- Maven
- Docker
- Render

## Ejecutar localmente

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Configurar Java 21.
4. Ejecutar `RegistroVisitantesApplication`.
5. Acceder a `http://localhost:8080`.

La aplicación utiliza el puerto configurado mediante:

```properties
server.port=${PORT:8080}
```

## Endpoints

### Registrar visitante

```http
POST /api/visitantes
Content-Type: application/json
```

Cuerpo de la petición:

```json
{
  "nombre": "Ana",
  "edad": 25
}
```

### Listar visitantes

```http
GET /api/visitantes
```

### Consultar conteos

```http
GET /api/visitantes/conteos
```

### Normalizar un nombre

```http
GET /api/visitantes/normalizar?texto=ana%20maria%20perez
```

### Consultar la instancia

```http
GET /api/visitantes/instancia
```

## Despliegue

El proyecto incluye un Dockerfile multietapa. Render construye la imagen desde el repositorio de GitHub y publica la API.

La URL pública de Render se agregará después del despliegue.