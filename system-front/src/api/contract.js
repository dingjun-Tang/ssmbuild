import {request} from '@/utils/request'

export function getContractList(){
    return request({
        url: '/contract',
        method: 'get'
    })
}

export function getContractByContractId(data){
  return request({
      url: `/contract/${data.contractId}`,
      method: 'get',
      params: data
  })
}

export function addContract(data){
  return request({
      url: `/contract`,
      method: 'post',
      data
  })
}

export function updateContractByContractId(data){
  return request({
      url: `/contract`,
      method: 'put',
      data
  })
}

export function deleteContractByContractId(data){
  return request({
      url: `/contract/${data.contractId}`,
      method: 'post',
      data
  })
}

export function saveContractItemList(data){
  return request({
      url: `/contract/saveContractItemList`,
      method: 'post',
      data
  })
}

export function updateContractItemList(data){
  return request({
      url: `/contract/updateContractItemList`,
      method: 'put',
      data
  })
}