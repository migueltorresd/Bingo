const express = require('express');
const router = express.Router();

const User = require('../models/user');

/* Crear nuevo usuario */
router.post('/', function (req, res, next) {
    /**
     * se crea objeto y se inserta informacion
     */
    const user = new User({
        name: req.body.name,
        email: req.body.email,
        usuario: req.body.usuario,
        password: req.body.password
    });

    user.save()
        .then((result) => { res.json(result) })
        .catch((err) => { res.json(err) });

});

module.exports = router;