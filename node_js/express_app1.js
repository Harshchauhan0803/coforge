var express=require('express')
var app=express()
app.get("/",(req,resp)=>{
    resp.write("<h1>Hello Express Application </h1>")

});
app.get("/employee",(req,resp)=>{
    resp.json()

});

app.listen(1000)
console.log('express app running')

var employee={
    "eid":10001,
    "ename":"harsh chauhan",
    "district":"ballia",
    "state":"up",
    "country":"India"
}