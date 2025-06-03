/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysql;

/**
 *
 * @author 1008007
 */
public class Usuario {
  private String login;
private String senha;

    public String getLogin() {
        return login;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public Usuario (){
    }
    

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
