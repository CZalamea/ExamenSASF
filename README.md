# ExamenSASF
Examen final de ingreso a pasantias de Sudamericana de Software SA - JAVA INTERMEDIO


Instrucciones
Sistema de Gestión de Biblioteca
Descripción del Problema
Desarrollar un sistema de consola en Java que permita gestionar libros y préstamos en una biblioteca. El sistema debe registrar libros, realizar préstamos, consultar disponibilidad y mostrar el historial de préstamos por lector. Se aplican principios de programación orientada a objetos, uso de colecciones y manejo de excepciones.

✅ Requerimientos del Sistema
1. Libros y Préstamos
Cada libro debe tener:

Código único (ej. ISBN-001)

Título

Autor

Género (novela, ciencia, historia, etc.)

Estado (disponible / prestado)

Cada préstamo debe incluir:

Código único de préstamo

Nombre del lector

Código del libro

Fecha de préstamo

Fecha estimada de devolución

2. Registro de Libros y Préstamos
Permitir registrar nuevos libros.

Permitir registrar un préstamo ingresando:

Nombre del lector

Código del libro

Fechas de préstamo y devolución

Validar:

Que el código del libro exista.

Que el libro esté disponible.

Que los códigos de préstamo no se repitan.

3. Funcionalidades del Sistema
El sistema debe permitir:

Registrar libros y préstamos.

Consultar libros disponibles por género.

Listar todos los préstamos activos.

Consultar préstamos por lector y mostrar sus libros prestados.

Usar List, Map o Set según el caso. Aplicar Streams opcionalmente para filtros.

4. Manejo de Excepciones
Manejar errores con excepciones simples o personalizadas:

Código duplicado.

Libro no disponible.

Fechas mal formateadas (si se usa LocalDate).

Código de libro no encontrado.

🔧 Requisitos Técnicos
Usar clases con atributos privados y métodos get/set (encapsulamiento).

Seguir buenas prácticas de nombres de clases, atributos y métodos.

Implementar un menú por consola en la clase Main.

Comentar el código explicando clases y métodos principales.
