package com.example.mapper;

import com.example.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2022-08-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

   List<User> findAllUser();

   User getAdminUser();

}
