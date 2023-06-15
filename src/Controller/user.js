function checkUser(req,res,next){
    const {username,password = ""} = req.body
    if(username.length > 20){
        next("Username less 20")
    }if(password.lentgh > 8){
        next("Password less 8")
    }
    next()
}

function createOutput(req,res){
    const {username, password} = req.body;
    res.send({
        username,
        password,
     
    })
}
module.exports={
    checkUser,
    createOutput
}