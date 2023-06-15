
const express = require('express')
const router = express.Router();
const validation = require('./vaildate')
const userController = require('../Controller/user');

// router.post('/user',userController.checkUser, userController.createOutput)
const users = [];
router.post('/user',validation,(req,res,next)=>{
    users.push(req.body);
    res.send("Add user sucess");
})

module.exports = router;