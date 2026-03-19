# TaskApp - MVVM con Hilt, StateFlow y Jetpack Compose

## Autor

**Nombre:** Jhoseth Esneider Rozo Carrillo  
**Código:** 02230131027  
**Programa:** Ingeniería de Sistemas  
**Unidad:** Unidad 3 – Arquitectura de App Móviles  
**Actividad:** Post-Contenido 1
**Fecha:** 19/03/2026

---

## Descripción del Proyecto

Este proyecto consiste en el desarrollo de una aplicación móvil para la gestión de tareas, construida como parte del laboratorio de la Unidad 3 de la asignatura Aplicaciones Móviles.

La aplicación muestra una lista de tareas obtenidas desde un repositorio simulado en memoria, lo que permite centrarse en la separación de responsabilidades entre capas, la gestión reactiva del estado y la inyección de dependencias, sin la complejidad adicional de una base de datos real.

---

## Objetivo

Implementar una aplicación Android que muestre una lista de tareas aplicando el patrón MVVM, utilizando:

- ViewModel
- StateFlow
- Repositorio simulado (FakeRepository)
- Inyección de dependencias con Hilt
- UI con Jetpack Compose

---

## Arquitectura

Se implementa el patrón MVVM (Model - View - ViewModel):

UI (Compose)
↓
ViewModel (StateFlow)
↓
Repository (Fake)
↓
Data

---

### 🔹 Capas:

- **UI:** Pantalla declarativa con Compose
- **ViewModel:** Manejo del estado con StateFlow
- **Repository:** Simulación de datos en memoria
- **DI:** Hilt para inyección de dependencias

---

## 🛠️ Tecnologías Usadas

- Kotlin
- Jetpack Compose
- ViewModel
- StateFlow
- Coroutines
- Hilt (Inyección de dependencias)
- JUnit (Testing)

---

# Capturas del Resultado

## App corriendo con tareas

![Captura app corriendo](evidencias/Captura%20app%20ejecución.png)

---

## App sin rotar

![Captura sin rotar](evidencias/Captura%20sin%20rotar.png)

---

## App con rotación

![Captura rotación](evidencias/Captura%20con%20rotación.PNG)

---

## Test unitario del TaskViewModel

![Captura test](evidencias/Captura%20test%20unitario.png)
