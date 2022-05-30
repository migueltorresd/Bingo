package com.bingo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Se crea la el modelo de la entidad Game que implementa Serializable.
 * @version 1.00.000 2022-05-29
 * @author Miguel Angel Torres Diaz
 */
@Data
@Entity
@Table(name = "game")
public class Juego implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gam_id")
    private Long id;

    @Column(name = "gam_name")
    private String name;

}
