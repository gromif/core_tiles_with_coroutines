plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.nevidimka655.tiles_with_coroutines"
    compileSdk = project.property("compileSdk").toString().toInt()

    defaultConfig {
        minSdk = project.property("minSdk").toString().toInt()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

kotlin {
    jvmToolchain(project.property("kotlinJvmToolchainVersion").toString().toInt())
}

dependencies {
    api(libs.kotlin.coroutines)
}