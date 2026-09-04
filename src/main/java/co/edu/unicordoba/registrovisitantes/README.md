# Registro de visitantes

API REST desarrollada con Java y Spring Boot para estudiar la diferencia entre miembros de instancia y miembros de clase (`static`).

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- Spring Web
- IntelliJ IDEA Ultimate

## Estructura del proyecto

- `modelo`: contiene la clase `Visitante`.
- `util`: contiene la clase de utilidades `TextoUtil`.
- `servicio`: contiene el bean singleton `VisitanteService`.
- `controlador`: contiene los endpoints de la API REST.

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Configurar Java 21.
4. Ejecutar `RegistroVisitantesApplication`.
5. La API estará disponible en `http://localhost:8080`.

## Endpoints

### Registrar un visitante

```http
POST /api/visitantes?nombre=Ana&edad=25