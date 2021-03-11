import Vue from 'vue'
import Router from 'vue-router'

import Main from "@/components/Main";
import Article from "@/components/Article";
import Tags from "@/components/Tags";
import Room from "@/components/Room";
import Login from "../components/Login";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main
    },
    {
      path: '/article',
      name: 'Article',
      component: Article
    },
    {
      path: '/tags',
      name: 'Tags',
      component: Tags
    },
    {
      path: '/room',
      name: 'Room',
      component: Room
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    }
  ]
})
