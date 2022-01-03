package database;

import java.sql.*;

public class DbConnection {

    Connection con;
    Statement st;
    ResultSet rows;
    int val;

    public DbConnection() {
        //register the driver class
        try {
            String username= "root";
            String password ="kiran123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bhatbhateni?characterEncoding=utf8&useSSL=false&autoReconnect=true", username,password);
            if (con != null) {
                System.out.println("Connected to BhatBhateni Database");
            }else{
                System.out.println("Error connecting Database");
            }

            //creating statement object
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Prepared Statement
    public int insertData(PreparedStatement ps) {
        try {
            val = ps.executeUpdate();
             // con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }

    // Simple query
    public int insert(String query) {
      
        try {
            val = st.executeUpdate(query);
             // con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }

    public ResultSet select(String query) {
        try {
            rows = st.executeQuery(query);
            // con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    // public static void main(String[] args) {
    //     new DbConnection();
    // }
}
