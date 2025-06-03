/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysql;

import java.sql.Connection;

/**
 *
 * @author 1008007
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Connection con = Mysql.conectar();
            if (con != null) {
                System.out.println("Conexão realizada com sucesso!");
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
        }
    }
}
