package com.bingo.dao;

import com.bingo.domain.Juego;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Se crea la interface GameDao que extiende de CrudRepository.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface IJuegoDao extends CrudRepository<Juego, Long> {

    /**
     * Update name.
     * @param id   el id
     * @param name el nombre
     */
    @Modifying
    @Query("update Juego gam set gam.name = :name where gam.id = :id")
    public void updateName (
            @Param(value = "id") Long id,
            @Param(value = "name") String name
    );
}
