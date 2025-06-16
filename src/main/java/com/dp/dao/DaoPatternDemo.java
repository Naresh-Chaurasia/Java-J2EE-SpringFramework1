package com.dp.dao;

public class DaoPatternDemo {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        // Add users
        userDao.addUser(new User(1, "Alice"));
        userDao.addUser(new User(2, "Bob"));

        // Get all users
        for (User user : userDao.getAllUsers()) {
            System.out.println(user.getId() + ": " + user.getName());
        }

        // Update user
        User user = userDao.getUser(1);
        user.setName("Alice Smith");
        userDao.updateUser(user);

        // Delete user
        userDao.deleteUser(2);

        // Get all users after update and delete
        for (User u : userDao.getAllUsers()) {
            System.out.println(u.getId() + ": " + u.getName());
        }
    }

}
