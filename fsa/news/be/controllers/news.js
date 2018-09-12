'use strict';

const lib = require('../lib/helper');

const newsList = function(req, res) {
  lib.newsList(res);
}

module.exports = {
  newsList
};