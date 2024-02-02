# Smart Car Control System with Arduino/Raspberry Pi and Java Swing

This project involves creating a smart car control system using Arduino or Raspberry Pi and a Java Swing application to interact with the car. Additionally, the system incorporates a camera gesture recognition feature to move the car forward and stop when another car is detected.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Hardware Setup](#hardware-setup)
- [Software Setup](#software-setup)
- [Arduino/Raspberry Pi Code](#arduino-raspberry-pi-code)
- [Java Swing Application](#java-swing-application)
- [Camera Gesture Recognition](#camera-gesture-recognition)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The goal of this project is to create a smart car control system that allows users to control a car using a Java Swing application. The system is enhanced with a camera-based gesture recognition feature to make the car move forward and stop when another car is detected.

## Prerequisites

Before you begin, ensure you have the following:

- Arduino or Raspberry Pi board
- Motor driver module
- DC motors and wheels
- Ultrasonic sensor for obstacle detection
- Camera module for gesture recognition
- Java Development Kit (JDK)
- Python installed on Raspberry Pi (for camera module)
- Latching/Solid State relay for controlling the car

## Hardware Setup

Connect the hardware components following the circuit diagram provided in the `hardware_setup` folder. Ensure that the connections are secure and follow safety guidelines.

## Software Setup

1. Install the Arduino IDE or set up the Raspberry Pi with Raspbian OS.
2. Install the necessary libraries for Arduino or Raspberry Pi, such as the Servo library for motor control.
3. Set up a development environment for Java Swing application development.
4. Install Python libraries for the camera module on the Raspberry Pi.

## Arduino/Raspberry Pi Code

Upload the Arduino code (`arduino_code.ino`) to your Arduino board or run the Python script (`raspberry_pi_code.py`) on your Raspberry Pi. Adjust the code according to your pin configurations and specifications.

## Java Swing Application

Implement the Java Swing application using the code provided in the `java_swing_app` folder. This application allows users to control the car manually and receives feedback from the car's sensors.

## Camera Gesture Recognition

Follow the instructions in the `camera_gesture_recognition` folder to set up the camera-based gesture recognition system. This system enables the car to move forward when a specific gesture is recognized and stops when another car is detected.

## Usage

1. Power up the car system.
2. Run the Java Swing application on your computer.
3. Use the GUI to control the car manually or activate the gesture recognition mode.
4. Enjoy controlling your smart car!

## Contributing

Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and improvements are highly appreciated.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
