import {request} from '@/utils/request'

export function getGoodsList(){
    return request({
        url: '/goods',
        method: 'get'
    })
}

export function getGoodsByGoodsId(data){
  return request({
      url: `/goods/${data.goodsId}`,
      method: 'get',
      params: data
  })
}

export function addGoods(data){
  return request({
      url: `/goods`,
      method: 'post',
      data
  })
}

export function updateGoodsByGoodsId(data){
  return request({
      url: `/goods`,
      method: 'put',
      data
  })
}

export function deleteGoodsByGoodsId(data){
  return request({
      url: `/goods/${data.goodsId}`,
      method: 'post',
      data
  })
}

export function saveGoodsItemList(data){
  return request({
      url: `/goods/saveGoodsItemList`,
      method: 'post',
      data
  })
}

export function updateGoodsItemList(data){
  return request({
      url: `/goods/updateGoodsItemList`,
      method: 'put',
      data
  })
}