<template>
  <div class="footer">
    <div class="context-body">
      <div class="footer-copyright">
        Copyright © <span v-text="Copyright"></span>
      </div>
      <div class="footer-beian">备案号：<a href="https://beian.miit.gov.cn"><span v-text="beian"></span></a></div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Footer',
  data () {
    return {
      Copyright: '2021 TabTan',
      beian: '皖ICP备2020016912号-2'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  /*页脚盒子*/
  .footer{
    height: 70px;
    /*background-color: #ecf0f3;*/
    /*border-top: 1px #6a6b6a solid;*/
    margin-top: 60px;
    text-align: center;
    display: flex;
    justify-content: center;
  }
  .context-body{
    border-radius: 20px;
    width: 1000px;
    box-sizing: border-box;
    box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;
    background: rgba(255,255,255,.3);
  }
  .footer-copyright{
    margin-top: 20px;
  }
  a:hover{
    color: #05b076;
  }
</style>
