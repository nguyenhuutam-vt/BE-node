const express = require('express')
const app = express()
const port = 8000;
app.use(express.json());

const exercisesRouter = require('./routes/exercises')
app.use('/v1/', exercisesRouter);

app.listen(port, ()=>{
    console.log(`Express app listening on port ${port}`)
})