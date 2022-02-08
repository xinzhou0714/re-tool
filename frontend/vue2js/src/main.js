import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// import UI-Framework: element-ui
import installElementUI from './plugins/element'
// import http-client plugin axios
import installAxios from './plugins/axios'

Vue.config.productionTip = false

// install customized plugins in dedicated js-file to make main.js more clean
installElementUI(Vue)
installAxios(Vue)

new Vue({
  router,
  store,
  render: (h) => h(App)
}).$mount('#app')
