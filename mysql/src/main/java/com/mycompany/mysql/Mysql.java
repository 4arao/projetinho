/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mysql;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
/**
 *
 * @author 1008007
 */
public class Mysql {

        
 
public static Connection conectar() throws SQLException {

   

        String url = "jdbc:mysql://localhost:3306/db_mysql"; // nome do banco de dados

        String usuario = "root"; // seu usuário do MySQL

        String senha = "senac@2025"; // sua senha do MySQL
 
        return DriverManager.getConnection(url,usuario,senha);
    
}
        

    

}

 
    

