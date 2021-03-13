<template>
  <!--文章预览-->
  <div class="articles">
    <div class="article" v-for="article in articles">
      <div class="articles-title"><a href="#/article" v-text="article.title"></a></div>
      <div class="articles-context">
        <p>
          摘要:<span v-text="article.digest"></span>
        </p>
      </div>
      <div class="article-btn"><a href="#/article">阅读全文 >></a> </div>
      <div class="articles-foot">posted @ {{article.date}} {{ article.nikeName }} 阅读({{article.readCount}}) 评论({{ article.commentCount }}) 推荐({{ article.recommend }})</div>
    </div>
    <PageHelper></PageHelper>
  </div>
</template>

<script>
import PageHelper from "../common/PageHelper";
export default {
name: "articles",
  components: {PageHelper},
  data(){
   return {
     articles: [
       {title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
         date: '2021-3-4 19:21',author: 'nikeName',readCount: 50,commentCount: 2,recommend: 1
       },
       {title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
         date: '2021-3-4 19:21',author: 'nikeName',readCount: 50,commentCount: 2,recommend: 1
       },
       {title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
         date: '2021-3-4 19:21',author: 'nikeName',readCount: 50,commentCount: 2,recommend: 1
       },
       {title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
         date: '2021-3-4 19:21',author: 'nikeName',readCount: 50,commentCount: 2,recommend: 1
       },
       {title:'vue的组件开发',digest: '组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。\n' +
           '                  组件（Component）是 Vue.js 最强大的功能之一。组件（Component）是 Vue.js 最强大的功能之一。',
         date: '2021-3-4 19:21',author: 'nikeName',readCount: 50,commentCount: 2,recommend: 1
       }
     ]
  }
  }
}
</script>

<style scoped>
  .articles{
    margin-right: 50px;
    float: right;
    width: 700px;
    display: block;
    /*border: 1px #05b076 solid;*/
    box-shadow: 10px 10px 15px #dedcdc,-10px -10px 15px #ffffff;
    background: rgba(255,255,255,.5);
  }
  /*文章*/
  p{
    /*color: #d6d5d5;*/
  }
  /*文章*/
  .article{
    width: 670px;
    float: right;
    padding: 10px;
    border-bottom: 1px #6a6b6a solid;
  }
  .article .articles-title{
    text-align: left;
    margin-bottom: 10px;
  }
  .article .articles-title:hover{
    color: #05b076;
    transition: 0.7s;
    cursor: pointer;
  }
  .article .articles-context{
    text-align: left;
  }
  .article .articles-foot{
    text-align: right;
  }
  .article .article-btn{
    width: 90px;
    border: 1px #c6c4c4 solid;
    margin-top: 10px;
    text-align: left;
    padding: 4px 8px;
    border-radius: 3px;
  }
  .article .article-btn:hover{
    border-color: #05b076;
    transition: 0.7s;
  }
  .article a:hover{
    color: #05b076;
    transition: 0.7s;
  }
  @media screen and (max-width: 1024px){
    div.articles{
      float: none;
      width: 100vw;
    }
    div.article{
      float: none;
      width: 98vw;
      box-sizing: border-box;
      /*box-shadow: inset 2px 2px 10px #c6c4c4,inset -2px -2px 10px #FFFFFF;*/
    }
  }
</style>
