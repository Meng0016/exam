// 考试相关的接口，包括考试、问题、选项和评分等接口

import api from './index'
import { axios } from '../utils/request'

export function getAllTeacher () {
  return axios({
    url: api.TeacherInfo,
    method: 'get'
  })
}
