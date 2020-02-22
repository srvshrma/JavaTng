const express = require("express");
const mysql = require("mysql");
const app = express();
const port = 2222;

const con = mysql.createConnection({
  host: "localhost",
  username: "root",
  password: "welcome"
});
con.connect(function(err) {
  if (err) {
    console.log(err.message);
  } else {
    console.log("successfully connected with mysql");
  }

  var createDatabase="create database node";
  con.query(createDatabase,(err,result)=>{
      if(err) {console.log(err.message)}
      console.log(result);
  })
});

app.get("/", (req, res) => {
  res.send("App running");
});
app.listen(port, (req, res) => {
  console.log("The port has been started on Port: " + port);
});
