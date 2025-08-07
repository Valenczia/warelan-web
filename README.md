## Resumen Ejecutivo

**Descripción del proyecto**  
Este proyecto consiste en el desarrollo de un portal web interno para Warelan, orientado a clientes y empleados. Su función principal es presentar manuales operativos organizados en tarjetas visuales agrupadas por categoría. El enfoque estático garantiza compatibilidad total desde cualquier dispositivo, sin requerir backend.

**Problema identificado**  
Los procesos actuales de capacitación presentan deficiencias operativas:
- Las guías están distribuidas en múltiples canales (PDFs, correos, impresos).
- Existe alta dependencia del personal técnico para resolver dudas.
- El usuario no tiene autonomía para acceder a la documentación.

**Solución propuesta**  
Diseñar una plataforma web simple, responsiva y de fácil acceso donde las tarjetas agrupadas por categoría enlacen a guías paso a paso. Esta solución permite:
- Centralizar la documentación en un solo punto.
- Reducir la carga operativa en el área de soporte técnico.
- Mejorar la experiencia del cliente y la eficiencia interna.

**Arquitectura técnica**

| Componente | Tecnología              |
|------------|--------------------------|
| Frontend   | HTML, CSS                |
| Hosting    | GitHub Pages o Heroku    |
| CI/CD      | Travis CI                |
| Pruebas    | JUnit 5 ejecutado con Maven |
| Repositorio| GitHub (`README.md` + Wiki) |
| Backend    | No aplica (etapa 1 sin lógica de servidor) |

## Tabla de Contenidos

- [Resumen Ejecutivo](#resumen-ejecutivo)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso del sistema](#uso-del-sistema)
- [Contribuir](#contribuir)
- [Roadmap](#roadmap)
- [Documentación Técnica Extendida](https://github.com/valenczia/warelan-web/wiki)

## Requerimientos

### a. Infraestructura

**Servidores de Aplicación**  
No se requiere servidor de aplicación para esta versión. El sistema está basado en frontend estático, sin lógica de servidor ni procesamiento dinámico.

**Servidor Web**  
Puede utilizarse cualquiera de las siguientes opciones:
- GitHub Pages (recomendado para despliegue directo desde repositorio)
- Heroku con buildpack estático
- NGINX o Apache en entorno local

**Bases de Datos**  
No aplican en esta fase inicial. Todos los contenidos son archivos HTML estáticos y documentación referenciada desde el sistema de archivos.

---

### b. Paquetes adicionales

El proyecto utiliza los siguientes componentes:

| Componente              | Descripción                                       |
|-------------------------|---------------------------------------------------|
| Git                     | Control de versiones                             |
| Maven                   | Herramienta de construcción y gestión de dependencias |
| Travis CI               | Integración continua para ejecución de pruebas y verificación de calidad |
| JUnit 5.9.3             | Framework para pruebas unitarias en Java         |
| Navegador Web moderno   | Para visualización del portal (Chrome, Firefox, Edge) |

---

### c. Versión de Java

La versión mínima requerida para compilación y ejecución de pruebas es:

Java SE 17 (OpenJDK 17)

## Instalación

### a. ¿Cómo instalar el ambiente de desarrollo?

1. Instalar Java SE 17:
   - Descarga desde [https://adoptium.net](https://adoptium.net)
   - Verifica con: `java -version`

2. Instalar Apache Maven 3.8+:
   - Descarga desde [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
   - Verifica con: `mvn -version`

3. Instalar Git:
   - Descarga desde [https://git-scm.com](https://git-scm.com)

4. Clonar el proyecto:

   ```
   git clone https://github.com/usuario/repositorio.git
   cd repositorio
   ```

b. ¿Cómo ejecutar pruebas manualmente?
Ejecutar pruebas con Maven:

```
mvn test
```

Esto lanzará todas las pruebas unitarias definidas en el proyecto con JUnit.

c. ¿Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku?
Producción local:

Ejecutar:

```
mvn clean install
```

Copiar el contenido del directorio generado (por ejemplo target/ o dist/) al servidor web (NGINX, Apache, etc.).

Validar accesibilidad desde el navegador local.

## Configuración

### a. Configuración del producto (archivos de configuración)

El proyecto incluye los siguientes archivos de configuración esenciales:

| Archivo            | Propósito                                                  |
|--------------------|-------------------------------------------------------------|
| `.travis.yml`      | Configura Travis CI para ejecución automática de pruebas   |
| `pom.xml`          | Define dependencias y configuración de Maven               |
| `.gitignore`       | Excluye archivos y carpetas no deseadas del repositorio Git |
| `README.md`        | Documentación principal del proyecto                       |
| `static.json`      | (Solo para Heroku con buildpack estático) Configura rutas y MIME types |
| `.env.example`     | (Opcional) Plantilla para variables de entorno si se requiere configuración sensible |

> Todos los archivos deben permanecer en la raíz del proyecto para correcto funcionamiento.

---

### b. Configuración de los requerimientos

Los requerimientos definidos deben estar correctamente reflejados y operativos:

- **Java SE 17** instalado y disponible en el `PATH` del sistema
- **Apache Maven 3.8+** operativo y vinculado al entorno
- **Git** funcional para manejo de versiones y despliegue
- **Travis CI** vinculado con el repositorio para CI/CD automático
- **Navegador moderno** instalado para visualizar el producto final

> Validación de configuración mediante los siguientes comandos:

```
java -version       # Verifica instalación de Java
mvn -version        # Verifica instalación de Maven
git --version       # Verifica instalación de Git
```

## Uso del Sistema

### a. Referencia para usuario final

Esta sección proporciona las instrucciones para que el usuario final utilice correctamente el sistema.

#### Requisitos del usuario final

- Navegador web moderno (Chrome, Firefox, Edge).
- Acceso a la URL donde está desplegado el sistema.

#### Acceso al sistema

- URL local: `http://localhost:8080` (solo en entornos de desarrollo).
- URL en producción: `https://nombre-de-la-app.herokuapp.com` (o la que corresponda).

#### Funcionamiento

- El sistema presenta una interfaz web estática y responsiva.
- Navegación mediante enlaces HTML internos.
- Visualización de secciones como:
  - Inicio
  - Documentación
  - Recursos técnicos
  - Contacto

No se requiere autenticación ni configuración adicional para el uso básico.

---

### b. Referencia para usuario administrador

Esta sección está dirigida a quienes administran o mantienen el sistema.

#### Tareas de mantenimiento

1. **Modificar contenidos fuente:**
   - Editar archivos `.html`, `.css`, `.md` según necesidad.

2. **Compilar y probar cambios localmente:**
   
   ```
   mvn clean install
   mvn test
   ```

Subir cambios al repositorio:

```
git add .
git commit -m "Actualización del contenido"
git push origin main
```

## Contribución

### a. Guía de contribución para usuarios

Se agradece cualquier contribución que ayude a mejorar el proyecto. Para colaborar, sigue estos pasos:

**Fork del repositorio**
   - Haz clic en el botón `Fork` en la parte superior derecha del repositorio original.

**Clonar tu repositorio forked**

   ```
   git clone https://github.com/tu-usuario/tu-repositorio-forked.git
   cd tu-repositorio-forked
   ```

**Crear una nueva rama**
```
git checkout -b nombre-de-tu-rama
```

**Realizar los cambios necesarios**
Edita archivos, agrega funcionalidades o mejora la documentación.

**Confirmar los cambios**
```
git add .
git commit -m "Descripción breve de los cambios"
```

**Subir la rama al repositorio**
```
git push origin nombre-de-tu-rama
```

**Crear un Pull Request**
Ve a GitHub, selecciona tu rama y haz clic en Compare & Pull Request.

## Roadmap

Esta sección describe los requerimientos y mejoras que se planean implementar en futuras versiones del proyecto.

### a. Requerimientos que se implementarán en un futuro

| Funcionalidad                         | Descripción                                                             | Estado       |
|--------------------------------------|-------------------------------------------------------------------------|--------------|
| Buscador interno                     | Sistema de búsqueda para contenidos del portal                          | Planeado     |
| Integración con backend              | Conexión con API REST para contenidos dinámicos                         | En análisis  |
| Autenticación de usuarios            | Implementación básica con formulario de login y persistencia local      | Planeado     |
| Panel de administración              | Interfaz para que administradores editen contenidos vía navegador       | Propuesta    |
| Internacionalización (i18n)          | Soporte multilenguaje para vistas e interfaz                            | Planeado     |
| Sistema de comentarios               | Sección para feedback o interacción con usuarios                        | Propuesta    |
| Mejora de accesibilidad (WCAG AA+)  | Revisión y ajuste de componentes visuales para cumplimiento normativo   | En progreso  |
| Pruebas automatizadas adicionales    | Cobertura ampliada de pruebas para componentes front y backend futuros  | En progreso  |
| Migración a infraestructura Docker   | Contenedores para facilitar despliegue local y en la nube               | Planeado     |






