package com.bingo.service;

import com.bingo.domain.TarjetonV;

import java.util.List;

/**
 * Se crea la interface IValueCard.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
public interface ITarjetonV {

    /**
     * List list.
     * @return list
     */
    public List<TarjetonV> list();

    /**
     * Save TarjetonV.
     * @param tarjetonV
     * @return tarjetonV
     */
    public TarjetonV save(TarjetonV tarjetonV);

    /**
     * Delete.
     * @param tarjetonV
     */
    public void delete(TarjetonV tarjetonV);
}
