package lsgwr.exam.controller;

import io.swagger.annotations.Api;
import lsgwr.exam.service.UserService;
import lsgwr.exam.vo.ResultVO;
import lsgwr.exam.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title StudentController
 * @Author Meng
 * @Description
 * @Version 1.0
 * @Data 2024/3/26 11:11
 */
@RestController
@Api(tags = "学生管理")
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private UserService userService;

    //查询直接筛选过滤一下roleid是3的就行了
    @GetMapping("/getAll")
    ResultVO<List<UserVo>> getAll(){
        //实现类写一下  操作到时候跟着改也是跟着id改 应该没啥问题
        return userService.getAllStudent();
    }

}
