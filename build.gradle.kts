plugins {
    alias(libs.plugins.astracrypt.android.library)
}

android {
    namespace = "com.nevidimka655.tiles_with_coroutines"
}

dependencies {
    api(libs.kotlin.coroutines)
}