import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/test',
    name: 'test',
    component: () =>
      import(/* webpackChunkName: "about" */ '../views/test/index')
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('@/views/login/index')
  }
]

const router = new VueRouter({
  routes
})

export default router
