import axios from 'axios'

export function request(config) {
  //1.创建axios实例
  const http = axios.create({
    baseURL: ""
  })

  //3.axios响应拦截
  http.interceptors.response.use(res => {
    return res.data;
  });
  
  //返回promise
  return http(config);
}
