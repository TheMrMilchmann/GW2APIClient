/*
 * Copyright 2018 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    id("kotlin-platform-common") version "1.2.50" apply false
    id("kotlin-platform-js") version "1.2.50" apply false
    id("kotlin-platform-jvm") version "1.2.50" apply false
    id("kotlinx-serialization") version "0.5.1" apply false
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://kotlin.bintray.com/kotlinx")
    }
}