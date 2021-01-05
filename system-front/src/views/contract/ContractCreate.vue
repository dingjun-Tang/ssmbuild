<template>
  <el-card style="margin: 0 15px">
    <el-row :gutter="10">
      <el-form ref="contractCreateForm" :model="contractCreateFormData" :rules="rules" size="mini"
        label-width="100px" label-position="top">
        <el-col :span="12">
          <el-form-item label="合同名称" prop="contractName">
            <el-input v-model="contractCreateFormData.contractName" placeholder="请输入合同名称" :maxlength="20"
              show-word-limit clearable prefix-icon='el-icon-document-copy' :style="{width: '100%'}">
            </el-input>
          </el-form-item>
        </el-col>
        <el-col :span="24">
          <el-form-item size="large">
            <el-button type="primary" @click="submitForm">提交</el-button>
            <el-button @click="resetForm">重置</el-button>
          </el-form-item>
        </el-col>
      </el-form>
    </el-row>
  </el-card>
</template>
<script>
import { addContract } from '@/api/contract'

export default {
  components: {},
  props: [],
  data() {
    return {
      contractCreateFormData: {
        contractName: undefined,
      },
      rules: {
        contractName: [{
          required: true,
          message: '请输入合同名称',
          trigger: 'blur'
        }]
      }
    }
  },
  computed: {},
  watch: {},
  created() {
    
  },
  mounted() {},
  methods: {
    // 合同创建表单提交
    submitForm() {
      this.$refs['contractCreateForm'].validate(valid => {
        if (!valid) return
        addContract(this.contractCreateFormData).then(res => {
          console.log(res);
        })
      })
    },
    // 表单置空
    resetForm() {
      this.$refs['contractCreateForm'].resetFields()
    },
  
  }
}

</script>
<style scoped>

</style>
