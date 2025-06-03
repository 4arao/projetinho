/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.mysql;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
/**
*
* @author 1008007
*/
public class UsuarioDAO {
 

public boolean Cadastrar(String login, String senha) {
        try (Connection conn = Mysql.conectar()) {
            String sql = "INSERT INTO login (login, senha) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean autenticar(String login, String senha) {
        try (Connection conn = Mysql.conectar()) {
            String sql = "SELECT * FROM login WHERE login = ? AND senha = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }
    public List<String[]> listarUsuarios() {
        List<String[]> lista = new ArrayList<>();
        try (Connection conn = Mysql.conectar()) {
            String sql = "SELECT * FROM login";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{rs.getString("login"), rs.getString("senha")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    public boolean atualizarUsuario(String loginAntigo, String novoLogin, String novaSenha) {
        try (Connection conn = Mysql.conectar()) {
            String sql = "UPDATE login SET login = ?, senha = ? WHERE login = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, novoLogin);
            stmt.setString(2, novaSenha);
            stmt.setString(3, loginAntigo);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean deletar(String login) {
        try (Connection conn = Mysql.conectar()) {
            String sql = "DELETE FROM login WHERE login = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }   
 
   
}