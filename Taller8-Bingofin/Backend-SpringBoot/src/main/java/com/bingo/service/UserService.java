package com.bingo.service;

import com.bingo.dao.IUserDao;
import com.bingo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Se crea el servicio UserService que implementa IUserService.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao IUserDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> list() {
        List<User> users = null;
        try {
            users = (List<User>) IUserDao.findAll();
        } catch (Exception exc) {
            throw exc;
        }
        return users;
    }

    @Override
    @Transactional
    public User save(User user) {
        return IUserDao.save(user);
    }

    @Override
    @Transactional
    public User update(Long id, User user) {
        user.setId(id);
        return IUserDao.save(user);
    }

    /**
     * Actualizar el nombre de usuario.
     * @param id   the id
     * @param user el usuario
     */
    @Transactional
    public void updateUsername(Long id, User user) {
        IUserDao.updateUsername(id, user.getUsername());
    }

    @Override
    @Transactional
    public void delete(User user) {
        IUserDao.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findUser(User user) {
        return IUserDao.findById(user.getId());
    }

}
