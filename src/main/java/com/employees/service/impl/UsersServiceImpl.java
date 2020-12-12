package com.employees.service.impl;

import com.employees.entity.Users;
import com.employees.mapper.UsersMapper;
import com.employees.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 人事系统：employees
 * @since 2020-12-11
 */
@Service
//public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
public class UsersServiceImpl{
    @Autowired
    private UsersMapper usersMapper;

    public void Create(Users users) {
        usersMapper.save(users);
    }

    public Users update(Users users) {
        return usersMapper.save(users);
    }
    public Users findById(Integer id) {
        return usersMapper.findById(id).get();
    }
    public void deleteById(Integer id) {
        usersMapper.deleteById(id);
    }
    public List<Users> findAll() {
       return usersMapper.findAll();
    }
}
