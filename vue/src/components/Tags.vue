<template>
  <div class="tags">
    <!--头部导航-->
    <div class="flex-center header-context">
      <Header></Header>
    </div>
    <div class="flex-center">
      <div class="context-body">
        <!--左工具栏-->
        <div class="left-context">
          <Info></Info>
        </div>
        <!--右边主体-->
        <div class="right-context">
          <div class="tag-info">
            <h3>当前标签:<span v-text="tag.name"></span></h3>
          </div>
          <!--文章预览-->
          <div class="articles">
            <div class="article" v-for="article in tag.articles">
              <div class="articles-title"><a href="#/article" v-text="article.title"></a></div>
              <div class="articles-context">
                <p>
                  摘要:<span v-text="article.digest"></span>
                </p>
              </div>
              <div class="article-btn"><a href="#/article">阅读全文 >></a> </div>
              <div class="articles-foot">posted @ {{article.date}} {{ article.nikeName }} 阅读({{article.readCount}}) 评论({{ article.commentCount }}) 推荐({{ article.recommend }})</div>
            </div>
          </div>
        </div>
        <PageHelper></PageHelper>
      </div>
    </div>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from "./common/Header";
import Info from "./common/Info";
import Footer from "./common/Footer";
import PageHelper from "./common/PageHelper";
export default {
  name: "Tags",
  data(){
    return{
      tag: {name:'vue',articles:[
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
        ]}
    }
  },
  components: {PageHelper, Footer, Info, Header},
  props:'tag'
}
</script>

<style scoped>
  .header-context{
    margin-bottom: 100px;
  }
  .context-body{
    background-color: #303030;
    width: 960px;
    overflow: hidden;
  }
  .right-context{
    width: 960px;
  }
  .tag-info{
    float: right;
    width: 670px;
    padding-bottom: 20px;
    border-bottom: 1px #c6c4c4 solid;
    margin-right: 20px;
  }
  /*文章*/
  p{
    color: #d6d5d5;
  }
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
</style>
