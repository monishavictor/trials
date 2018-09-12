'use strict';
module.exports = (sequelize, DataTypes) => {
  const news = sequelize.define('news', {
    description: DataTypes.STRING,
    url: DataTypes.STRING,
    publisher: DataTypes.STRING,
    website: DataTypes.STRING,
    sometype: DataTypes.STRING,
    someid: DataTypes.BIGINT
  }, {
    classMethods: {
      associate: function(models) {
      }
    }
  });
  return news;
};