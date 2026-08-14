<h1 align="center">Bronze Launcher</h1>

<img src="https://img.shields.io/badge/platform-Android-green" alt="Platform"/>
<img src="https://img.shields.io/badge/minSdk-21-blue" alt="Min SDK"/>
[![License: LGPL v3](https://img.shields.io/badge/License-LGPL%20v3-blue)](./LICENSE)

*A Minecraft: Java Edition launcher for Android, built on the [MojoLauncher](https://github.com/MojoLauncher/MojoLauncher) / [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher) codebase.*

Bronze Launcher lets you play Minecraft: Java Edition on your Android device, with a custom black-and-bronze UI and performance-focused defaults.

> [!NOTE]
> Bronze Launcher is a personal fork/rebrand built on top of [MojoLauncher](https://github.com/MojoLauncher/MojoLauncher), which itself continues the work of the original [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher) (discontinued). Bronze Launcher is **not affiliated with the PojavLauncher or MojoLauncher teams** — see [Credits & Dependencies](#credits--third-party-components-and-their-licenses) below for full attribution.

## Table of Contents

* [Introduction](#introduction)
* [Getting Bronze Launcher](#getting-bronze-launcher)
* [Building](#building)
    * [Quick Build (Recommended)](#quick-build-recommended)
    * [Detailed Build](#detailed-build)
* [Current Status](#current-roadmap)
* [Known Issues](#known-issues)
* [FAQ](#faq)
* [Contributing](#contributing)
* [Support](#support)
* [License](#license)
* [Credits & Dependencies](#credits--third-party-components-and-their-licenses)
    * [Core Components](#core-components)
    * [Framework & Library Support](#framework--library-support)
    * [Graphics & Rendering](#graphics--rendering)
    * [Java & Game Libraries](#java--game-libraries)
    * [Security & System](#security--system)
    * [Audio](#audio)
    * [Other Services](#other-services)
* [Roadmap](#current-roadmap)

## Introduction

* Bronze Launcher is a Minecraft: Java Edition launcher for Android, based on [MojoLauncher](https://github.com/MojoLauncher/MojoLauncher) (itself based on [Boardwalk](https://github.com/zhuowei/Boardwalk) and the original [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher))
* This launcher can launch almost all available Minecraft versions ranging from rd-132211 to 26.x snapshots (including Combat Test versions)
* Modding via Forge and Fabric are also supported
* This repository contains source code for Android

## Getting Bronze Launcher

Bronze Launcher isn't on Google Play. Build it from source — see [Building](#building) below.

## Building

### Quick Build (Recommended)

The easiest way to build Bronze Launcher is to use the pre-built JREs provided by CI.

1. Clone the repository: `git clone https://github.com/Bronzy-oss/Bronze-Launcher.git`
2. Build the launcher: `./gradlew :app_pojavlauncher:assembleFullDebug` (Use `gradlew.bat` on Windows)

The built APK will be located in `app_pojavlauncher/build/outputs/apk/debug/`.

### Detailed Build

If you need more control over the build process, follow these steps:

1. **Java Runtime Environment (JRE):** Fetched automatically by CI from [android-openjdk-build-multiarch](https://github.com/MojoLauncher/android-openjdk-build-multiarch).
2. **GLFW / MojoExec (native):** Vendored directly under `dnbglfw/src/main/cpp/` — see [GLFW](https://github.com/MojoLauncher/glfw) and [MojoExec](https://github.com/MojoLauncher/mojoexec).
3. **Build the launcher:** `./gradlew :app_pojavlauncher:assembleFullDebug` (Replace `gradlew` with `gradlew.bat` on Windows).

## Current Roadmap
- [x] OpenJDK 8 / 17 / 21 Mobile ports: ARM32, ARM64, x86, x86_64
- [x] Headless mod installer + GUI mod installer
- [x] OpenGL in OpenJDK environment, OpenAL audio
- [x] Support for Minecraft 1.12.2 and below, 1.13+, and 1.17 (22w13a)+
- [x] Instance system
- [x] Out-of-the-box 1.21.5 support
- [x] mrpack/CurseForge zip import
- [ ] Custom black/bronze theme across all screens *(in progress)*
- [ ] Built-in Fabric performance mod bundling (Sodium/Lithium)
- [ ] MMC-compatible instance import
- [ ] More to come!

## Known Issues

See the [issue tracker](https://github.com/Bronzy-oss/Bronze-Launcher/issues) for known issues and their status.

## FAQ

No dedicated docs site yet — please open a [GitHub issue](https://github.com/Bronzy-oss/Bronze-Launcher/issues) with questions.

## Contributing

This is currently a personal/solo project. Feel free to open issues or pull requests.

## Support

Please open a [GitHub issue](https://github.com/Bronzy-oss/Bronze-Launcher/issues) for support.

## License

Bronze Launcher is licensed under [GNU LGPLv3](./LICENSE), consistent with the upstream projects it's built on.

## Credits & Third Party Components and Their Licenses

### Core Components
- [PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher): [GNU LGPLv3 License](https://github.com/PojavLauncherTeam/PojavLauncher/blob/v3_openjdk/LICENSE)
- [Boardwalk](https://github.com/zhuowei/Boardwalk) (JVM Launcher): Unknown License / [Apache License 2.0](https://github.com/zhuowei/Boardwalk/blob/master/LICENSE) or [GNU GPLv2](https://github.com/zhuowei/Boardwalk/blob/master/LICENSE)
- [MojoLauncher](https://github.com/MojoLauncher/MojoLauncher): [GNU LGPLv3 License](https://github.com/MojoLauncher/MojoLauncher/blob/v3_openjdk/LICENSE)

### Framework & Library Support
- Android Support Libraries: [Apache License 2.0](https://android.googlesource.com/platform/prebuilts/maven_repo/android/+/master/NOTICE.txt)
- [OpenJDK](https://github.com/PojavLauncherTeam/openjdk-multiarch-jdk8u): [GNU GPLv2 License](https://openjdk.java.net/legal/gplv2+ce.html)

### Graphics & Rendering
- [GL4ES](https://github.com/PojavLauncherTeam/gl4es): [MIT License](https://github.com/ptitSeb/gl4es/blob/master/LICENSE)
- [MobileGlues](https://github.com/MobileGL-Dev/MobileGlues): [LGPL-2.1 License](https://github.com/MobileGL-Dev/MobileGlues/blob/dev-es/LICENSE)
- [Krypton Wrapper](https://github.com/BZLZHH/NG-GL4ES): [MIT License](https://github.com/BZLZHH/NG-GL4ES/blob/main/LICENSE)
- [Mesa 3D Graphics Library](https://gitlab.freedesktop.org/mesa/mesa): [MIT License](https://docs.mesa3d.org/license.html)

### Java & Game Libraries
- [LWJGL3](https://github.com/MojoLauncher/lwjgl3): [BSD-3 License](https://github.com/LWJGL/lwjgl3/blob/master/LICENSE.md)
- [GLFW](https://github.com/MojoLauncher/glfw): [zlib license](https://github.com/MojoLauncher/glfw/blob/glfw34/LICENSE.md)
- [LWJGL2-GLFW](https://github.com/MojoLauncher/lwjgl2-glfw): 3-Clause BSD license

### Security & System
- [pro-grade](https://github.com/pro-grade/pro-grade) (Java sandboxing security manager): [Apache License 2.0](https://github.com/pro-grade/pro-grade/blob/master/LICENSE.txt)
- [bhook](https://github.com/bytedance/bhook) (Exit code trapping): [MIT License](https://github.com/bytedance/bhook/blob/main/LICENSE)
- [Authlib-Injector](https://github.com/yushijinhun/authlib-injector) (Authorization via ely.by): [AGPL-3.0](https://github.com/yushijinhun/authlib-injector/blob/develop/LICENSE)

### Audio
- [OpenAL-Soft](https://github.com/kcat/openal-soft): [GNU GPLv2 License](app_pojavlauncher/src/main/assets/licenses/OPENAL-SOFT_GPL2)
- [oboe](https://github.com/google/oboe): [Apache License 2.0](https://github.com/google/oboe/blob/main/LICENSE)

### Other Services
- Thanks to [Mineskin](https://mineskin.eu/) and [MCHeads](https://mc-heads.net) for providing Minecraft avatars
