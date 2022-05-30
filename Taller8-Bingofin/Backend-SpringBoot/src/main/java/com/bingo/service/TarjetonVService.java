package com.bingo.service;

import com.bingo.dao.ITarjetonDao;
import com.bingo.domain.TarjetonV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Se crea el servicio ValueCardService que implementa IValueCard.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
@Service
public class TarjetonVService implements ITarjetonV {

    @Autowired
    private ITarjetonDao ITarjetonDao;

    @Override
    public List<TarjetonV> list() {
        return null;
    }

    @Override
    @Transactional
    public TarjetonV save(TarjetonV tarjetonV) {
        return null;
    }

    @Override
    public void delete(TarjetonV tarjetonV) {
        ITarjetonDao.delete(tarjetonV);
    }

}
