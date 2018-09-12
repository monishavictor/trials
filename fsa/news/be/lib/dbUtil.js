var models = require('../models/index');

const getNews = function() {
  return models.news.findAll({
    attributes: ['id', 'description', 'url', 'publisher', 'website']
  })
}

module.exports = {
  getNews
}
