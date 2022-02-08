import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

// global configuration of HTTP-Request for axios
const axios = require('axios')
axios.defaults.baseURL = 'http://192.168.178.48:9090'
axios.defaults.withCredentials = true
Vue.prototype.$axios = axios

Vue.config.productionTip = false

Vue.use(ElementUI, { size: 'small' })

new Vue({
  router,
  store,
  render: (h) => h(App)
}).$mount('#app')
