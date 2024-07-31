# Public Transportation Optimization - Spring Boot Service

## Overview
This project is a Spring Boot application designed to work in conjunction with a Python-based Public Transportation Optimization Project. The Spring Boot service handles user authentication via JWT, processes user trajectory data via MQTT, and supports multithreading to manage multiple users effectively.

## Purpose
The main purpose of this project is to facilitate the integration of user trajectory data with the Python project, allowing for the optimization of public transportation routes based on user behavior. This is part of a larger initiative to personalize route planning and improve the overall user experience by leveraging historical and real-time geospatial data.

## Features
- MQTT Client to receive and process user trajectory data
- JWT-based authentication for secure user access
- Multithreading support to handle multiple users simultaneously
- Integration with the Python project for real-time data analysis and prediction

## Tools and Technologies
- Spring Boot
- Spring Security
- Spring Integration MQTT
- JSON Web Token (JWT)
- Maven

## Dependencies
Add the following dependencies to your `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot dependencies -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- MQTT dependencies -->
    <dependency>
        <groupId>org.springframework.integration</groupId>
        <artifactId>spring-integration-mqtt</artifactId>
    </dependency>
    <dependency>
        <groupId>org.eclipse.paho</groupId>
        <artifactId>org.eclipse.paho.client.mqttv3</artifactId>
        <version>1.2.5</version>
    </dependency>

    <!-- JWT dependencies -->
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt</artifactId>
        <version>0.9.1</version>
    </dependency>
</dependencies>
