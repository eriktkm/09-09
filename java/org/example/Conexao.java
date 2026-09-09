package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdb:mysql://localhost:3306/mural_recados"
            + "?userSSL=false"
            + "&allowPublicKeyRetrival=true"
            + "&serverTimezone-America/Sao_Paulo";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    public static Connection abrir() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
