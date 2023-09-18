/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author minnie
 */
public class DeleteDatabase1 {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:sqlite.dcoffee.db";
        //Connection database
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been establish.");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return;
        }
         //insert
        String sql = "DELETE FROM category WHERE category_id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 7);
            stmt.setInt(2, 1);
            

            int status =  stmt.executeUpdate();
//            ResultSet key = stmt.getGeneratedKeys();
//            key.next();
//            System.out.println("" + key.getInt(1));

           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        //Close Database
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }

}
