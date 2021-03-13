<template>
  <div class="room">
    <div class="logo">
      <a href="#/">
        <img src="@/assets/img/logo.png" alt="logo">
        首页
      </a>
    </div>
    <div class="body" id="scrollId">
      <ul>
        <li v-for="data in chats">
          <div class="chatItem">
            <!--头像-->
            <div :class="data.role[0]">
              <img :src="data.headImg" alt="头像"
                   width="50px"/>
            </div>
            <div :class="data.role[1]">
              <!--头部信息-->
              <div :class="data.role[2]">
                <span v-text="data.username"></span> <span v-text="data.date">2021-02-28 21:10:07</span>
              </div>
              <!--消息-->
              <div :class="data.role[3]">
                <span v-text="data.content">妈耶，我来也！~</span>
              </div>
            </div>
          </div>
        </li>
      </ul>
    </div>
    <div class="footer">
      <textarea rows="6" placeholder="我也来说一句..." @click="clear" v-model="chatTemplate.content"></textarea>
      <div class="right">
        <a class="btn-submit" @click.prevent="clear"><div>清空</div></a>
        <a class="btn-submit" @click="send">发送</a>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Room",
  data(){
    return{
      ws: {},
      userId:'',
      date: '',
      chatTemplate: {content: '我也来说一句~'},
      chats: [
        // {username: '孤独的狼',date: '2021-02-28 21:13:47',headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',content: '欢迎进入聊天室',role: ['none','center','none','chatBody']},
        // {username: '孤独的狼',date: '2021-02-28 21:13:47',headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',content: '帅谈谈进入聊天室',role: ['none','center','none','chatBody']},
        // {username: '孤独的狼',date: '2021-02-28 21:10:07',headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847501&s=640',content: '妈耶！我也来~',role: ['headImg','test','userInfo','chatBody']},
        // {username: '帅谈谈',date: '2021-02-28 21:13:47',headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',content: '哥只是个传说',role: ['headImg right','right','userInfo messageRight','chatBody active right']}
        ]
    }
  },methods: {
    send(){
      //时间
      this.date =new Date().toLocaleString()
      // 聊天内容
      var chat = {username: this.userId,date: this.date,headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',content: this.chatTemplate.content,role: ['headImg right','right','userInfo messageRight','chatBody active right']}
      // this.chats.push(chat);
      // 发送聊天内容
      this.ws.send(JSON.stringify(chat))
      // 滚条在最下面
      document.getElementsByClassName('body')[0].scrollTop = document.getElementsByClassName('body')[0].scrollHeight;
      // 清空聊天输入框
      this.chatTemplate.content = "";
      },
    clear(){
      // 清空聊天框内容
      this.chatTemplate.content = "";
    }
  },
  mounted() {
    // console.log(this.$route.query)
    //清除电脑端中聊天室的logo
    let isPc = this.$route.query.pc;
    if (isPc==='1'){
      document.getElementsByClassName('logo')[0].style.display = 'none'
    }
    //滚动条滚到最下面
    document.getElementsByClassName('body')[0].scrollTop = document.getElementsByClassName('body')[0].scrollHeight;
    let userId = (Math.random()*10).toFixed(0)
    console.log(userId)
    this.userId = userId;
    // var ws = new WebSocket("ws://localhost:8081/websocket/"+userId);
    var ws = new WebSocket("ws://101.201.125.13:8081/websocket/"+userId);
    this.ws = ws;
    ws.onopen=res => {
      let a = {username: userId,date: '2021-02-28 21:13:47',headImg: 'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',content: userId+'进入聊天室',role: ['none','center','none','chatBody']}
      ws.send(JSON.stringify(a));
      // ws.close()
    };
    ws.onmessage = res =>{
      let chat = JSON.parse(res.data);
      console.log(chat.username)
      if (chat.username!==this.userId){
        console.log("chatId{},thisId{}",chat.userId,this.userId)
        chat = JSON.parse(res.data);
        if (chat.role[0]!=="none"){
          //role: ['headImg','test','userInfo','chatBody']
          chat.role[0] = "headImg";
          chat.role[1] = "test";
          chat.role[2] = "userInfo";
          chat.role[3] = "chatBody";
        }
      }
      this.chats.push(chat)

    };
  },
  updated() {
    document.getElementsByClassName('body')[0].scrollTop = document.getElementsByClassName('body')[0].scrollHeight;
  }
}
</script>

<style scoped>
*{
  margin: 0;
  padding: 0;
}
.logo{
  position: fixed;
  top: 2px;
  left: 2px;
  z-index: 999;
  display: none;
}
.none {
  display: none;
}
.center{
  margin-left: 40vw;
}
.body{
  height: 60vh;
  overflow:auto;
}
.room{
  background-color: #ecf0f3;
  color: #0d4e03;
}
ul{
  list-style: none;
}
li{
  /*display: block;*/
  margin-top: 10px;
  display: flex;
  justify-content: center;
}
span{
  margin-left: 10px;
}
img{
  border-radius: 50px;
  box-shadow:5px 5px 5px #2b2a2a;
}
textarea{
  width: 100vw;
  border: none;
  display: block;
  box-sizing: border-box;
  background-color: #ecf0f3;
  padding: 10px;
  cursor: url("https://gitee.com/Tab-Tan/CDN/raw/9e49252ef052c52f5bcbf1f77d804ba88ab5deb5/active.ico"),pointer;
  /*border-top: 1px #c6c4c4 solid;*/
  /*margin-bottom: 20px;*/
  resize: none;
  box-shadow: inset 0 3px 10px #cbced1, inset -8px -8px 15px white;
}
.footer{
  border: none;
  height: 40vh;
  position: fixed;
  background-color: #ecf0f3;
  bottom: 0;
}
.sysInfo{
  text-align: center;
  width: 150px;
  background-color: #e2e2e2;
  padding: 5px 10px;
  border-radius: 3px;
  box-shadow: 0 0 3px #9aac92;
}
.chatItem{
  width: 100vw;
  /*background-color: aquamarine;*/
  overflow: hidden;
}
.headImg{
  float: left;
  border: 1px #05b076 solid;
  border-radius: 50px;
  background-color: #c6c4c4;
  box-shadow: 5px 5px 15px #cbced1,-5px -5px 15px white;
}
.userInfo{
  color: #807e7e;
  position: relative;
}
.chatBody{
  margin: 15px 10px;
  padding: 10px;
  background-color:  #e2e2e2;
  display: inline-block;
  border-radius: 5px;
  box-shadow: 5px 5px 15px #cbced1,-5px -5px 15px white;
}
.right{
  float: right;
}
.active{
  color: #ffffff;
  background-color: #5FB878;
}
.messageRight{
  margin-right: 10px;
}
.btn-submit{
  display: inline-block;
  text-align: center;
  width: 80px;
  height: 20px;
  padding: 5px 0;
  border: 1px #c6c4c4 solid;
  background-color: #5FB878;
  border-radius: 5px;
  color: #fafafa;
}
.btn-submit:hover{
  color: #00f821;
  border-color: #05b076;
  transition: color 0.7s;
  box-shadow: 0 0 10px #2b2a2a;
}
@media screen and (max-width: 1400px) {
  div.logo{
    display: block;
  }
  img{
    box-shadow: none;
    border-left: 1px #c6c4c4 solid;
    width: 30px;
  }
  .logo a{
    display: inline-block;
    border: 1px #c6c4c4 solid;
    border-radius: 15px;
    box-sizing: border-box;
    padding-right: 10px;
    padding-top: -5px;
    box-shadow: 0 0 10px #dbdbd5,inset -2px -2px 5px #FFFFFF,inset 2px 2px 5px #c6c4c4;
  }
}
</style>
