<template>
  <div class="dashboard">
    <!--左侧边栏-->
    <div class="sidebar" id="sidebar">
      <div class="sidebar-header">
        <img src="@/assets/img/logo.png" alt="logo" width="50px">
        <span v-text="title"></span>
      </div>
      <div class="sidebar-body">
        <div class="list">
          <ul>
            <li>
              <img src="@/assets/icons/文章.svg">
              <span>文章管理</span>
              <img id="0" src="@/assets/icons/下箭头.svg" @click="showLevel(0)">
              <div class="show">
                <ul>
                  <li>全部文章</li>
                  <li>文章分类</li>
                  <li>文章标签</li>
                </ul>
              </div>
            </li>
            <li>
              <img src="@/assets/icons/权限.svg">
              <span>权限管理</span>
              <img id="1" src="@/assets/icons/下箭头.svg" @click="showLevel(1)">
              <div class="show">
                <ul>
                  <li>角色管理</li>
                </ul>
              </div>
            </li>
            <li>
              <img src="@/assets/icons/登录.svg">
              <span>用户管理</span>
              <img id="2" src="@/assets/icons/下箭头.svg" @click="showLevel(2)">
              <div class="show">
                <ul>
                  <li>个人资料</li>
                  <li>用户列表</li>
                </ul>
              </div>
            </li>
            <li>
              <img src="@/assets/icons/网站管理.svg">
              <span>网站管理</span>
              <img id="3" src="@/assets/icons/下箭头.svg" @click="showLevel(3)">
              <div class="show">
                <ul>
                  <li>评论管理</li>
                  <li>文件管理</li>
                  <li>公告管理</li>
                  <li>日志管理</li>
                  <li>备案管理</li>
                  <li>友链管理</li>
                </ul>
              </div>
            </li>
            <li>
              <img src="@/assets/icons/聊天.svg">
              <span>聊天小屋</span>
              <img id="4" src="@/assets/icons/下箭头.svg" @click="showLevel(4)">
              <div class="show">
                <ul>
                  <li>聊天记录</li>
                  <li>缓存管理</li>
                </ul>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <!--收起-->
    <div class="sidebar-cs" id="sidebar-cs">
      <div class="sidebar-header-cs">
        <img src="@/assets/img/logo.png" alt="logo" width="50px">
      </div>
      <div class="sidebar-body-cs">
        <div class="list-cs">
          <ul>
            <li  @click="showLevel(0)">
              <img src="@/assets/icons/文章.svg">
              <span>文章</span>
            </li>
            <li @click="showLevel(1)">
              <img src="@/assets/icons/权限.svg">
              <span>权限</span>
            </li>
            <li @click="showLevel(2)">
              <img src="@/assets/icons/登录.svg">
              <span>用户</span>
            </li>
            <li @click="showLevel(3)">
              <img src="@/assets/icons/网站管理.svg">
              <span>网站</span>
            </li>
            <li @click="showLevel(4)">
              <img src="@/assets/icons/聊天.svg">
              <span>聊天</span>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <!--右边整体-->
    <div class="main">
      <!--头部导航栏-->
      <div class="header">
        <div class="header-context">
          <!--左边收起按钮-->
          <div id="close" @click="changeShow">
            <img src="@/assets/icons/收起.svg" alt="收起">
          </div>
          <div class="nav-right">
            <a href="#/">
              <div class="pre">
              <img src="@/assets/icons/页面.svg" alt="前台">
              <span>访问前台</span>
            </div>
            </a>
            <div class="info">
              <img :src="url" alt="头像">
              <span v-text="nikeName"></span>
              <img src="@/assets/icons/下箭头.svg" alt="展开">
            </div>
          </div>
        </div>
      </div>
      <div class="body">

      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Dashboard",
  data(){
    return{
      title: '博客后台',
      shows: [0,0,0,0,0],
      show: false,
      url: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',
      nikeName: 'TabTan'
    }
  },
  methods: {
    //显示二级标题，切换上下箭头
    showLevel(index){
      let sidebar = document.getElementById('sidebar');
      let sc = document.getElementById('sidebar-cs');
      if (this.show===true){
        sidebar.style.display = 'block';
        sc.style.display = 'none';
        this.show = false;
      }
      let element = document.getElementsByClassName('show').item(index);
      let img = document.getElementById(index);
      if(this.shows[index]%2===0){
        element.style.display = 'block';
        img.src = "https://cdn.jsdelivr.net/gh/Tab-tan/CDN@1.1.25/pic/上箭头.svg";
      }else {
        element.style.display = 'none';
        img.src = "https://cdn.jsdelivr.net/gh/Tab-tan/CDN@1.1.25/pic/下箭头.svg"
      }
      this.shows[index]++;
    },
    changeShow(){
      let sidebar = document.getElementById('sidebar');
      let sc = document.getElementById('sidebar-cs');
      if (this.show===true){
        sidebar.style.display = 'block';
        sc.style.display = 'none';
      }else {
        sidebar.style.display = 'none';
        sc.style.display = 'block';
      }
      this.show = !this.show;
    }
  }
}
</script>

<style scoped>
  .dashboard{
    background-color: #ecf0f3;
    /*background: rgba(255,255,255,.7);*/
    position: relative;
    /*padding: 10px;*/
  }
  /*左边侧边框*/
  .sidebar{
    display: block;
    width: 240px;
    float: left;
    margin: 0 10px;
    box-sizing: border-box;
    box-shadow: 2px 2px 5px #c6c4c4,-2px -2px 5px #fff;
  }
  .sidebar-cs{
    display: none;
    float: left;
    /*margin: 0 10px;*/
    /*background-color: #c6c4c4;*/
    box-sizing: border-box;
    box-shadow: 2px 2px 5px #c6c4c4,-2px -2px 5px #fff;
  }
  /*左边框的头部*/
  .sidebar .sidebar-header{
    box-sizing: border-box;
    margin: 20px 10px;
    box-shadow: inset 2px 2px 5px #c6c4c4,inset -2px -2px 5px #fff;
  }
  .sidebar-header-cs{
    box-sizing: border-box;
    margin: 20px 10px;
    box-shadow: inset 2px 2px 5px #c6c4c4,inset -2px -2px 5px #fff;
  }
  /*左边框的主体*/
  .sidebar .sidebar-body{
    box-sizing: border-box;
    margin: 10px;
  }
  .sidebar-body-cs{
    box-sizing: border-box;
    margin: 10px;
  }
  /*左边框列表*/
  .sidebar .sidebar-body .list ul{
    list-style: none;
  }
  /*左边框一级列栏目*/
  .sidebar .sidebar-body .list ul li{
    text-align: center;
    display: block;
    box-sizing: border-box;
    padding: 10px 0;
    border-radius: 10px;
    margin: 10px 0;
    box-shadow: 0 0 5px #acacac;
  }
  .sidebar .sidebar-body .list ul li:hover{
    box-shadow: 0 0 5px #353535;
    border-top: 5px #05b076 solid;
  }
  /*一级栏目标题*/
  .sidebar .sidebar-body .list ul li span{
    font-size: 20px;
    margin: 0 23px;
  }
  /*一级栏目里的小图标*/
  .sidebar .sidebar-body .list ul li img{
    width: 30px;
  }
  .list-cs li{
    text-align: center;
    box-sizing: border-box;
    box-shadow:inset 3px 3px 5px #c6c4c4,inset -3px -3px 5px #fff;
    margin: 10px 0;
    border-radius: 5px;
  }
  .list-cs li:hover{
    box-shadow: 0 0 5px #1E9FFF;
  }
  .list-cs img{
    display: block;
    height: 30px;
    margin: 0 auto;
    /*background-color: #c6c4c4;*/
  }
  /*二级标题*/
  .show{
    display: none;
  }
  /*logo*/
  .sidebar .sidebar-header img{
    float: left;
  }
  /*标题*/
  .sidebar .sidebar-header span{
    font-weight: bold;
    font-size: 40px;
  }
  /*右边整体*/
  .main{
    overflow: hidden;
    /*background-color: #c6c4c4;*/
    height: 200vh;
    box-sizing: border-box;
    box-shadow: 2px 2px 3px #c6c4c4,-2px -2px 5px #ffffff;
  }
  /*导航栏*/
  .header{
    /*background-color: #8a9fb0;*/
    margin: 20px 0;
  }
  /*导航栏内容*/
  .header-context{
    /*background-color: #d05252;*/
    height: 52px;
    box-sizing: border-box;
    margin: 10px;
    box-shadow: inset 2px 2px 5px #c6c4c4,inset -2px -2px 5px #fff;
  }
  /*收起按钮*/
  #close{
    box-sizing: border-box;
    /*background-color: #c6c4c4;*/
    width: 50px;
    /*padding: 3px;*/
    box-shadow: 0 0 5px #fff;
    float: left;
  }
  #close:hover{
    box-shadow: 0 0 5px #1E9FFF;
  }
  /*关闭图标*/
  #close img{
    /*background-color: #05b076;*/
    width: 45px;
    padding: 2px;
  }
  .nav-right{
    float: right;
    /*background-color: #c6c4c4;*/

  }
  .pre{
    display: inline-block;
    padding: 8px 8px;
    margin: 1px;
    box-sizing: border-box;
    box-shadow: 0 0 10px #fff;
  }
  .pre:hover{
    box-shadow: 0 0 5px #1E9FFF;
  }
  .pre img{
    width: 30px;
  }
  .info{
    box-shadow: 0 0 10px #fff;
    margin: 2px;
    display: inline-block;
  }
  .info:hover{
    box-shadow: 0 0 5px #1E9FFF;
  }
  .info img:first-child{
    width: 45px;
    border-radius: 5px;
  }
  .info img:last-child{
    width: 30px;
  }

</style>
