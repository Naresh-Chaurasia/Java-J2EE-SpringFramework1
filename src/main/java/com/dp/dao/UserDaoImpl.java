package com.dp.dao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(u -> u.getId() == id);
    }
}
