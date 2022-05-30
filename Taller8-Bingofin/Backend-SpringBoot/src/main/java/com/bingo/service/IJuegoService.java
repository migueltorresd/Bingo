package com.bingo.service;

import com.bingo.domain.Juego;

import java.util.List;
import java.util.Optional;

/**
 * Se crea la interface IGameService.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface IJuegoService {

    /**
     * List list.
     * @return la list
     */
    public List<Juego> list();

    /**
     * Save game.
     * @param game the game
     * @return the game
     */
    public Juego save(Juego game);

    /**
     * Delete.
     * @param game the game
     */
    public void delete(Juego game);

    /**
     * Encontrar el juego es opcional.
     * @param game the game
     * @return la opción
     */
    public Optional<Juego> findGame(Juego game);
}
