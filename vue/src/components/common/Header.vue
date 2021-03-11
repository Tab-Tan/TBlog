<template>
  <!--头部导航-->
  <div class="header-center">
    <!--导航-->
    <div class="header">
      <div class="nikeName left"><span> {{ nikeName }}</span></div>
      <div class="right">
        <ul>
          <a href="#/"><li class="li-h">首页</li></a>
          <li id="link" class="li-h">
            常用
            <ul>
              <li v-for="link in links" class="li-h">{{ link }}</li>
            </ul>
          </li>
          <a href=""><li class="li-h">新随笔</li></a>
          <a href="" @click.prevent="login"><li class="li-h">登录</li></a>
          <a href="" @mouseover.prevent="roomTip" @click.prevent="roomIn" id="h-room"><li class="li-h">聊天室</li></a>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>

import axios from "axios";
export default {
  name: "Header",
  data(){
    return{
      nikeName: "TBlog",
      links: ['github','码云'],
      codeAge: '1年6个月',
      fansNum: 9,
      forksNum: 5,
      classifies: [
        {classify:'Linux',count: 14},
        {classify:'java基础',count: 20},
        {classify:'设计模式',count: 23},
        {classify:'虚拟机',count: 11},
        {classify:'spring全家桶',count: 44}
      ]
    }
  },methods:{
    login(){
      this.$router.push({name:"Login"})
    },
    roomTip(){
      layer.tips('进来聊天呀', '#h-room', {
        tips: [2, '#35a058']
      });
    },
    roomIn(){
      layer.open({
        type: 2,
        title: '聊天室',
        area: ['693px','510px']
        ,offset: 'rt' //具体配置参考：offset参数项
        ,content: '#/room'
        ,btnAlign: 'c' //按钮居中
        ,shade: 0 //不显示遮罩
        ,yes: function(){
          layer.closeAll();
        }
      });
    }
  }
}
</script>

<style scoped>
/*头部居中弹性盒子*/
.header-center{
  display: flex;
  justify-content: center;
  position: fixed;
}
/*头部盒子*/
.header{
  width: 1000px;
  height: 76px;
  margin-bottom: 10px;
  background-color: #ecf0f3;
  /*border-bottom: 1px #6a6b6a solid;*/
  box-shadow: 10px 10px 15px #dedede,-10px -10px 15px #ffffff;
}
ul{
  list-style: none;
}

.li-h{
  color: #056e16;
  margin-right: 30px;
  display: inline-block;
  font-size: 17px;
  padding: 19px 16px;
}
.li-h:hover{
  /*color: #046e18;*/
  /*border-bottom: 10px #046e18 solid;*/
  box-sizing: border-box;
  border-radius: 5px;
  box-shadow: 8px 8px 4px #d9d9d9,-8px -8px 4px #ffffff;
  /*border-bottom-left-radius: 10px;*/
  /*border-bottom-right-radius: 10px;*/
  transition: .3s;
}

.nikeName{
  /*border: 1px red solid;*/
  color: #05b076;
  width: 100px;
  font-size: 45px;
  display: inline-block;
  margin: 10px 0;
}
.nikeName:hover{
  color: #b8d749;
  transition: 1s;
}
#link{
  cursor: url("https://gitee.com/Tab-Tan/CDN/raw/9e49252ef052c52f5bcbf1f77d804ba88ab5deb5/active.ico"),pointer;
  position: relative;

}
#link ul{
  z-index: 1000;
  border: 1px #c6c4c4 solid;
  position: absolute;
  width: 100px;
  left: -1px;
  /*background-color: #303030;*/
  margin-top: 20px;
  background-color: #ecf0f3;
  /*border-bottom: 1px #6a6b6a solid;*/
  box-shadow: 10px 10px 15px #dedcdc,-10px -10px 15px #ffffff;
  display: none;
}
#link:hover ul{
  display: block;
  transition: color 1s;
}
#link ul li{
  transition: 0.7s;
}
</style>
