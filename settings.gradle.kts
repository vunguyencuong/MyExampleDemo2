pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        jcenter()
        maven { url = uri("https://maven-other.tuya.com/repository/maven-releases/") }
        maven { url = uri("https://maven-other.tuya.com/repository/maven-commercial-releases/") }
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://central.maven.org/maven2/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://developer.huawei.com/repo/") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven { url = uri("https://maven-other.tuya.com/repository/maven-releases/") }
        maven { url = uri("https://maven-other.tuya.com/repository/maven-commercial-releases/") }
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://central.maven.org/maven2/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://developer.huawei.com/repo/") }
    }
}

rootProject.name = "MyExampleDemo2"
include(":app")
 