

const express = require('express');
const { monsters } = require('../data/database');
const router = express.Router();
const uniqueMiddleware = require("../validator/uniqueMiddleware");
//get all
router.get("/monsters", (req, res) => res.json(monsters));
//find
router.get("/monster/:name", (req, res, next) => {
    const { name } = req.params;

    /// Cách 1
    // for (const monster of monsters) {
    //     if (monster.name === name) {
    //         return res.json(monster);
    //     }
    // }
    // next(`Monster with name: ${name} does not exist`);

    /// Cách 2
    const monster = monsters.find(m => m.name === name);

    console.log(monster);

    if (!monster) { return next(`Monster with name: ${name} does not exist`); }

    res.json(monster);
});
//create

router.post("/monster", uniqueMiddleware(monsters), (req, res) => {
    const { name, attack, health } = req.body;
    monsters.push({
        name,
        attack,
        health,
        status: health > 0 ? 'alive' : 'death',
    });

    res.json(monsters);
});

router.delete("/monster/:name", (req, res, next) => {
    const { name } = req.params;

    const position = monsters.findIndex(m => m.name === name);

    if (position < 0) { return res.json(monsters); }

    monsters.splice(position, 1);

    res.json(monsters);
})
module.exports = router;
