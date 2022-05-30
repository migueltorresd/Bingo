const mongoose = require('mongoose');
/**
 * es quema de conexion de base de datos
 */
const Schema =mongoose.Schema;

/**
 * se crear esquema
 */
const userSchema = new Schema({
    name: {
        type: String,
        trim: true, // borra de espacios en blanco
        required: [true, 'El nombre del usuario es requerido']
    },
    email: {
        type: String,
        required: [true, 'El correo del usuario es requerido']
    },
    usuario: {
        type: String,
        required: [true, 'El Usuario es requerido'],
    },
    password: {
        type: String,
        required: [true, 'la contraseña es requerido'],
    },
    createdAt: {
        type: Date,
        default: Date.now
    } 
},{timetamps: true});

/**
 * cuando se necesite exportar a otro archivo
 */

module.exports = User = mongoose.model('User',userSchema);