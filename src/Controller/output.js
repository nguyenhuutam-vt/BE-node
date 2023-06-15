const fs = require('fs');

function getAllBook(req,res){
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
}


function createOutput(req,res){
    const {username, password, age} = req.body;
    res.send({
        username,
        password,
     
    })
}
module.exports={
    getAllBook,
    createOutput
}