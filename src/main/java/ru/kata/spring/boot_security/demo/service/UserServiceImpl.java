//package ru.kata.spring.boot_security.demo.service;

//import ru.kata.spring.boot_security.demo.dao.UserDao;
//import ru.kata.spring.boot_security.demo.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
////import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;

//@Service
//public class UserServiceImpl implements UserService {

//    private final UserDao userDao;

//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Transactional
//    @Override
//    public List<User> getAllUsers() {
//        return userDao.getAllUsers();
//    }

//    @Transactional
//    @Override
//    public void saveUser(User user) {
//        userDao.saveUser(user);
//    }

//    @Transactional
//    @Override
//    public void delete(Long id) {
//        userDao.removeById(id);
//    }

//    @Transactional
//    @Override
//    public User getById(Long id) {
//        return userDao.findById(id);
//    }
//}
