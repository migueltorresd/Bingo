var express = require('express');
var router = express.Router();

/* GET página de inicio. */
router.get('/', function(req, res, next) {
  res.json({
    message:'hola '
  });
});
module.exports = router;
