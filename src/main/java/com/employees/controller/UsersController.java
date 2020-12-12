package com.employees.controller;


import com.employees.common.lang.Result;
import com.employees.common.lang.ResultCode;
import com.employees.entity.Users;
import com.employees.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 人事系统：employees
 * @since 2020-12-11
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersServiceImpl usersService;

    //保存用户
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody Users users)  {
        usersService.Create(users);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新企业信息
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") Integer id, @RequestBody Users users ) {
        //业务操作
        users.setId(id);
        usersService.update(users);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/users/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") Integer id) {
        //usersService(id);
        usersService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询企业
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findCompanyById(@PathVariable(value="id") Integer id){
        Users company = usersService.findById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }

    //查询全部企业列表
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<Users> list = usersService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }

}
