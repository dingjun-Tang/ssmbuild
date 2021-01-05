<template>
  <el-container>
    <el-aside width="200px">
      <el-menu
          :router="true"
          background-color="#123456"
          text-color="#fff"
          default-active="/home/contract-list"
          :open="1"
          active-text-color="#ff0000">
        <el-submenu index="1">
          <template slot="title">
            <i class="el-icon-s-shop"></i>
            <span>合同管理</span>
          </template>
          <el-menu-item index="/home/contract-list">
            <i class="el-icon-s-order"></i>
            <span>合同列表</span>
          </el-menu-item>
          <el-menu-item index="/home/contract-create">
            <i class="el-icon-s-order"></i>
            <span>合同创建</span>
          </el-menu-item>
        </el-submenu>
        <el-submenu index="1">
          <template slot="title">
            <i class="el-icon-s-shop"></i>
            <span>商品管理</span>
          </template>
          <el-menu-item index="/home/goods-list">
            <i class="el-icon-s-order"></i>
            <span>商品列表</span>
          </el-menu-item>
          <el-menu-item index="/home/goods-create">
            <i class="el-icon-s-order"></i>
            <span>添加商品</span>
          </el-menu-item>
        </el-submenu>
      </el-menu>
    </el-aside>
    <el-container>
      <el-main style="overflow: hidden">
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
    name: "Home",
    data(){
      return {
        
      }
    },
    methods: {
      
    }
    ,mounted() {
      
    }
    ,created(){
      
    }
  }
</script>

<style scoped>

  #title{
    height: 39px;
    line-height: 39px;
    font-size: 16px;
    font-weight: normal;
    color: rgba(255,255,255,0.6);
    text-align: center;
    border-bottom: 1px rgba(255,255,255,0.1) solid;
  }
  .el-container{
    height: 100vh;
  }
  .el-aside{
    background-color: rgb(67, 68, 73)
  }
  .el-header{
    background-color: rgba(255,255,255,1);
    margin: 0;
    padding: 0;
    box-shadow: 1px 1px 1px rgba(102,102,102,0.8);
  }
  .el-menu{
    border: 0;
  }
  .el-icon-s-fold{
    font-size: 28px;
    margin: 8px 0px 0px 10px;
  }
</style>
