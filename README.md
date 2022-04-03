# Seller-Department-System
JAVA project of a desktop application with a graphical interface using JavaFX and access to the MySQL database with JDBC (Java Database Connectivity)

### Sistema de Departamento de Vendedores
Projeto JAVA de uma aplicação desktop com interface gráfica utilizando JavaFX e acesso ao banco de dados MySQL com JDBC (Java Database Connectivity)


## Views

#### Main View

![image](https://user-images.githubusercontent.com/62666413/161444965-c2abef9b-d905-4214-93ab-f2ec6b70af2c.png)

#### Seller List
![image](https://user-images.githubusercontent.com/62666413/161445090-11504d40-2b61-4d79-a774-ec217eba4769.png)

#### Seller Form
![image](https://user-images.githubusercontent.com/62666413/161445167-3d44d4c4-fb9b-42a1-b454-f55ceb83dc8b.png)

#### Department List
![image](https://user-images.githubusercontent.com/62666413/161445209-6cda8303-351b-45cb-98e3-da84eed4610c.png)

#### Department Form
![image](https://user-images.githubusercontent.com/62666413/161445263-ff8ca9cd-e03d-4a28-ab7a-4a39dd49dedd.png)

#### About
![image](https://user-images.githubusercontent.com/62666413/161445298-59e6fdaf-66ea-45c2-9640-d8f510af517e.png)


## Class Diagram
![image](https://user-images.githubusercontent.com/62666413/161445603-677eeac3-6b9f-4663-8a8f-4698caf6259d.png)


## Getting Started

Here is a guideline to help you get started to write Java code in your computer.

### Pack files 
- JAR file

- db.properties

- MySQL Connector

- JavaFX SDK 

- Java SDK 

### Instalation

#### Checklist: 
- Install Java: https://www.oracle.com/technetwork/java/javase/downloads/index.html
  > Setup JAVA_HOME (ex: C:\Program Files\Java\jdk-11.0.3) 

- Copy JavaFX 
    > Setup PATH_TO_FX (ex: C:\java-libs\javafx-sdk\lib)

    > Place MySQL Connector in lib folder 

- Copy JAR & db.properties 
### Run app: 

#### Bat File (optional) 

> java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp Seller-Department-System.jar application.Main

#### Windows Shortcut (optional) 

Target: 
> "C:\Program Files\Java\jdk-11.0.3\bin\java.exe" --module-path %PATH_TO_FX% --add-modules 
javafx.controls,javafx.fxml -cp Seller-Department-System.jar application.Main 

Start in:
 
- C:\appfolder

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
