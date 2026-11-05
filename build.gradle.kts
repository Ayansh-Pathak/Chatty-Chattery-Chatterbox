plugins {
    id 'com.android.application'
}

android {
    namespace 'com.example.communicationapp'
    compileSdk 34

    defaultConfig {
        applicationId "com.example.communicationapp"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    // Agora Voice & Video Streaming Engine
    implementation 'io.agora.rtc:full-sdk:4.2.6'
    // Agora Real-Time Text Messaging Infrastructure
    implementation 'io.agora.rtm:rtm-sdk:1.5.1'
}
