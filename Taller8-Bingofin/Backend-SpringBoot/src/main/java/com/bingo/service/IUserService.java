package com.bingo.service;

import com.bingo.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * Se crea la interface IUserService.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface IUserService {

    /**
     * List list.
     * @return the list
     */
    public List<User> list();

    /**
     * Save user.
     * @param user the user
     * @return the user
     */
    public User save(User user);

    /**
     * Update user.
     *
     * @param id   the id
     * @param user the user
     * @return the user
     */
    public User update(Long id, User user);

    /**
     * Delete.
     * @param user the user
     */
    public void delete(User user);

    /**
     * Buscar usuario opcional.
     * @param user the user
     * @return la opcion
     */
    public Optional<User> findUser(User user);
}
