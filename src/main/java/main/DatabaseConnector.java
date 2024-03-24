/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.*;
import java.util.ArrayList;
//Class.forName("com.mysql.cj.jdbc.Driver");

/**
 * Database Connector class for interacting with database
 * @author akshatr
 */
public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/Lab6?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */
   public static void addUser(User user) {
        String query = "INSERT INTO USER (firstName, lastName, age) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setInt(3, user.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        String query = "SELECT * FROM USER";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setFirstName(rs.getString("firstName"));
                u.setLastName(rs.getString("lastName"));
                u.setAge(rs.getInt("age"));
                users.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
    public static void deleteUser(User u) {
        String query = "delete from USER where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
 public static void editUser(User oldUser, User newUser) {
        String query = "UPDATE USER SET firstName=?, lastName=?, age=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newUser.getFirstName());
            stmt.setString(2, newUser.getLastName());
            stmt.setInt(3, newUser.getAge());
            stmt.setInt(4, oldUser.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
