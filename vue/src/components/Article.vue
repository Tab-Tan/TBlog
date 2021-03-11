<template>
  <div class="article">
    <!--头部导航栏弹性盒子-->
    <div class="header-context">
      <Header></Header>
    </div>
    <!--文章内容弹性盒子-->
    <div class="body-context-article">
      <!--文章内容-->
      <div class="article-context">
        <div class="article-title"><a href="javascript:;"><h3 v-text="article.title"></h3></a></div>
        <div class="article-body">
          {{article.digest}}
        </div>
      </div>
    </div>
    <!--声明弹性盒子-->
    <div class="body-context-declaration">
      <!--声明所有-->
      <div class="declaration">
        <div>
          作者: <span v-text="article.author"></span>
        </div>
        <div>
          出处: <a href="javascript:;"><span v-text="article.url"></span></a>
        </div>
        <div>
          版权: <span v-text="article.copyright"></span>
        </div>
      </div>
    </div>
    <!--评论弹性盒子-->
    <div class="comment-context">
      <!--评论组件-->
      <Comment></Comment>
    </div>
    <!--工具弹性盒子-->
    <div class="tools-context">
      <div class="tools">
        <a href="#/article" class="tools-pre"> <= 上一篇:<span v-text="article.preTitle"></span></a>
        <a href="#/article" class="tools-next"> 下一篇:<span v-text="article.nextTitle"></span> =></a>
      </div>
    </div>
    <!--页脚版权信息-->
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "./common/Header";
import Footer from "./common/Footer";
import Comment from "./common/Comment";
export default {
  name: "Article",
  components: {Comment, Footer, Header},
  data(){
    return {
      msg: '文章页面',
      article: { title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
            '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
            '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
            '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
          date: '2021-3-4 19:21',author: 'TabTan',readCount: 50,commentCount: 2,recommend: 1,url: 'http://localhost:8080/tblog/p/123132',
          copyright: '本文由TabTan所有，引用请注明出处.',preTitle: 'vue的生命周期',nextTitle:'vue路由'
      }
    }
  }
}
</script>

<style scoped>
  .article{

  }
  /*头部导航*/
  .header-context{
    margin-bottom: 100px;
  }
  .header-context,.body-context-article,.body-context-declaration,.comment-context,.tools-context{
    width: 100%;
    display: flex;
    justify-content: center;
  }
  /*文章内容*/
  .article-context{
    margin: 20px 0 50px 0;
    background-color: #ecf0f3;
    width: 1000px;
    text-align: left;
    box-sizing: border-box;
    padding: 10px;
    box-shadow: 10px 10px 15px #dedede,-10px -10px 15px #ffffff;
  }

  .declaration{
    width: 960px;
    text-align: left;
    background-color: #ecf0f3;
    color: #457e4a;
    border-left: 7px #05b076 solid;
    padding: 15px 20px;
    /*box-sizing: border-box;*/
    box-shadow: 10px 10px 15px #dbdbdb,-10px -10px 15px #FFFFFF;
  }
  a{
    color: #38d995;
  }
  a:hover{
    color: #30ea3a;
    transition: .3s;
  }
  .tools{
    width: 1000px;
    background-color: #ecf0f3;
  }
  .tools-pre{
    float: left;
  }
  .tools-next{
    float: right;
  }

</style>
