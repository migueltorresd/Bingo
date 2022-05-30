package com.bingo.dao;

import com.bingo.domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Se crea la interface UserDao que extiende de CrudRepository.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface IUserDao extends CrudRepository<User, Long> {

    /**
     * Update username.
     * @param id   el id
     * @param name el nombre
     */
    @Modifying
    @Query("update User use set use.username = :username where use.id = :id")
    public void updateUsername(
            @Param(value = "id") Long id,
            @Param(value = "username") String name
    );

}
