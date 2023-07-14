const express = require('express');
const router = express.Router();
const childrenController = require('../controller/children')

 router.get('/datas', childrenController.getAllData);
 router.get('/countrys', childrenController.getCountry);

module.exports = router;