<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>

export default {
  name: 'App',
  data(){
    return {

    }
  }
}
</script>

<style>
#app {
  /*color: #d6d5d5;*/
  /*color: #000000;*/
  /*background: #2b2a2a;*/
  font-family: Arvo,sans-serif;
  color: #737272;
  font-weight: bold;
  background: #ecf0f3;
}
*{
  margin: 0;
  padding: 0;
}
h3{
  font-weight: bold;
  color: #05b076;
}
body{
  cursor: url(https://gitee.com/Tab-Tan/CDN/raw/9e49252ef052c52f5bcbf1f77d804ba88ab5deb5/all.ico),default;
}
.right{
  float: right;
}
.left{
  float: left;
}
.ib{
  display: inline-block;
}
a{
  text-decoration: none;
  color: #056e16;

}
a:hover{
  color: #05b076;
  transition: .5s;
  cursor: url("https://gitee.com/Tab-Tan/CDN/raw/9e49252ef052c52f5bcbf1f77d804ba88ab5deb5/active.ico"),pointer;
}
.btn-simple{
  width: 90px;
  /*border: 1px #c6c4c4 solid;*/
  margin-top: 10px;
  text-align: left;
  padding: 4px 8px;
  border-radius: 4px;
  box-shadow: 5px 5px 5px #c6c4c4,-5px -5px 10px #FFFFFF,inset 8px 8px 8px #ffffff,inset -8px -8px 8px #ffffff;
}
.btn-simple:hover{
  /*border-color: #05b076;*/
  box-shadow: 5px 5px 3px #757575,-5px -5px 3px #FFFFFF;
  background-color: #bff5dd;
  transition: .2s;
}
.btn-submit{
  display: inline-block;
  text-align: center;
  width: 100px;
  height: 30px;
  border: 1px #c6c4c4 solid;
  background-color: #1E9FFF;
  margin-top: 10px;
  border-radius: 5px;
  /*color: #fafafa;*/
}
.btn-submit:hover{
  color: #00f821;
  border-color: #05b076;
  transition: color 0.7s;
  box-shadow: 0 0 10px #2b2a2a;
}
::-webkit-scrollbar{
  width: 8px;
  height: 2px;
  background-color: #101011;
}

/*定义滚动条轨道 内阴影+圆角*/
::-webkit-scrollbar-track {
  box-shadow: inset 0 0 6px rgb(15, 15, 16);
  -webkit-box-shadow: inset 0 0 6px rgb(15, 15, 16);
  border-radius: 10px;
  background-color: #123e17;
}

/*定义滑块 内阴影+圆角*/
::-webkit-scrollbar-thumb{
  border-radius: 10px;
  box-shadow: inset 0 0 6px rgb(23, 34, 88);
  -webkit-box-shadow: inset 0 0 6px rgb(23, 34, 88);
  background-color: #05b076;
}
div{
  border-radius: 5px;
}
.flex-center{
  width: 100%;
  display: flex;
  justify-content: center;
}
</style>
