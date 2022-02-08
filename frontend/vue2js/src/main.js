import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// use UI-Framework: element-ui
import installElementUI from './plugins/element'

// global configuration of HTTP-Request for axios
const axios = require('axios')
axios.defaults.baseURL = 'http://192.168.178.48:9090'
axios.defaults.withCredentials = true
Vue.prototype.$axios = axios

Vue.config.productionTip = false
installElementUI(Vue)

new Vue({
  router,
  store,
  render: (h) => h(App)
}).$mount('#app')
