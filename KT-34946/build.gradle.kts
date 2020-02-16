plugins {
    kotlin("js") version "1.3.70-eap-184" apply false
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks.wrapper {
    gradleVersion = "6.0"
    distributionType = Wrapper.DistributionType.ALL
}
