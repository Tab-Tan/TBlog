<template>
  <div class="main">
<!--头部 导航栏-->
    <div class="header-context">
      <Header></Header>
    </div>
<!--主体-->
    <div class="context-body-center">
      <div class="context-body">
        <!--主体左边-->
        <Info></Info>
        <!--主体右边-->
        <Articles></Articles>
      </div>
    </div>
<!--底部页脚-->
    <Footer></Footer>
  </div>
</template>

<script>
import Footer from "./common/Footer";
import Header from "./common/Header";
import Info from "./common/Info";
import PageHelper from "./common/PageHelper";
import Articles from "./rights/Articles";
export default {
  name: "Main",
  components: {Articles, PageHelper, Info, Header, Footer},
  data(){
    return {

    }
  }
}
</script>

<style scoped>

  /*整个模板*/
  .main{
    /*color: #FCFFFE;*/
    position: relative;
  }
  /*头部导航*/
  .header-context{
    width: 100%;
    display: flex;
    justify-content: center;
    margin-bottom: 100px;
  }
  /*主体居中弹性盒子*/
  .context-body-center{
    display: flex;
    justify-content: center;
  }
  /*主体盒子*/
  .context-body{
    padding: 50px;
    width: 1100px;
    overflow: hidden;
    /*box-shadow: 10px 10px 15px #e0dede,-10px -10px 15px #fcfcfc;*/
  }


  /*主体右边大盒子*/
  .context-body .right{
    background-color: #fcf7f7;
  }

</style>
