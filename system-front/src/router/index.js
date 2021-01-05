import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

import Home from '../views/Home.vue'
import ContractList from '../views/contract/ContractList.vue'
import ContractCreate from '../views/contract/ContractCreate.vue'
import GoodsList from '../views/goods/GoodsList.vue'
import GoodsCreate from '../views/goods/GoodsCreate.vue'


const routes = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'Home',
    component: Home,
    redirect: '/home/contract-list',
    children: [
      {
        path: 'contract-list',
        component: ContractList
      },
      {
        path: 'contract-create' ,
        component: ContractCreate
      },
      {
        path: 'goods-list',
        component: GoodsList
      },
      {
        path: 'goods-create',
        component: GoodsCreate
      },
    ]
  }
]

const router = new VueRouter({
  mode: 'hash',
  base: process.env.BASE_URL,
  routes
})

export default router
