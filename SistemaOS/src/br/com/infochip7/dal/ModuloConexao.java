package br.com.infochip7.dal;

import java.sql.*;

public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/sistemaos?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "250910";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
}
