;(function () {
  const path = require('path')

  config.resolve.modules.unshift(
    path.resolve(__dirname, '../../../../src/main/resources')
  )
})()
