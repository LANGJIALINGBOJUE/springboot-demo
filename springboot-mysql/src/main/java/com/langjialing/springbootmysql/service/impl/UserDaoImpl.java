package com.langjialing.springbootmysql.service.impl;

import com.langjialing.springbootmysql.service.IUserDao;
import com.langjialing.springbootmysql.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * @author Administrator
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        String sql = "INSERT INTO user (name, age, password) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getPassword());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name = ?, age = ?, password = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getAge(), user.getPassword(), user.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User findById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserRowMapper());
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    }
}