const express = require('express')
const router = express.Router();
const fs = require('fs');
const outputController = require('../controller/output')
// router.get('/outputs',outputController.getAllBook);

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

// router.get('/getDataByCountry/:country', (req, res) => {
//     const country = req.params.country;

//     fs.readFile("output.json", (err, data) => {
//         if (err) {
//             console.error(err);
//             res.status(500).send("Error reading data from file");
//         } else {
//             const jsonData = JSON.parse(data);
//             const filteredData = jsonData.filter((item) => item.country === country);
//             res.send(filteredData);
//         }
//     });
// });

router.post('/createUser',(req,res)=>{
    const data = JSON.stringify(req.body);
    fs.writeFile("output.json", data, (err) => {
        if (err) {
            console.error(err);
            res.status(500).send("Error writing data to file");
        } else {
            res.send("Data written to file successfully");
        }
    });
})

// router.post('/createUser',outputController.createOutput)

module.exports = router;