package com.weirdstudio.service.impl;

import com.weirdstudio.mapper.UserMapper;
import com.weirdstudio.model.User;
import com.weirdstudio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getAll();
    }

    @Override
    public User findUserById(long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public void edit(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(long id) {
        userMapper.delete(id);
    }
}
