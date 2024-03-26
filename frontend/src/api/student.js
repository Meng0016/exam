import api from './index'
import { axios } from '../utils/request'

export function getAllStudent () {
  return axios({
    url: api.StudentInfo,
    method: 'get'
  })
}
