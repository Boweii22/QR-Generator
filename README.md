# QR Code Generator

A simple Android app for generating QR codes from text or URLs. Built with Java and XML, this app provides an intuitive interface, smooth animations, and a modern UI for creating and viewing QR codes on the go.

## Features

- **Generate QR Codes**: Convert any text or URL into a QR code.
- **Smooth Fade-in Animation**: QR codes appear with a fade-in effect.
- **Dark Theme UI**: Minimalist, dark-themed design with custom backgrounds and rounded corners.
- **Error Handling**: Displays prompts for empty input fields.

## Screenshots

![813shots_so](https://github.com/user-attachments/assets/7933bd0c-051c-497b-86f6-639f20303553)


## Requirements

- **Android Studio**
- **Min SDK**: 21 (Android 5.0 Lollipop)
- **Libraries**:
  - `com.journeyapps:zxing-android-embedded:4.3.0`
  - `com.google.zxing:core:3.4.1`

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/QRCodeGeneratorApp.git
   ```

2. **Open in Android Studio** and ensure the following dependencies are added to your `build.gradle` (app-level):
   ```gradle
   implementation "com.journeyapps:zxing-android-embedded:4.3.0"
   implementation "com.google.zxing:core:3.4.1"
   ```

3. **Sync and Run** the app.

## How It Works

- **MainActivity**: Handles user input and QR code generation.
- **BarcodeEncoder**: Generates QR codes from input text or URLs using the ZXing library.
- **Error Prompts**: Displays input validation errors directly in the input field.

## Customization

You can modify the colors, shapes, and animations in the app by editing the drawable resources and animations in the XML files.
