'use strict';
const dbUtil = require('./dbUtil');
const responseHandler = require('./responseHandler');
const _ = require('lodash');

const formatNews = _.curry((res, resp) => {
  let i = 0;
  let newsResponse = [];
  for(i = 0; i < resp.length; i++) {
    newsResponse = newsResponse.concat(resp[i].dataValues);
  }
  responseHandler.successHandler(newsResponse, res);
});

const errorHandler = _.curry((res, err) => {
  responseHandler.errorHandler(err, res);
});

const newsList = function(res) {
  dbUtil.getNews()
  .then(formatNews(res))
  .catch(errorHandler(res));
}

module.exports = {
  newsList
};