// var x=10
// var y=20
// console.log('no1 is '+x)
// console.log('no2 is '+y)
// console.log('sum is '+(x+y))

// ar=[11,2,3,1,4,66]
// ar.forEach(element=>{
//     console.log(element)
// });
const express = require('express')
const app = express()

app.get('/', function (req, res) {
  res.send('Hello World')
})

app.listen(3000)