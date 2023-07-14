function isSum(req, res) {
    const { x, y } = req.query;
    var sum = parseFloat(x) + parseFloat(y);
    return res.send("Sum of " + x + " and " + y + " is " + sum);
  }
  
  function isPrime(req, res) {
    const  number  = req.body.number;
    let flag = true;
    if (number === 1) {
      res.send("1 is neither prime nor composite number.");
    } else if (number > 1) {
      for (let i = 2; i < number; i++) {
        if (number % i == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        return res.send(`The number ${number} is a prime number`);
      } else {
        return res.send(`The number ${number} is a not prime number`);
      }
    } else {
      res.send("The number is not a prime number.");
    }
  }
  
  function isLargestInArray(req, res){
      const arr = req.body.array;
      let max= 0;
      arr.map(e => e > max ? max = e : max)
      res.send(`The number max in [${arr}] is ${max}`)
  }
  
  function reverseString(req, res){
      const { str } = req.query;
      const reverse = str.split(' ').reverse().join(" ");
      res.send(`Fisrt string is: ${str} \n Reverse String: ${reverse}`)
  }
  
  function palindromeString(req, res){
      const { str } = req.query;
      const palindrome = (str === str.split("").reverse().join("") ? "Is the Palindrome string" : "Not is the Palindrome string");
      res.send(`String ${str} is Palindrome? \n ` + palindrome);
  }
  
  function countOfTheNumber(req, res){
      const { str } = req.query;
      const { key } = req.query;
          let count = 0;
   
          for (let i = 0; i < str.length; i++)
          {
              // checking character in string
              if (str.charAt(i) == key)
              count++;
          }
      res.send(`String ${str} \n Count of the number in stringis: ${count}`);
      
  }
  
  function fizzbuzz(req, res) {
      const {num} = req.query;
      //Cách Google
      let x = "";
      if(num % 3 == 0){
          x+= 'Fizz';
      }
      else if(num % 5 == 0){
          x+= 'Buzz';
      }
      else{
          res.send('Empty')
      }
      res.send(x)
      
      //Cách Simple
      // if ( num % 3 == 0 && num % 5 == 0){
      //     res.send('FizzBuzz');
      // }
      // else if (num % 3 == 0){
      //     res.send('Fizz');
      // }
      // else if ( num % 5 == 0){
      //     res.send('Buzz');
      // }
      // else{
      //     res.send('Empty')
      // }
  }
  
  function findIndex(req, res){
      const { str, index } = req.query;
      //Cách 1:
      res.send(str[index-1]);
      //Cách 2:
      // const { str, index } = req.query;
      // var rs = str.charAt(index-1)
      // res.send(rs)
  }
  
  function generateString(req, res, ){
      const { length } = req.query;
      let result = '';
      const characters =
      'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const charactersLength = characters.length;
    for (let i = 0; i < length; i++) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    res.send(result)
  }
  
  module.exports = {
    isSum,
    isPrime,
    isLargestInArray,
    reverseString,
    palindromeString,
    countOfTheNumber,
    fizzbuzz,
    findIndex,
    generateString,
  };
  