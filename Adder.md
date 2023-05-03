<title>Adder CSUSM CS231</title>
<h1>Binary Adder with Microcontroller</h1>

Preparation before setup
<details>
<summary>Hardware Requirements</summary>

```java
    - full-size breadboard
    - 5 LEDs(color of your choice)
    - 8 buttons
    - Microcontroller(this project uses an ESP-32S NodeMCU)
    - A computer with VSCode with PlatformIO extension to push C++ code to ESP or Arduino
        - Can also use Arduino IDE
```

</details>

Wiring Adder before code
<details>
    <summary>Wiring Circuit</summary>

</details>

Writing C++ code for microcontroller
<details>
    <summary>Software for Microcontroller</summary>
    
</details>


## Setting up Java Web Application
<details>
  <summary>Java setup, Maven build and Runtime Test!</summary>

Java is two pieces (JDK and JRE), both parts are needed in order to run and build 
```
$ sudo apt update
$ sudo apt upgrade
```
  
Install Java Runtime Environment
```
$ sudo apt install default-jre
$ java -version
```
  
Install Java Development Kit
```
$ sudo apt install default-jdk
$ javac -version
```

Maven is required to build project
```
$ sudo apt update
$ sudo apt upgrade
$ sudo apt install maven
$ mvn -version
```

### If one of these aren't working or installing properly, check that your linux OS is up-to-date
</details>