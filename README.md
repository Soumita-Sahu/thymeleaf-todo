
# Todo List Application

## Overview
This is a simple yet functional Todo List web application developed using Spring Boot and Thymeleaf. The application demonstrates the use of the Model-View-Controller (MVC) pattern to dynamically render web pages with server-side data binding. Users can view a list of tasks with details such as title, description, and completion status.

## Features
- Displays a list of Todo items in a styled HTML table.
- Clearly distinguishes completed and pending tasks using color coding.
- Utilizes Thymeleaf templating engine for seamless integration of Java objects into HTML views.
- Responsive and clean UI design with basic CSS styling placed in the static resources folder.

## Technologies Used
- Java 23
- Spring Boot 3.5.0
- Thymeleaf 3.1.3
- Maven for dependency management
- HTML5 and CSS3 for frontend styling

## Getting Started

### Prerequisites
- JDK 23 or above installed
- Maven installed
- An IDE like IntelliJ IDEA or Eclipse

### Running the Application
1. Clone this repository:
```

git clone <repository-url>

```
2. Navigate to the project directory:
```

cd <project-directory>

```
3. Build and run the Spring Boot application using Maven:
```

mvn spring-boot\:run

```
4. Open your browser and visit:
```

[http://localhost:8080/](http://localhost:8080/)

```
You will see the Todo List displayed with proper styling.

## Project Structure
- `src/main/java/com/example` - Contains the Java source code including the Controller and Entity classes.
- `src/main/resources/templates` - Contains Thymeleaf HTML templates.
- `src/main/resources/static` - Contains CSS files for styling the UI.

## Screenshots
![Todo List Screenshot](https://github.com/user-attachments/assets/670ebd32-66eb-4de8-9402-eefecbd14c3a)




