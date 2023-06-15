const express = require('express');
const {  players } = require('../data/database');
const router = express.Router();
const uniqueMiddleware = require("../validator/uniqueMiddleware");
router.get("/players", (req, res) => res.json(players));

router.post("/player", uniqueMiddleware(players), (req, res) => {
    const { name, attack, health } = req.body;
    players.push({
        name,
        attack,
        health,
        status: health > 0 ? 'alive' : 'death',
    });

    res.json(players);
})
module.exports = router;