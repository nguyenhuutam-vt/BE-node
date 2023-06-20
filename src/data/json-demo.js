const jsonData = require('./output.json')

// console.log(jsonData.class)

//duyet wa  tung phan tu 
const classes = jsonData.class
// for (let i = 0; i < classes.length; i++) {
//   console.log(`index: ${i} => class detail json ${JSON.stringify(classes[i])}`)
    
// }


//duyet cac field
for(const [key, value] of Object.entries(classes[0])){
    console.log(`key: ${key} ==> value: ${value}`)
}