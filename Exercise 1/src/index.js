const express = require('express')
const app = express()
const port = 8000;
app.use(express.json());

const childrenRouter = require('./routes/children')
app.use('/v1/', childrenRouter);

app.listen(port, ()=>{
    console.log(`Express app listening on port ${port}`)
})