const express = require('express');
const router = express.Router();
const exercisesController = require('../controller/exercises')

 router.post('/sums', exercisesController.isSum);
 router.post('/primes', exercisesController.isPrime);
 router.post('/numberLargest', exercisesController.isLargestInArray);
 router.post('/reverse', exercisesController.reverseString);
 router.post('/palindrome', exercisesController.palindromeString);
 router.post('/countNumber', exercisesController.countOfTheNumber);
 router.post('/generateString', exercisesController.generateString);
 router.post('/fizzbuzz', exercisesController.fizzbuzz);
 router.post('/findIndex', exercisesController.findIndex);
 
module.exports = router;