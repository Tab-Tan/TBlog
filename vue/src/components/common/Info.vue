<template>
    <!--主体左边-->
    <div class="left">
      <div class="context-body">
        <!--用户信息-->
        <div class="info">
          <img width="230" :src="qqNum" alt="头像">
          <div class="info-text">
            <div>
              <span>昵称:</span> <a href="">{{ nikeName }}</a>
            </div>
            <div>
              <span>码龄:</span> <a href="">{{ codeAge }}</a>
            </div>
            <div>
              <span>粉丝:</span> <a href="">{{ fansNum }}</a>
            </div>
            <div>
              <span>关注:</span> <a href="">{{ forksNum }}</a>
            </div>
            <div style="margin-top: 10px"><span><a href="">+加关注</a></span></div>
          </div>
        </div>
        <!--随笔分类-->
        <div class="classify">
          <div><h3>△ 随笔分类</h3></div>
          <div id="classifies">
            <ul>
              <a href="">
                <li v-for="classify in classifies">{{ classify.classify }}({{ classify.count }})</li>
              </a>
            </ul>
          </div>
        </div>
        <!--我的标签-->
        <div class="tags">
          <div><h3>△ 我的标签</h3></div>
          <div id="tags">
            <ul>
              <li v-for="tag in tags"><a href="#/tags">{{ tag }}</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: "Info",
  data(){
    return{
      qqNum: 'http://q1.qlogo.cn/g?b=qq&nk=1607847501&s=640',
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
      ],
      tags: ['java','vue','linux','javascript']
    }
  }
}
</script>

<style scoped>
  /*用户信息*/
  .left{
    margin-left: 50px;
    width: 245px;
    /*height: 100%;*/
    /*background-color: #ecf0f3;*/
    background: rgba(255,255,255,.6);
    box-sizing: border-box;
    box-shadow: 10px 10px 15px #dedcdc,-10px -10px 15px #ffffff;
  }
  .context-body{
    margin-left: 10px;
  }
  .info{
    text-align: left;
    margin-top: 10px;
  }
  .info img{
    border-radius: 6px;
  }
  .info-text{
    margin-top: 20px;
  }
  .info-text div{
    margin: 5px 0;
  }
  .info-text span{
    margin: 10px;
  }
  .info-text a{
    /*color: #d6d5d5;*/
  }
  .info-text a:hover{
    /*color: #7fffd4;*/
  }
  /*随笔分类*/
  .classify,.tags{
    text-align: left;
    margin-top: 30px;
    margin-left: 10px;
    /*color: #d6d5d5;*/
  }
  #classifies li{
    margin: 30px 0;
    /*color: #d6d5d5;*/
    display: block;
  }
  #classifies li:hover{
    /*color: #7fffd4;*/
    margin-left: 20px;
    transition: 0.7s;
  }
  #tags li{
    margin: 15px 20px;
    display: inline-block;
  }
  @media screen and (max-width: 1024px) {
    .left{
      display: none;
    }
  }
</style>
