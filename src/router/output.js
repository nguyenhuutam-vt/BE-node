const express = require('express')
const router = express.Router();
const country = require('../../output.json')
const fs = require('fs');

const outputController = require('../controller/output')


router.get('/getAll',(req,res)=>{
    fs.readFile("output.json",(err,data)=>{
        if(err){
            console.error(err);
            res.status(500).send("Error reading data from file");
        }
        else{
            const jsonData = JSON.parse(data);
            res.send(jsonData);
        }
    })
})

router.get('/getP',outputController.getAllBook)


// router.get('/country/:name',(req,res,next)=>{
//     const {name} = req.params;
//     const countryy = country.children.children.children.children.find(m=>m.country===name);
 

//     if (!countryy) { return next(`Monster with name: ${name} does not exist`); }

//     res.json(countryy);
// })

// router.post('/createUser',(req,res)=>{
//     const data = JSON.stringify(req.body);
//     fs.writeFile("output.json", data, (err) => {
//         if (err) {
//             console.error(err);
//             res.status(500).send("Error writing data to file");
//         } else {
//             res.send("Data written to file successfully");
//         }
//     });
// })



module.exports = router;