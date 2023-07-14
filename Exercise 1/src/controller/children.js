const fs = require("fs");
const data = require('../json/output.json');
const { error } = require("console");
function getAllData(req, res){
      // Cách 1:
      // console.log(data)
      // res.send(data)
      // Cách 2:
      let filePath = `${__dirname}\\..\\json\\output.json`;
      //console.log('pathhhhh: ', filePath);
        fs.readFile(filePath, "utf8", (err, jsonString) => {
        if (err) {
          console.log("File read failed:", err);
          return;
        }
        const listChildren = JSON.parse(jsonString);
        res.send(listChildren)
      });
}

function getCountry(req, res){
  // const filters = req.query;
  // const filteredChildren = data.filter(children => {
  //   let isValid = true;
  //   for (key in filters) {
  //     console.log(key, children[key], filters[key]);
  //     isValid = isValid && children[key] == filters[key];
  //   }
  //   return isValid;
  // });
  // console.log("dataaa", filteredChildren)
  // res.send(filteredChildren);
  const country = data.children;
  country.map(children => {
      const child = children.children
    child.map(child => {
        const count = child.children
        count.map(e => {
          const childrens = e.children; 
          console.log(JSON.stringify(childrens)) 
          res.send(childrens)
        })
    })
  })
}
module.exports = {
    getAllData,
    getCountry
}