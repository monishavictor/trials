var express = require('express');
var app = express();
var routes = require('./router'); 

 
app.listen(3000, function() {
  console.log("Listening on port 3000");
})

routes(app);