package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }

    @Transactional
    @Override
    public User showUser(Integer id){
        return userDao.showUser(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(Integer id, User updatedUser) {
        userDao.updateUser(id, updatedUser);
    }

    @Transactional
    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }
}
