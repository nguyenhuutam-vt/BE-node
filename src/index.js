

const express = require('express')
const app = express()
const port = 8000
app.use(express.json())
app.use(express.urlencoded({extended:true}))
const country = require('../output.json')
const playerRoute = require("./monster/monster");
const monster = require("./monster/player");
app.get('/',(req,res)=>{
    res.send('HomeWork')
})



app.use(playerRoute);
app.use(monster)



app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

const outputRouter = require('./router/output')
app.use('/v1/',outputRouter)


const userMiddle = require('./Middleware/user')
const { players, monsters } = require('./data/database')
app.use('/v1/',userMiddle)


app.put('/attack', (req, res) => {
    const { player, monster } = req.body;

    const pIndex = players.findIndex(p => p.name === player);
    const mIndex = monsters.findIndex(m => m.name === monster);

    const p = players[pIndex];
    const m = monsters[mIndex];

    p.health = p.health - m.attack;
    m.health = m.health - p.attack;

    if (m.health <= 0) {
        m.health = 0;
        m.status = 'death';
    }

    if (p.health <= 0) {
        p.health = 0;
        p.status = 'death';
    }

    // Update lại mảng
    players[pIndex] = p;
    monsters[mIndex] = m;

    
    res.json({
        player: p,
        monster: m,
    });
})

app.use('/country',(req,res)=>{
    const classes = country.children
    // for (let i = 0; i < classes.length; i++) {
    //     const children = classes.children
    //     for (let y = 0; y< children.length; y++){
    //         res.send(JSON.stringify(children[y]))
    //     }
     
    // }
    classes.map((chil)=>{
        const child = chil.children
        child.map((child1)=>{
          res.send(child1)
        })
    })
})

// const monster = require("./monster/monster")
// app.use(monster)

