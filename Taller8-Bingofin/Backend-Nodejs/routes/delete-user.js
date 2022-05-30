/**
 * librerias
 */
const express = require('express');
const router = express.Router();
/**
 * modelo
 */

const User = require('../models/user');

/**
 *  Borrar usuario
 */
router.delete('/:id', function (req, res, next) {
    /**
     * borrado fisico
     */
     User.findByIdAndDelete(req.params.id)
        .then(result => res.json(result))
         .catch(err => res.json(err));
    /**
     * borrado logico
     */
     // User.deleteById(req.params.id)
     // .then((result) => { res.json(result) })
     // .catch((err) => { res.json(err) });

});

module.exports = router;