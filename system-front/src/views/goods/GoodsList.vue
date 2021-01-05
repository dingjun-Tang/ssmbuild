<template>
    <el-card class="box-card">
		<div slot="header" class="clearfix">
			<span>商品列表</span>
		</div>
		<el-table
				:data="goodsListData"
				style="width: 100%">
			<el-table-column label="商品id">
				<template slot-scope="scope">
					<i class="el-icon-key"></i>
					<span style="margin-left: 10px">{{ scope.row.goodsId }}</span>
				</template>
			</el-table-column>
			<el-table-column label="商品名">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.goodsName }}</span>
				</template>
			</el-table-column>
      <el-table-column label="商品单价">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.perPrice }}</span>
				</template>
			</el-table-column>
      <el-table-column label="商品库存">
				<template slot-scope="scope">
					<i class="el-icon-tickets"></i>
					<span style="margin-left: 10px">{{ scope.row.stock }}</span>
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
						@click="getGoodsByGoodsId(scope.row)">详情</el-button>
					<el-button
						size="mini"
						type="danger"
						@click="handleDelete(scope.row)">删除</el-button>
				</template>
			</el-table-column>
		</el-table>
		<!-- 商品详情抽屉 -->
		<el-drawer
			size="50vw"
			:visible.sync="showGoodsInfo"
			direction="rtl">
			{{goodsInfo}}
		</el-drawer>
		</el-card>
		
</template>

<script>
import { getGoodsList,getGoodsByGoodsId,deleteGoodsByGoodsId } from '@/api/goods'
	export default {
		name: 'Goods',
		data() {
			return {
				showGoodsInfo: false,
				// 商品详情
				goodsInfo:{},
				// 商品列表
				goodsListData: [],
				// 商品ID
				goodsId: undefined
			}
		},
		components: {
			// 包含组件
		},
		methods:{
			handleDelete(row){
				deleteGoodsByGoodsId(row).then(res => {
					console.log(res);
					this.getGoodsList()
				})
			},
			getGoodsList(){
				getGoodsList().then(res => {
					this.goodsListData = res.data.goodsList
				})
			},
			getGoodsByGoodsId(row){
				this.showGoodsInfo = true
				getGoodsByGoodsId(row).then(res => {
					this.goodsInfo = res.data.goods
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
			this.getGoodsList()
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