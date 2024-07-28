# Password Generator Manual

## Overview

This project is a command-line-based password generator developed in Java. It generates random passwords of a specified length, includes all types of special and ASCII characters, and stores them in a text file along with the provided website name.

## Features

- **Random Password Generation**: Generates passwords with a mix of uppercase letters, lowercase letters, digits, and special characters.
- **Command-Line Input**: Accepts user input directly from the terminal.
- **File Storage**: Stores the generated passwords in a text file in the format `Website : password`.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.
- Command-line access to compile and run Java programs.

## Installation

1. **Clone the Repository** (if applicable):
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Compile the Java Files**:
    ```sh
    javac *.java
    ```

## Usage

To generate and store a password, use the following command:

```sh
java PasswordManager <length> <website>
```

- `<length>`: The length of the password to be generated (integer).
- `<website>`: The name of the website for which the password is being generated.

### Example

```sh
java PasswordManager 10 facebook.com
```

This command will generate a password of length 10 and store it in `passwords.txt` with the entry `facebook.com : <generated-password>`.

## File Format

The generated passwords are stored in `passwords.txt` in the following format:

```
<website> : <password>
```

### Example Entry

```
facebook.com : xYz!9a@3$Wb
```

## Error Handling

- **Invalid Length**: If the length provided is not a valid integer, an error message will be displayed.
- **Invalid Arguments**: If the wrong number of arguments is provided, a usage message will be displayed.
