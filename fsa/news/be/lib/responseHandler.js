'use strict';

const successHandler = function(resp, res) {
  res.send(resp);
}

const errorHandler = function(err, res) {
  res.send(err);
}

module.exports = {
  successHandler,
  errorHandler
};