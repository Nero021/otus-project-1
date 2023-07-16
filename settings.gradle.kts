val projectName: String by settings

pluginManagement {
    repositories {
        mavenCentral()
    }

    val springBootVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    plugins {
        id("org.springframework.boot").version(springBootVersion).apply(false)
        id("io.spring.dependency-management").version(springDependencyManagementPluginVersion).apply(false)
    }
}

buildscript {
    repositories {
        mavenCentral()
    }
}

rootProject.name = projectName
