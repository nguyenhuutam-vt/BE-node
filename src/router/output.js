const express = require('express')
const router = express.Router();
const outputController = require('../controller/output')
router.get('/outputs',outputController.getAllBook);

router.post('/createUser',outputController.createOutput)

module.exports = router;