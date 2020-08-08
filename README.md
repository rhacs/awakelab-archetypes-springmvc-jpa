![GitHub contributors](https://img.shields.io/github/contributors/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub top language](https://img.shields.io/github/languages/top/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub last commit](https://img.shields.io/github/last-commit/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub](https://img.shields.io/github/license/rhacs/awakelab-archetypes-springmvc-jpa) 

# awakelab-archetypes-springmvc-jpa
Arquetipo para la creación de proyectos bajo Spring Framework MVC y Java Persistence API (JPA) con implementaciones básicas.

## Instalación
Lo primero es clonar el repositorio y luego efectuar la instalación a través de maven

```bash
$ git clone https://github.com/rhacs/awakelab-archetypes-springmvc-jpa.git
$ cd awakelab-archetypes-springmvc-jpa
$ mvn clean install
```

## Uso
Una vez instalado el arquetipo, se puede generar el proyecto utilizando la consola como se indica a continuación o a través del asistente de creación de proyectos de tu IDE favorito. **Importante**: Recuerda habilitar el checkbox que permite ver los arquetipos marcados como *SNAPSHOT*

```bash
$ mvn archetype:generate -DarchetypeGroupId=io.github.rhacs \
        -DarchetypeArtifactId=awakelab-archetypes-springmvc-jpa \
        -DarchetypeVersion=1.0.2-SNAPSHOT \
        -DgroupId=<GroupId de tu Proyecto> \
        -DartifactId=<ArtifactId de tu Proyecto>
```

Siendo:

 * **-DgroupId** el nombre de tu grupo/organización. Por ejemplo: `io.github.rhacs`
 * **-DartifactId** el nombre de tu proyecto. Por ejemplo: `pruebas`


Un ejemplo más concreto:

```bash
$ mvn archetype:generate -DarchetypeGroupId=io.github.rhacs \
        -DarchetypeArtifactId=awakelab-archetypes-springmvc-jpa \
        -DarchetypeVersion=1.0.2-SNAPSHOT \
        -DgroupId=io.github.rhacs \
        -DartifactId=prueba
```

## Licencia
Este proyecto se encuentra liberado bajo la licencia [GNU GPL-3.0](https://opensource.org/licenses/GPL-3.0)

