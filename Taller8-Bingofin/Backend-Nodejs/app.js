const express = require('express');
const path = require('path');
const cookieParser = require('cookie-parser');
const logger = require('morgan');
const cors =require('cors')
const mongoose = require('mongoose');

/**
 * dirrecion
 */
const mongodb = 'mongodb://localhost/Bingo';
/**
 * conexion con la base de datos
 */
     mongoose.connect(mongodb, { useNewUrlParser: true, useUnifiedTopology: true })

/**
 * cuando todo e sta perfecto en consola que tenemos conexion
 */

        .then(() => console.log('MongoDB connected'))
/**
 * en caso de e rror muestreme que tenemos error
 */
        .catch(err => console.log(err));



const app = express();

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use(cors());
app.use('/', require('./routes/index'));
app.use('/users', require('./routes/users'));
app.use('/user', require('./routes/create-user'));

module.exports = app;

