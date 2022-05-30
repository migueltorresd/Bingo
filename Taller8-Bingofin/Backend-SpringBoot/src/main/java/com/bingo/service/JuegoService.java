package com.bingo.service;

import com.bingo.dao.IJuegoDao;
import com.bingo.domain.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Se crea el servicio GameService que implementa IGameService.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
@Service
public class JuegoService implements IJuegoService {

    @Autowired
    private IJuegoDao IJuegoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Juego> list() {
        List<Juego> games;
        try {
            games = (List<Juego>) IJuegoDao.findAll();
        } catch (Exception exc) {
            throw exc;
        }
        return games;
    }

    @Override
    public Juego save(Juego game) {
        return IJuegoDao.save(game);
    }

    @Override
    public void delete(Juego game) {
        IJuegoDao.delete(game);
    }

    @Override
    public Optional<Juego> findGame(Juego game) {
        return IJuegoDao.findById(game.getId());
    }

}
