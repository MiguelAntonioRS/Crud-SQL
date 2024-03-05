# Aplicación CRUD de Gestión de Estudiantes

Esta es una aplicación Java que utiliza Swing para la interfaz gráfica de usuario (GUI) y JDBC para interactuar con una base de datos. La aplicación permite realizar operaciones básicas de Crear, Leer, Actualizar y Eliminar (CRUD) sobre registros de estudiantes.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- MySQL Server (u otro sistema de gestión de bases de datos compatible).
- Apache Maven (opcional, solo si deseas construir el proyecto desde el código fuente).

## Configuración de la Base de Datos

1. Instala y configura un servidor MySQL local o remoto.
2. Crea una base de datos llamada `db_students`.
3. Ejecuta el script `db_students.sql` para crear la tabla `TBStudents`.

## Ejecución

1. Clona o descarga este repositorio. ```git clone https://github.com/MiguelAntonioRS/Crud-SQL.git```
2. Abre una terminal (o CMD) y navega hasta la ubicación del proyecto.
3. Compila el proyecto (opcional si no se ha descargado el archivo JAR compilado):
    ```
    mvn compile
    ```
4. Ejecuta la aplicación:
    ```
    java -jar StudentCRUD.jar
    ```
5. La aplicación debería iniciarse y mostrarse la interfaz de usuario.

## Uso

- Una vez que la aplicación esté en funcionamiento, puedes realizar las siguientes operaciones:
    - **Agregar**: Completa los campos de entrada y haz clic en "Guardar".
    - **Modificar**: Haz clic en una fila de la tabla para seleccionar un estudiante, modifica los datos en los campos de entrada y haz clic en "Modificar".
    - **Eliminar**: Haz clic en una fila de la tabla para seleccionar un estudiante y haz clic en "Eliminar".
    - **Limpiar**: Borra todos los campos de entrada.

## Contribuciones

Las contribuciones son bienvenidas. Si tienes alguna idea para mejorar esta aplicación, no dudes en abrir un problema o enviar una solicitud de extracción.


