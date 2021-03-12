<template>
  <div class="tip">
    <span class="title">公告</span>
    <a href="javascript:;" @click="cloceTip" class="tip-tool"><img width="20px" src="@/assets/icons/叉.svg" alt="×"></a>
    <div class="tip-body">
      <img src="@/assets/icons/喇叭.svg"><span v-text="tip"></span>
    </div>
  </div>
</template>

<script>
export default {
  name: "Tip",
  data(){
    return{
      tip: '蹉跎半生，归来已非少年。欢迎回来~'
    }
  },
  methods: {
    cloceTip(){
      let element = document.getElementsByClassName('tip')[0];
      element.style.display = 'none'
    }
  },
  mounted() {
    setTimeout(()=>{ this.cloceTip() },2500)
  }
}
</script>

<style scoped>
  /*公告*/
  .tip{
    /*position: fixed;*/
    position: relative;
    z-index: 99999;
    /*right: 20px;*/
    /*bottom: 200px;*/
    display: block;
    background-color: #d5e7e2;
    box-shadow: 0 0 5px #666666;
    border-radius: 15px;
    animation: up 1s;
  }
  .tip:hover{
    box-shadow: 0 0 5px #1E9FFF;
  }
  .tip-body{
    min-height: 100px;
    padding: 20px;
    /*background-color: #42b983;*/
    border-top: 30px #327e1e solid;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
    box-sizing: border-box;
  }
  .tip-tool{
    /*background-color: #00FF00;*/
    width: 30px;
    display: block;
    text-align: center;
    box-sizing: border-box;
    position: static;
    right: -200px;
    float: right;
    margin: 2px;
  }
  .title{
    float: left;
    color: #FFFFFF;
    box-sizing: border-box;
    padding: 5px;
  }
  @keyframes up {
    0%  { bottom: -100px; }
    100% { bottom: 0; }
  }
</style>
