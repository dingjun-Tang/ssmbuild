<template>
  <div>
    <el-row :gutter="15">
      <el-form ref="goodsCreateForm" :model="goodsCreateFormData" :rules="rules" size="mini"
        label-width="100px">
        <el-col :span="12">
          <el-form-item label="商品名称" prop="goodsName">
            <el-input v-model="goodsCreateFormData.goodsName" placeholder="请输入商品名称" :maxlength="20"
              show-word-limit clearable prefix-icon='el-icon-goods' :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="商品单价" prop="perPrice">
            <el-input v-model="goodsCreateFormData.perPrice" placeholder="请输入商品单价" clearable
              prefix-icon='el-icon-star-on' :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="商品数量" prop="stock">
            <el-input v-model="goodsCreateFormData.stock" placeholder="请输入商品数量" clearable
              prefix-icon='el-icon-s-release' :style="{width: '100%'}"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-form-item size="large">
            <el-button type="primary" @click="submitForm">创建商品</el-button>
            <el-button @click="resetForm">重置</el-button>
          </el-form-item>
        </el-col>
      </el-form>
    </el-row>
  </div>
</template>
<script>
import {addGoods} from '@/api/goods'
export default {
  components: {},
  props: [],
  data() {
    return {
      goodsCreateFormData: {
        goodsName: undefined,
        perPrice: undefined,
        stock: undefined
      },
      rules: {
        goodsName: [{
          required: true,
          message: '请输入商品名称',
          trigger: 'blur'
        }],
        perPrice: [{
          required: true,
          message: '请输入商品单价',
          trigger: 'blur'
        }],
        stock: [{
          required: true,
          message: '请输入商品数量',
          trigger: 'blur'
        }]
      },
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
      this.$refs['goodsCreateForm'].validate(valid => {
        if (!valid) return
        addGoods(this.goodsCreateFormData).then(res => {
          
        })
      })
    },
    resetForm() {
      this.$refs['goodsCreateForm'].resetFields()
    },
  }
}

</script>
<style>
</style>
