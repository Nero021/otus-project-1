plugins {
	java
	id("org.springframework.boot")
	id("io.spring.dependency-management")
}

val packageGroup: String by project
val projectVersion: String by project
val projectName: String by project

group = packageGroup
version = projectVersion

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
}

tasks.getByName<Jar>("jar") {
	enabled = false
}

tasks {
	bootJar {
		archiveFileName.set("$projectName.jar")
	}
}
