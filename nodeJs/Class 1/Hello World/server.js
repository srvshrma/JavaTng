const http = require("http");

http
  .createServer(function(req, res) {
    //res.setHeader('200',{'Content-type':'text/plain'})   // shows plain text on page source
    res.setHeader("200", { "Content-type": "text/html" }); // shows html code on page source
    res.end("<h1>Hey there!!</h1>");
  })
  .listen(5000);

console.log("server is running at 5000");
