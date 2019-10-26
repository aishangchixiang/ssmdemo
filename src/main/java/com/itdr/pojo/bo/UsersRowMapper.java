package com.itdr.pojo.bo;

import com.itdr.pojo.Users;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersRowMapper implements org.springframework.jdbc.core.RowMapper<Users> {
    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {
        Users u=new Users();
        u.setId(resultSet.getInt("id"));
        u.setAge(resultSet.getInt("ages"));
        u.setUname(resultSet.getString("uname"));
        u.setPsd(resultSet.getString("psd"));
        u.setCdate(resultSet.getDate("cdate"));
        u.setMoney(resultSet.getDouble("money"));
        return u;
    }
}
