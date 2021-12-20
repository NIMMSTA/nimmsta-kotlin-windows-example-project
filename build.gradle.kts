plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        url = uri("https://maven.goma-cms.org/repository/nimmsta-core-release/")
        credentials {
            username = "username"
            password = "password"
        }
        metadataSources {
            mavenPom()
            artifact()
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("com.nimmsta.core:shared-jvm:5.0.3450") {
        isTransitive = true
        isChanging = true
    }
}