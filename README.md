Markdown
# Proyecto Finca - Grupo 04

## Integrantes y Roles
* **Tomala Jeremy** - Líder de Integración
* **Tenesaca Jose** - Responsable de Pruebas
* **Torres Lady** - Responsable de Documentación
* **Rivadeneira Ronaldo** - Desarrollador / Colaborador

## Entorno Tecnológico por Integrante
| Integrante | Versión de Java | Versión de Git | Versión de IntelliJ IDEA |
| :--- | :--- | :--- | :--- |
| Tomala Jeremy | Java 21 | 2.43.0 | 2024.1 |
| Tenesaca Jose | Java 21 | 2.40.1 | 2023.3 |
| Torres Lady | Java 21 | 2.44.0 | 2024.1 |
| Rivadeneira Ronaldo | Java 21 | 2.42.0 | 2023.2 |

## Instrucciones para Ejecutar las Pruebas
Para ejecutar las pruebas automatizadas con JUnit 5, abra una terminal en la raíz del proyecto y ejecute:
```bash
mvn clean test pruebas automatizadas con JUnit 5, abra una terminal en la raíz del proyecto y ejecute
---

## 2. Diagnóstico (antes)
| Componente / Métrica | Estado Inicial |
| :--- | :--- |
| Configuración de sensores | Lectura manual y acoplada sin umbrales dinámicos |
| Sistema de alertas | Notificaciones directas sin separación de responsabilidades |

---

## 3. Tabla SOLID
| Principio | Clase Concreta del Proyecto | Razón de cumplimiento |
| :---: | :--- | :--- |
| **S** | `MotorAlertas` | Se encarga exclusivamente de evaluar los umbrales de activación sin mezclar lógica de persistencia. |
| **O** | Sistema de Reglas (`ReglaRiego`) | Permite agregar nuevas reglas de validación sin modificar el código fuente del motor principal. |
| **L** | Implementaciones de sensores | Las clases derivadas pueden sustituirse sin alterar el comportamiento esperado por las interfaces base. |
| **I** | Interfaces de Notificación | Los componentes dependen únicamente de los métodos específicos que utilizan. |
| **D** | `MotorAlertas` | Depende de abstracciones (interfaces) y no de implementaciones concretas de bajo nivel. |

---

## 4. Justificación de umbrales
* **Umbral 1 (Humedad menor a 30%):** Valor crítico para activar el riego de emergencia antes de que el cultivo sufra estrés hídrico.
* **Umbral 2 (Temperatura mayor a 35°C):** Ajuste preventivo para evitar evaporación excesiva durante las horas pico de calor.
* **Umbral 3 (Nivel de tanque mayor a 10%):** Margen de seguridad operativo para apagar la bomba y evitar daños por funcionamiento en seco.

---

## 5. Declaración de uso de IA
* **Paso en el que se usó:** Estructuración de lógica y revisión de patrones de diseño (Observer y Factory).
* **Qué se verificó:** Se comprobaron manualmente los tipos de datos devueltos, la correcta compilación con Maven y la aplicación correcta de las reglas del taller.

---

## 6. Cómo ejecutar verificación completa
Para compilar, empaquetar y verificar el proyecto con Maven ejecutando todas las pruebas automatizadas, abra una terminal en la raíz del proyecto y ejecute:
