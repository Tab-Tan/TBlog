<template>
  <!--分页-->
  <div class="page">
    <div id="page-pre"><a href="javascript:;" class="btn-simple">上一页</a></div>
    <div class="page-item">
      <a href="javascript:;" class="btn-simple active">1</a>
      <a href="javascript:;" class="btn-simple">2</a>
      <a href="javascript:;" class="btn-simple">3</a>
    </div>
    <div class="page-next"><a href="javascript:;" class="btn-simple">下一页</a></div>
  </div>
</template>

<script>
export default {
  name: "PageHelper"
}
</script>

<style scoped>
/*分页*/
.page{
  /*background-color: #c6c4c4;*/
  text-align: right;
  width: 700px;
  /*float: right;*/
}
.page div{
  margin: 20px 2px;
  display: inline-block;
}
.btn-simple{
  width: 90px;
  border: 1px #c6c4c4 solid;
  margin-top: 10px;
  text-align: left;
  padding: 4px 8px;
  border-radius: 3px;
}
.btn-simple:hover{
  color: #05b076;
  border-color: #05b076;
  transition: 0.7s;
}
.active{
  color: #05b076;
  border-color: #05b076;
}
@media screen and (max-width: 1024px){
  div.page{
    width: 80vw;
  }
}
</style>
