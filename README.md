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
			<id>birt-4.15.0</id>
			<url>https://p2repository.com/mvn3/birt-4.15.0/</url>
		</repository>
	</repositories>
```