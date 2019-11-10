package com.Dryft.DAOs;

import java.sql.*;
import com.Dryft.models.User;
import com.Dryft.utils.DBConn;
import com.Dryft.exceptions.UserSideException;

public class UserDAO {

    public static void createUser(User user) throws SQLException {
        conn = DBConn.getConn();
        checkUserAlreadyExists(user, conn);
        String query = "Insert into users values (?,?,?,?,?,?)";
        PreparedStatement st = conn.preparetatement(query);
        st.setString(6, user.getEmail(), user.getFullname(), user.getPassword(), user.getSalt(), user.getSex(),
                user.getBalance());
        ResultSet result = st.executeQuery();
        DBConn.closeConn();
    }

    private static void checkUserAlreadyExists(User user, DBconn conn) throws SQLException {
        String query = "Select email from users where email = (?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, user.getEmail());
        ResultSet result = st.executeQuery();
        if (result.next())
            throw new UserSideException(UserSideException.ErrorCode.EmailAlreadyExists);
    }

    private static void validateCredentials(String email, String password, DBConn conn) throws SQLException {
        String query = "Select email,password from users where email = (?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, user.getEmail());
        ResultSet result = st.executeQuery();
        if (result.next())
            if (!(result.getString("email") == email && result.getString("password") == password))
                throw new UserSideException(UserSideException.ErrorCode.InvalidCredentials);
            else
                throw new UserSideException(UserSideException.ErrorCode.UserNotFound);

    }

    public static User retrieveUserDetails(String email, String password, String salt) throws SQLException {
        conn = DBConn.getConn();
        validateCredentials(email, password, conn);
        String query = "Select fullname,sex,balance from users where email = (?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, user.getEmail());
        ResultSet result = st.executeQuery();
        result.next();
        String fullname = result.getString("fullname");
        char sex = result.getCharacterStream("sex");
        int balance = result.getInt("balance");
        User user = new User(fullname, email, password, salt, sex, balance);
        DBConn.closeConn();
        return user;
    }
}
