package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAuthentication {
    private List<User> users;

    public UserAuthentication() {
        this.users = new ArrayList<>();
    }

    public static void main(String[] args) {
        UserAuthentication authentication = new UserAuthentication();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String studentname = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    authentication.registerUser(studentname, password);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    studentname = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    boolean loggedIn = authentication.loginStudent(studentname, password);
                    if (loggedIn) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Login failed. Invalid credentials.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void registerUser(String username, String password) {
        User newuser = new User(username, password);
        users.add(newuser);
        System.out.println("Student registered successfully.");
    }

    public boolean loginStudent(String studentname, String password) {
        for (User student : users) {
            if (student.getUsername().equals(studentname) && student.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}



