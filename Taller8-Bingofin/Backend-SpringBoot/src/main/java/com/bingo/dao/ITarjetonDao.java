package com.bingo.dao;

import com.bingo.domain.User;
import com.bingo.domain.TarjetonV;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Se crea la interface ITarjetonDao que extiende de CrudRepository.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface ITarjetonDao extends CrudRepository<User, Long> {

    /**
     * Save.
     * @param id    el id
     * @param value el valor
     */
    @Modifying
    @Query("update TarjetonV valcar set valcar.value = :value where valcar.id = :id")
    public void save(
            @Param(value = "id") Long id,
            @Param(value = "value") String value
    );

    /**
     * Delete.
     * @param tarjetonV el valor del tarjeton
     */
    void delete(TarjetonV tarjetonV);
}
