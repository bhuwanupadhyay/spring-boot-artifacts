# Spring Boot Artifacts

This is collection for spring boot starters project for popular various tools.

## Spring Boot Starters

1. **[Drools Engine Starter](drools-engine-starter/README.md)**  [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.bhuwanupadhyay/drools-engine-starter/badge.svg?style=flat)](https://github.com/bhuwanupadhyay/spring-boot-artifacts/drools-engine-starter)
2. **[AWS DynamoDB Enhanced Client Starter](aws-dynamodb-enhanced-client-repository-starter/README.md)**  [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.bhuwanupadhyay/aws-sdkv2-dynamodb-boot-starter/badge.svg?style=flat)](https://github.com/bhuwanupadhyay/spring-boot-artifacts/aws-sdkv2-dynamodb-boot-starter)
3. **[Transactional Outbox Pattern JPA Starter](transactional-outbox-pattern-jpa-starter)**  [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.bhuwanupadhyay/transactional-outbox-pattern-jpa-starter/badge.svg?style=flat)](https://github.com/bhuwanupadhyay/spring-boot-artifacts/aws-sdkv2-dynamodb-boot-starter)

## Repositories

- Maven

```xml

<repositories>
    <repository>
        <id>maven-releases</id>
        <url>https://oss.sonatype.org/service/local/staging/deploy/maven2</url>
        <layout>default</layout>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </repository>
    <repository>
        <id>maven-snapshots</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        <layout>default</layout>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

- Gradle

```
repositories {
    mavenCentral()
    maven {
        url "https://oss.sonatype.org/service/local/staging/deploy/maven2"
        mavenContent {
            releasesOnly()
        }
    }
    maven {
        url "https://oss.sonatype.org/content/repositories/snapshots"
        mavenContent {
            snapshotsOnly()
        }
    }
}
```
