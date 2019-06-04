package sample;

import sample.Configs;
import sample.Const;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs {

    Connection dbConnection;

    public Connection getDbConnection() throws ClassCastException, SQLException, ClassNotFoundException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort +"/" +dbName + "?" + "autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");


        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(User user) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + "," + Const.USER_LASTNAME + "," +
                Const.USER_LOGIN + "," + Const.USER_PASSWORD + "," +
                Const.USER_GENDER + "," +
                "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFiersName());
            prSt.setString(2, user.getLastName());
            prSt.setString(3, user.getLogin());
            prSt.setString(4, user.getPassword());
            prSt.setString(5, user.getMale());

            prSt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }

}
