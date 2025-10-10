plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // 1. 【新增】添加 kotlin-kapt 插件，用于 Room 的注解处理器
    id("kotlin-kapt")
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.petapp"
    // 保持您的 SDK 版本
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.petapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    // 保持原有依赖
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    // 2. 【新增】Room 数据库依赖
    val room_version = "2.6.1" // 示例版本号，请检查最新稳定版

    // Room Core 运行时
    implementation("androidx.room:room-runtime:$room_version")

    // Room Kotlin 扩展和 Coroutine 支持 (推荐)
    implementation("androidx.room:room-ktx:$room_version")

    // Room 编译时注解处理器 (必须使用 kapt)
    kapt("androidx.room:room-compiler:$room_version")

    // 保持原有测试和调试依赖
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}