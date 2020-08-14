![GitHub contributors](https://img.shields.io/github/contributors/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub top language](https://img.shields.io/github/languages/top/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub last commit](https://img.shields.io/github/last-commit/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/rhacs/awakelab-archetypes-springmvc-jpa) ![GitHub](https://img.shields.io/github/license/rhacs/awakelab-archetypes-springmvc-jpa) [![Maven Central](https://img.shields.io/maven-central/v/io.github.rhacs/awakelab-archetypes-springmvc-jpa.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.rhacs%22%20AND%20a:%22awakelab-archetypes-springmvc-jpa%22)

# awakelab-archetypes-springmvc-jpa
Arquetipo para la creación de proyectos bajo Spring Framework MVC y Java Persistence API (JPA) con implementaciones básicas.

## Uso
El arquetipo se encuentra disponible en Maven Central, por lo que sólo es necesario seleccionarlo desde el asistente de creación de proyectos maven de tu IDE favorito o a través de la consola como se muestra a continuación

```bash
$ mvn archetype:generate -DarchetypeGroupId=io.github.rhacs \
        -DarchetypeArtifactId=awakelab-archetypes-springmvc-jpa \
        -DarchetypeVersion=1.0.8 \
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
        -DarchetypeVersion=1.0.8 \
        -DgroupId=io.github.rhacs \
        -DartifactId=prueba
```

## Licencia
Este proyecto se encuentra liberado bajo la licencia [GNU GPL-3.0](https://opensource.org/licenses/GPL-3.0)

