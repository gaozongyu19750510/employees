package com.employees.mapper;

import com.employees.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 人事系统：employees
 * @since 2020-12-11
 */

public interface UsersMapper extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users> {

}
//public interface UsersMapper extends BaseMapper<Users> {
//
//}
