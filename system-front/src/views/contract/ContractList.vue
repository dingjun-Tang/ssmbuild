<template>
    <el-card class="box-card">
		<div slot="header" class="clearfix">
			<span>合同列表</span>
		</div>
		<el-table
				:data="contractListData"
				style="width: 100%">
			<el-table-column label="合同id">
				<template slot-scope="scope">
					<i class="el-icon-key"></i>
					<span style="margin-left: 10px">{{ scope.row.contractId }}</span>
				</template>
			</el-table-column>
			<el-table-column label="合同名">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.contractName }}</span>
				</template>
			</el-table-column>
			<el-table-column label="创建时间">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.createTime }}</span>
				</template>
			</el-table-column>
			<el-table-column label="更新时间">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.updateTime }}</span>
				</template>
			</el-table-column>
			<el-table-column label="操作">
				<template slot-scope="scope">
					<el-button
						size="mini"
						@click="getContractByContractId(scope.row)">详情</el-button>
					<el-button
						size="mini"
						type="danger"
						@click="handleDelete(scope.row)">删除</el-button>
				</template>
			</el-table-column>
		</el-table>
		<!-- 合同详情抽屉 -->
		<el-drawer
			size="50vw"
			:visible.sync="showContractInfo"
			direction="rtl">
			{{contractInfo}}
		</el-drawer>
		</el-card>
		
</template>

<script>
import { getContractList,getContractByContractId,deleteContractByContractId } from '@/api/contract'
	export default {
		name: 'Contract',
		data() {
			return {
				showContractInfo: false,
				// 合同详情
				contractInfo:{},
				// 合同列表
				contractListData: [],
				// 合同ID
				contractId: undefined
			}
		},
		components: {
			// 包含组件
		},
		methods:{
			handleDelete(row){
				deleteContractByContractId(row).then(res => {
					console.log(res);
					this.getContractList()
				})
			},
			getContractList(){
				getContractList().then(res => {
					this.contractListData = res.data.contractList
				})
			},
			getContractByContractId(row){
				this.showContractInfo = true
				getContractByContractId(row).then(res => {
					this.contractInfo = res.data.contract
				})
			},
		
		},
		computed:{
				//计算属性
				
		},
		watch:{
				//监听属性
		},
		beforeCreate() {
				//console.log('beforeCreate函数......');
		},
		beforeMount() {
				//mounted函数时页面标签的内容基本还没有渲染完成
				//console.log('====beforeMount=====begin');
				//console.log(this.$el);
				//console.log('====beforeMount=====end');
		},
		created() {
			this.getContractList()
			//console.log('created函数......');
		},
		mounted() {
				//mounted函数时页面标签的内容基本已经渲染完成时调用这个函数
				//console.log('========mounted函数========begin');
				//console.log(this.$el);
				//console.log('========mounted函数========end');
		},
		beforeDestroy() {
				//console.log('beforeDestroy函数......');
		},
		destroyed() {
				//console.log('destroyed函数......');
		},
		beforeUpdate() {
				//当数据发生改变时，在标签没有被渲染之前触发
				//console.log('beforeUpdate函数......');
		},
		updated() {
				//当数据发生改变时，在标签被渲染后触发
				//console.log('updated函数......');
		}
	}
</script>

<style scoped>
	.box-card{
		width: 100%;
		height: 100%;
		overflow: auto;
	}
</style>