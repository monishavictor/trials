'use strict';

const helloMethod = function(req, res) {
  res.send('Hello World');
}

module.exports = {
  helloMethod
};