# Biblioteca Alura

Este es un proyecto de una biblioteca digital que permite la búsqueda y gestión de libros y autores. La aplicación se conecta a una API externa para obtener datos de libros y permite almacenar y listar libros y autores en una base de datos local.

## Características

- Buscar libros por título.
- Listar todos los libros registrados.
- Listar todos los autores registrados.
- Listar autores vivos en un año determinado.
- Listar libros por idioma.

## Requisitos

- Java 8 o superior
- Spring Boot 2.5.4 o superior
- JPA / Hibernate
- H2 Database (o cualquier base de datos de tu elección)
- Maven

## Instalación

1. Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/biblioteca-alura.git
    cd biblioteca-alura
    ```

2. Configura la base de datos en el archivo `application.properties` si es necesario:

    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.h2.console.enabled=true
    ```

3. Compila y ejecuta el proyecto con Maven:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Uso

Después de ejecutar la aplicación, puedes interactuar con el menú en la consola:


Claro, aquí tienes el archivo README.md en formato Markdown:

markdown
Copiar código
# Biblioteca Alura

Este es un proyecto de una biblioteca digital que permite la búsqueda y gestión de libros y autores. La aplicación se conecta a una API externa para obtener datos de libros y permite almacenar y listar libros y autores en una base de datos local.

## Características

- Buscar libros por título.
- Listar todos los libros registrados.
- Listar todos los autores registrados.
- Listar autores vivos en un año determinado.
- Listar libros por idioma.

## Requisitos

- Java 8 o superior
- Spring Boot 2.5.4 o superior
- JPA / Hibernate
- H2 Database (o cualquier base de datos de tu elección)
- Maven

## Instalación

1. Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/biblioteca-alura.git
    cd biblioteca-alura
    ```

2. Configura la base de datos en el archivo `application.properties` si es necesario:

    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.h2.console.enabled=true
    ```

3. Compila y ejecuta el proyecto con Maven:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

## Uso

Después de ejecutar la aplicación, puedes interactuar con el menú en la consola:

Elija la opción a través de su número:

Buscar libro por titulo
Listar libros registrados
Listar autores registrados
Listar autores vivos en un determinado año
Listar libros por idioma
Salir

## Estructura del Proyecto

- `src/main/java/com/alura/biblioteca/models/bd`: Contiene las entidades `Libro` y `Autor`.
- `src/main/java/com/alura/biblioteca/repository`: Contiene los repositorios `LibroRepository` y `AutorRepository`.
- `src/main/java/com/alura/biblioteca/service`: Contiene las clases `ConsumoAPI` y `ConvierteDatos` para manejar la lógica de consumo de la API y conversión de datos.
- `src/main/java/com/alura/biblioteca/principal`: Contiene la clase principal `Principal` que maneja el menú de la aplicación.
