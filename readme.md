# 🎓 Sistema de Gestión Educativa con MongoDB

![MongoDB Badge](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)
![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## 📑 Índice
1. [Descripción y Objetivos](#-descripción-y-objetivos)
2. [Arquitectura y Diseño](#-arquitectura-y-diseño)
3. [Funcionalidades Implementadas](#-funcionalidades-implementadas)
4. [Decisiones Técnicas](#-decisiones-técnicas)
5. [Base de Datos](#-base-de-datos)

## 📋 Descripción y Objetivos
El proyecto implementa un sistema de gestión educativa que permite administrar información de alumnos y profesores utilizando MongoDB. Se ha diseñado siguiendo patrones de diseño que garantizan la mantenibilidad, escalabilidad y robustez del sistema.

## 🏗 Arquitectura y Diseño

### Patrones Implementados
- **Patrón DAO**: Abstrae y encapsula el acceso a la base de datos
- **Arquitectura en Capas**: Separación clara de responsabilidades
- **Herencia**: Reutilización de código y polimorfismo
- **Servicios**: Centralización de lógica de negocio


### Estructura del Sistema

1. **Interfaz de Usuario**
    - Interacción con el usuario
    - Menú de opciones
    - Captura de datos

2. **Capa de Servicio** ↓
    - Lógica de negocio
    - Validaciones
    - Gestión de operaciones

3. **Capa DAO** ↓
    - Acceso a datos
    - Operaciones CRUD
    - Mapeo de objetos

4. **MongoDB** ↓
    - Almacenamiento persistente
    - Gestión de colecciones
    - Consultas y actualizaciones

> Las flechas (↓) indican el flujo de datos y operaciones entre capas.
## ⚡ Funcionalidades Implementadas

### 🔄 Operaciones Principales
| Operación | Descripción | Validaciones |
|-----------|-------------|--------------|
| Inserción | Profesores y Alumnos | Datos completos y formato correcto |
| Consulta | Global y específica | Criterios de búsqueda |
| Actualización | Valoración profesores | Email existente |
| Eliminación | Alumnos aprobados | Calificación ≥ 5 |

### 🎯 Validaciones Implementadas
- **Edad**: Rangos específicos por rol
- **Género**: Formato controlado
- **Grados**: Opciones predefinidas
- **Calificaciones**: Rangos numéricos

## ⚙️ Decisiones Técnicas

### 💡 ¿Por qué esta Arquitectura?
- **Mantenibilidad**: Cambios localizados
- **Escalabilidad**: Fácil adición de funcionalidades
- **Testabilidad**: Capas independientes
- **Reutilización**: Código compartido mediante herencia

### 🛠 Elecciones de Diseño
- **IDs como String**: Compatibilidad con datos existentes
- **Validaciones en Tiempo Real**: Mejor experiencia de usuario
- **Manejo Centralizado de Errores**: Consistencia en mensajes
- **Genericidad**: Flexibilidad en implementaciones

## 💾 Base de Datos

### 📁 Estructura MongoDB
- **Database**: `centro_estudios`
- **Collections**:
    - `alumnos`: Datos de estudiantes
    - `profesores`: Datos de docentes

### 🔐 Gestión de Conexiones
- Patrón Singleton
- Manejo automático de recursos
- Configuración centralizada

---
