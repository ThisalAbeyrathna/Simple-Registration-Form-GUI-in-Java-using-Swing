# Simple Registration Form GUI in Java (Swing)

This project is a **Simple Registration Form** built using **Java Swing**. It allows users to sign up by entering their details and later sign in using the registered credentials.

## Features
- User Registration with Name, Email, Gender, and Date of Birth
- Password Protection using JPasswordField
- Simple Login Verification
- Basic UI Design with Java Swing
- Checkbox for Human Verification (Dummy Implementation)

## Technologies Used
- Java
- Swing (JFrame, JTextField, JPasswordField, JLabel, JButton, JComboBox, JRadioButton, JOptionPane)

## Installation & Setup

### Prerequisites
Ensure you have **Java JDK** installed on your system. You can check your installation using:
```sh
java -version
```

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/yourusername/Simple-Registration-Form-GUI-Java.git
   ```
2. **Navigate to the Project Directory**
   ```sh
   cd Simple-Registration-Form-GUI-Java
   ```
3. **Compile the Java Program**
   ```sh
   javac RegForm.java
   ```
4. **Run the Application**
   ```sh
   java RegForm
   ```

## Project Structure
```
📂 Simple-Registration-Form-GUI-Java
 ├── 📄 RegForm.java  # Main Java file containing GUI logic
 ├── 📄 README.md      # Project Documentation
 ├── 📄 .gitignore     # Git ignore file (optional)
```

## How It Works
1. **Sign Up:** Users enter their details, including Name, Email, Gender, Date of Birth, and Password.
2. **Sign In:** After successful registration, users can log in using their email and password.
3. **Validation:** If the email and password match the stored credentials, a success message appears. Otherwise, an error message is shown.

## Screenshots (Optional)
_Add screenshots here if needed._

## Future Enhancements
- Save user data in a database instead of an array.
- Add email format validation.
- Implement password hashing for security.

## Contributing
Pull requests are welcome. Feel free to fork the repository and improve the project.

## License
This project is open-source and available under the **MIT License**.

## Author
[Thisal Abeyrathna](https://github.com/yourusername)

