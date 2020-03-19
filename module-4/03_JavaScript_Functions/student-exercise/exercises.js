/**
 * 
 * This funciton determines what hemisphere is currently in summer by taking in
 * an integer month (1=January, 2=February...) and a day of the month then returns
 * a String defining which hemisphere of Earth is in summer.
 * 
 * @param {number} month 
 * @param {number} day 
 * @param {String} hemisphere 
 */
function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
  const isAdmitted = (gpa, satScore, recommendation=false)=>{
    if(gpa>=4.0 || satScore>=1300){
      return true;
    }
    else if((gpa>3.0 && recommendation==true)||(satScore>=1200&&recommendation==true)){
      return true;
    }
    else{
      return false;
    }
  }


/**
 * Write a function called useParameterToFilterArray so that it takes an anonymous
 * function and uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

const useParameterToFilterArray = (filterFunction) =>{
    return unfilteredArray.filter(filterFunction);
}

/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

 const makeNumber = (first, second) =>{
   let fullString = first.concat(second);
   const intToString = parseInt(fullString, 10);
   return intToString;
 }



/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

const addAll = (...num)=>{
  let sum=0;
  num.forEach(element => {
    sum+=element;
  });
  
  return sum;
}
/**
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 * 
 * @param {String[]} unHappyArray array of Strings to be made happy
 * @returns {String[]} array with happy in front
 * 
 */

 function makeHappy (word){
 return word.map((word)=>{
    return 'Happy ' + word;
  })

}


/** 
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into mailing addresses in the form of:
 *     streetNumber streetName streetType city state zip
 *@param {Object[]} address
 *@returns {String[]}
 * Use `map` and an anonymous function.
 */

 function getFullAddressesOfProperties(address){
   return address.map((address)=>{
  return `${address.streetNumber} ${address.streetName} ${address.streetType} ${address.city} ${address.state} ${address.zip}`})  
 }

/** 
 * Create and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It should work for strings and numbers.
 * @param {Number[]} array
 */

function findLargest(array){
  let largest=array[1];
  array.forEach(element => {
    if(element>largest){
      largest=element
    }
  });
  return largest;
}

/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
