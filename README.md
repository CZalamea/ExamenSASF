# 📚 ExamenSASF

**Examen Final - Ingreso a Pasantías**  
**Sudamericana de Software S.A. | JAVA INTERMEDIO**

---

## 🎯 Descripción del Proyecto

Sistema de consola en **Java** para la **gestión de una biblioteca**, que permite:

- Registrar libros 📖  
- Realizar préstamos 🤝  
- Consultar disponibilidad ✅  
- Mostrar historial de préstamos por lector 🔍

> Se aplican principios de **programación orientada a objetos**, uso de **colecciones** y manejo de **excepciones**.

---

## ✅ Requerimientos del Sistema

### 📗 Libros

Cada libro debe contener:

- Código único (ej. `ISBN-001`)
- Título
- Autor
- Género (novela, ciencia, historia, etc.)
- Estado (`Disponible` / `Prestado`)

### 📘 Préstamos

Cada préstamo debe contener:

- Código único de préstamo
- Nombre del lector
- Código del libro
- Fecha de préstamo
- Fecha estimada de devolución

---

## 🛠️ Funcionalidades

- Registrar nuevos **libros** y **préstamos**
- Consultar **libros disponibles por género**
- Listar **préstamos activos**
- Consultar **préstamos por lector** y mostrar libros prestados

> Uso recomendado de `List`, `Map` o `Set` según el caso. Se puede aplicar **Streams** para filtros.

---

## ⚠️ Validaciones

- Código del libro debe **existir**
- Libro debe estar **disponible**
- Códigos de préstamo deben ser **únicos**

---

## 🚨 Manejo de Excepciones

Se debe capturar y manejar errores como:

- Código duplicado
- Libro no disponible
- Fechas mal formateadas (`LocalDate`)
- Código de libro no encontrado

---

## 🔧 Requisitos Técnicos

- Uso de **clases con atributos privados** y métodos `get/set` (encapsulamiento)
- Buenas **prácticas de nombres** para clases, atributos y métodos
- Implementar un **menú interactivo por consola** en la clase `Main`
- Comentar el código explicando clases y métodos principales

---

## 🧠 Tips

- Piensa en modularidad: separa las clases por entidad (`Libro`, `Prestamo`, etc.)
- Usa excepciones personalizadas para una mejor organización de errores
- Usa `LocalDate` para trabajar con fechas de forma segura
- Aplica principios SOLID donde creas conveniente 😉

---

¡Mucho éxito! 🚀  
_Sudamericana de Software S.A._
