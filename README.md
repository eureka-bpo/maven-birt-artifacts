[![Maven](https://img.shields.io/maven-central/v/eu.eureka-bpo.birt/birt-runtime.svg)](https://repo.maven.apache.org/maven2/eu/eureka-bpo/birt/birt-runtime/)

# Eclipse BIRT for Maven projects

Modules of this repository provide access to Eclipse BIRT functionality for Maven-based projects.

Use it by declaring in your project's pom.xml:

```
	<dependencies>
		<dependency>
			<groupId>eu.eureka-bpo.birt</groupId>
			<artifactId>birt-runtime</artifactId>
			<version>SNAPSHOT</version>
			<type>pom</type>
		</dependency>
	</dependencies>

	<repositories>
		<repository>
			<id>birt-4.19.0</id>
			<url>https://p2repository.com/mvn4/birt-4.19.0/</url>
		</repository>
	</repositories>
```
