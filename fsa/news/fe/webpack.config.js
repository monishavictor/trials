var config = {
   entry: {
      app: './main.js'
   },
   output: {
      path:'/',
      filename: 'index.js',
   },
   devServer: {
      inline: true,
      port: 8080
   },
   module: {
      rules: [{
         use: [{
            loader: 'babel-loader',
            query: {
               presets: ['es2015', 'react']
            }
         }]
      }]
   }
}
module.exports = config;