<template>
  <!--评论-->
  <div class="comment">
    <!--已有评论-->
    <div class="comments-panel">
      <span>已有评论: {{comments.length}}条</span>
      <hr>
      <div class="comment-item" v-for="comment in comments">
        <img :src="comment.user.headImg" width="40px" alt="头像" />
        <div class="ib">
          <!--用户昵称-->
          <a href="javascript:;" v-text="comment.user.nikeName"></a>
          <!--回复按钮 和 时间-->
          <div class="comment-tools">
            <a href="javascript:;" class="btn-hf">回复</a>
            <span v-text="comment.date"></span>
          </div>
          <!--评论内容-->
          <div class="comment-content">
            <p v-text="comment.comment"></p>
          </div>
        </div>
      </div>
      <div class="comment-sub">
        <textarea rows="6" placeholder="请输入评论..." v-model="commentTemp.comment"></textarea>
        <a class="btn-simple" @click="sub">提交</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Comment",
  data(){
    return{
      comments: [
        {id: 1,date: new Date(Date.now()),user:{id:1,headImg:'http://q1.qlogo.cn/g?b=qq&nk=1607847510&s=640',nikeName: 'TabTan'},comment: '哇哦，残疾的我看完之后飞檐走壁!',reply: {}},
        {id: 1,date: new Date(Date.now()),user:{id:1,headImg:'http://q1.qlogo.cn/g?b=qq&nk=1607847501&s=640',nikeName: 'TabTan'},comment: '哇塞，我来占个楼！！！!'}
      ],
      commentTemp: {id: 1,date: new Date(Date.now()),user:{id:1,headImg:'http://q1.qlogo.cn/g?b=qq&nk=1607847501&s=640',nikeName: 'TabTan'},comment: '请输入评论~@^-^@~'}
    }
  },
  methods: {
    sub(){
      this.comments.push(this.commentTemp)
    }
  }
}
</script>

<style scoped>
  .comment{
    margin-top: 40px;
  }
  .comment-item{
    width: 960px;
    margin-left: 30px;
    border-bottom: 1px #757373 solid;
  }
  .comments-panel{
    background: rgba(255,255,255,.5);
    /*background-color: #ecf0f3;*/
    padding: 10px;
    margin-bottom: 40px;
    box-sizing: border-box;
    box-shadow: 8px 8px 15px #c6c4c4,-8px -8px 15px #FFFFFF;
  }
  .comment textarea{
    margin-top: 30px;
    width: 940px;
    /*border: 4px #05b076 solid;*/
    border: none;
    border-radius: 10px;
    padding: 20px;
    background-color: #ecf0f3;
    box-shadow: inset 10px 10px 15px #dbdbdb,inset -10px -10px 15px #FFFFFF;
    resize: none;
  }
  img{
    border-radius: 3px;
    margin: 6px;
    float: left;
  }
  .ib{
    margin: 4px;
  }
  .comment-tools{
    margin: 4px;
  }
  .comment-content{
    margin: 10px 4px;
  }
  p:hover{
    /*box-shadow: 1px 1px 2px #797a7c;*/
    -moz-box-shadow:2px 2px 5px #333333;
    -webkit-box-shadow:2px 2px 5px #333333;
    box-shadow:2px 2px 5px #333333;
    transition: box-shadow .3s;
    cursor: pointer;
  }
  .comment-sub a{
    width: 50px;
    margin: 5px;
    display: block;
    text-align: center;
    color: #8ad49a;
    border-color: #8ad49a;
  }
  .comment-sub a:hover{
    color: #05b076;
    border-color: #42b983;
    transition: 0.7s;
    cursor: pointer;
  }
  .btn-hf{
    width: 90px;
    border: 1px #c6c4c4 solid;
    margin-top: 10px;
    text-align: left;
    padding: 4px 8px;
    border-radius: 4px;
  }
  .btn-hf:hover{
    /*border-color: #05b076;*/
    background-color: #bff5dd;
    transition: .2s;
  }
  @media screen and (max-width: 1150px){
    div.comment{
      width: 100vw;
    }
    div.comment-item{
      width: 90vw;
      margin-left: 0;
      padding: 0;
      border-bottom: 1px #757373 solid;
    }
    div.comment textarea{
      margin-top: 30px;
      width: 90vw;
      /*border: 4px #05b076 solid;*/
      border: none;
      border-radius: 10px;
      padding: 20px;
      background-color: #ecf0f3;
      box-sizing: border-box;
      box-shadow: inset 10px 10px 15px #dbdbdb,inset -10px -10px 15px #FFFFFF;
      resize: none;
    }
  }
</style>
