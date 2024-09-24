# Educational_Initiative_Task


## Overview

This project demonstrates the implementation of various design patterns in software development. The focus is on the **Behavioral**, **Creational**, and **Structural** design pattern categories. Additionally, **Exercise 2** showcases practical applications of these design patterns, where one task has been completed successfully.

---


### Exercise 1 : Patterns Implemented:
1. **Behavioral Pattern**:  
   - **State Pattern**: Manages the state of different smart devices.  
   - **Strategy Pattern**: Defines different strategies for controlling devices (manual control, scheduling, automation).  

2. **Creational Pattern**:  
   - **Abstract Factory Pattern**: Creates instances of different smart devices based on their type (e.g., Light, Thermostat, Door Lock).  
   - **Prototype Pattern**: Clones existing devices for dynamic addition without reinitializing them from scratch.  

3. **Structural Pattern**:  
   - **Composite Pattern**: Groups devices together for batch control (e.g., turning off all lights at once).  
   - **Facade Pattern**: Provides a simplified interface for controlling the smart home system, hiding the complexity of multiple subsystems.  

---

## Exercise 2 : Smart Home System Programming:

In **Exercise 2**, I have completed **Task No. 4** which involves developing a **Smart Home System Simulation** with the following features:

### Problem Statement:
Create a simulation for a **Smart Home System** that allows the user to control various smart devices (lights, thermostats, door locks) through a central hub. The user can schedule devices, automate tasks, and view the status of each device.

### Functional Requirements:
1. **Initialize Smart Home System** with different devices, each having a unique ID and type (light, thermostat, door lock).
2. **Control Features**:
   - Turn devices on/off.
   - Schedule devices to turn on/off at a specific time.
   - Automate tasks based on triggers (e.g., turn off lights when the thermostat reaches a certain temperature).
3. **Optional**: Dynamically add or remove devices.

### Design Patterns Used:
1. **Behavioral Pattern**:
   - **Observer Pattern**: Updates all devices when a change occurs in the system (e.g., thermostat adjustment triggers lights to turn off).

2. **Creational Pattern**:
   - **Factory Method**: Creates instances of different smart devices (lights, thermostats, door locks) dynamically.

3. **Structural Pattern**:
   - **Proxy Pattern**: Controls access to the devices, ensuring security (e.g., authentication before controlling door locks).

---

### Key Focus Areas:
1. **Behavioral Pattern**: 
   - Observer Pattern to update all devices when a change occurs in the system.
   
2. **Creational Pattern**: 
   - Factory Method for creating instances of different smart devices.
   
3. **Structural Pattern**: 
   - Proxy Pattern to control access to devices.

4. **OOP Principles**: 
   - Strong encapsulation, modularity, inheritance, and polymorphism.

---

### Inputs and Outputs:

**Possible Inputs**  
- Devices:  
  `[{id: 1, type: 'light', status: 'off'}, {id: 2, type: 'thermostat', temperature: 70}, {id: 3, type: 'door', status: 'locked'}]`  
- Commands:  
  `['turnOn(1)', 'setSchedule(2, "06:00", "Turn On")', 'addTrigger("temperature", ">", 75, "turnOff(1)")']`

**Possible Outputs**  
- **Status Report**:  
  `"Light 1 is On. Thermostat is set to 70 degrees. Door is Locked."`  
- **Scheduled Tasks**:  
  `"[{device: 2, time: '06:00', command: 'Turn On'}]"`  
- **Automated Triggers**:  
  `"[{condition: 'temperature > 75', action: 'turnOff(1)'}]"`

---

### Evaluation Criteria:

1. **Code Quality**:  
   - Follows best practices, SOLID principles, and effective use of design patterns.
2. **Functionality**:  
   - Meets all requirements, handles edge cases gracefully.
3. **Documentation**:  
   - Well-documented code with clear explanations of architecture and design decisions.
4. **Gold Standards**:  
   - Includes logging, error handling, and performance optimization.
5. **Code Walkthrough**:  
   - Ability to explain the solution, focusing on architecture, design, and patterns used.

---

### Here are the basic steps on how to open and navigate the project structure:

1. **Open the Project**:
   - Navigate to the project directory in your preferred IDE (e.g., IntelliJ, Eclipse).

2. **Locate the Source Files**:
   - Open the folder `src/main/java/org/example/`. This directory contains the source code for both Exercise 1 and Exercise 2.

3. **Exercise 1**:
   - Inside the `org/example/Exercise1` , locate the folder or file related to **Exercise 1**.

4. **Exercise 2**:
   - Inside the `org/example/Exercise2` , locate the folder or file related to **Exercise 2**.



