const express = require('express');
const app = express();
const port=5000

app.get('/student',function(req,res){
    res.send('get all students')
})
app.get('/student/:id',function(req,res){
    let id=req.params.id;
    res.send('Student id : '+id);
})
app.post('/student',function(req,res){
    res.send('post student')
})
app.put('/student',function(req,res){
    res.send('put student')
})
app.delete('/student',function(req,res){
    res.send('delete student')
})
app.listen(port,function(){
    console.log('server is running at port: '+port)
})