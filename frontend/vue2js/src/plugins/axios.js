import axios from 'axios'
/*
 * global configuration of HTTP-Request-Plugin: axios
 * */
export default (Vue) => {
  Vue.prototype.$axios = axios.create({
    baseURL: 'http://192.168.178.48:9090', // url = base url + request url
    withCredentials: true, // send cookies when cross-domain requests
    timeout: 5000 // request timeout
  })
}
