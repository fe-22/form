package form.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import form.model.User;

public class UserDao {
    
    private Connection connection;
    
    public UserDao() {
        try {
            String url = "jdbc:mysql://localhost:3306/UserForm";
            String user = "root";
            String password = "161009";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void inserirUsuario(User usuario) {
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO usuarios (nome, data_nascimento) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getName());
            // Corrigindo a conversão da data
            Date dataNascimentoSql = Date.valueOf(usuario.getDateOfBirth());
            statement.setDate(2, dataNascimentoSql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Feche o PreparedStatement
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
