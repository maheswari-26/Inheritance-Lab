# Hospital Employee Management System
This project is a simple hospital employee management system that allows the hospital to manage its employees, which include nurses, doctors, and surgeons. The system is implemented in Java and uses object-oriented programming concepts.

## Overview
## The system consists of four classes:

HospitalEmployee<BR>
Nurse<BR>
Doctor<BR>
Surgeon<BR>

The HospitalEmployee class is the base class for all other classes and contains the common attributes and methods of all hospital employees. The Nurse, Doctor, and Surgeon classes inherit from the HospitalEmployee class and contain attributes and methods specific to each type of employee.

## Class Hierarchy

HospitalEmployee
│   
├── Nurse
│    
├── Doctor
│    └── Surgeon
Class <BR>
## Descriptions
HospitalEmployee
The HospitalEmployee class is the base class for all other classes. It contains two attributes: name and number. It also contains a constructor, getters, setters, and a work() method.

## Nurse
The Nurse class extends the HospitalEmployee class and contains an additional attribute: numOfPatients. It also contains a constructor, getters, setters, a toString() method, and a work() method.

## Doctor
The Doctor class extends the HospitalEmployee class and contains an additional attribute: specialty. It also contains a constructor, getters, setters, a toString() method, and a work() method.

## Surgeon
The Surgeon class extends the Doctor class and contains an additional attribute: operating. It also contains a constructor, getters, setters, a toString() method, and a work() method.

## Usage
To use the system, simply create objects of the appropriate class and call the desired methods.

In the main() method of the Hospital class, four objects are created: a HospitalEmployee, a Nurse, a Doctor, and a Surgeon. The toString() and work() methods are then called on each object to display information about the employee and their current work status.

## Conclusion
This project provides a basic framework for managing hospital employees. It can be extended to include additional classes and functionality as needed.