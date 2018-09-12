'use strict';

const hello = require('./controllers/hello');
const news = require('./controllers/news');

module.exports = function(app) {
  app.get('/', hello.helloMethod);

  app.get('/news', news.newsList);
};