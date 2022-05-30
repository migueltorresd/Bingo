package com.bingo.controller;

import com.bingo.domain.Juego;
import com.bingo.service.JuegoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Se crea el Juego Controller.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 *
 */
@Slf4j
@RestController
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    /**
     * Se crea el Get del index.
     * @return dato de tipo Map con un String.
     *
     */
    @GetMapping(path = "/")
    public Map<String, String> index() {
        var respuesta = new HashMap<String, String>();
        respuesta.put("message", "Hola Mundo");
        return respuesta;
    }

    /**
     * Se crea el Get del index.
     * @return una lista con objetos de tipo Game.
     *
     */
    @GetMapping(path = "/games")
    public List<Juego> list() {
        var games = juegoService.list();
        return games;
    }

}
