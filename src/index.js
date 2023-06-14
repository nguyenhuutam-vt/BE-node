

// app.listen(port,()=>{
//     console.log(`Home Work ${port}`)
// })

// // q2
// app.post('/api/writeToFile', (req, res) => {
//     const data = JSON.stringify(req.body);

//     fs.writeFile("output.json", data, (err) => {
//         if (err) {
//             console.error(err);
//             res.status(500).send("Error writing data to file");
//         } else {
//             res.send("Data written to file successfully");
//         }
//     });
// });

// app.get('/api/getAllData', (req, res) => {
//     fs.readFile("output.json", (err, data) => {
//         if (err) {
//             console.error(err);
//             res.status(500).send("Error reading data from file");
//         } else {
//             const jsonData = JSON.parse(data);
//             res.send(jsonData);
//         }
//     });
// });
// app.get('/api/getDataByCountry/:country', (req, res) => {
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


const express = require('express')
const app = express()
const port = 8000

app.get('/',(req,res)=>{
    res.send('HomeWork')
})


app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

const outputRouter = require('./router/output')
app.use('/v1/',outputRouter)