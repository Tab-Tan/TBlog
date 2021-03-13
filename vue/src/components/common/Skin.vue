<template>
  <div class="skin">
    <div class="ib">
      <ul id="show">
        <li class="color" v-for="color in colors" v-text="color" @click="changeBackground(color)"></li>
      </ul>
    </div>
    <img src="@/assets/icons/皮肤.svg" @click="show">
  </div>
</template>

<script>
export default {
  name: "Skin",
  data(){
    return{
      i: 0,
      tip: '蹉跎半生，归来已非少年。欢迎回来~',
      colors: ['默认','#dddddd','#ecf0f3','#f9f3f3','#f7d9d9','#f25287','#2b2a2a'],
      url: 'https://cdn.jsdelivr.net/gh/Tab-tan/CDN@1.1.15/pic/171141-1575709901e5e0.jpg'
    }
  },
  methods:{
    showColor() {
      let len = document.getElementsByClassName('color').length;
      for (let i = 0; i < len; i++) {
        let element = document.getElementsByClassName('color').item(i);
        element.style.background=element.innerText;
      }
    },
    changeBackground(color){
      document.getElementById('app').style.background=color;
      if (color === this.colors[0]){
        let el = document.getElementById('app');
        el.style.background="url("+this.url+") no-repeat";
        el.style.backgroundSize = 'cover'
      }
    },
    show(){
      if(this.i%2 === 0){
        document.getElementById('show').style.display = 'block';
        this.i++;
      }else {
        document.getElementById('show').style.display = 'none';
        this.i++;
      }
    }
  },
  mounted() {
    //显示颜色
    this.showColor();
  }
}
</script>

<style scoped>
  .skin{
    background-color: #f1e8e8;
    box-sizing: border-box;
    border-radius: 20px;
    overflow: hidden;
  }
  .tools img{
    display: inline-block;
    float: right;
  }
  ul{
    margin-top: 5px;
    display: none;
  }
  li{
    box-sizing: border-box;
    padding: 3px;
    width: 100px;
    background: #FFFFFF;
    border-bottom: #c6c4c4 1px solid;
    text-align: center;
    border-radius: 15px;
  }
  li:hover{
    box-shadow: 0 0 5px #000000;
    border: 1px #2b2a2a solid;
    width: 140px;
  }
  @media screen and (max-width: 1150px) {
    img{
      width: 30px;
    }
  }
</style>
