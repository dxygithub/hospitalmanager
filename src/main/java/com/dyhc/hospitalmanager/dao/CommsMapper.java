package com.dyhc.hospitalmanager.dao;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 * @param <T>
 */
public interface CommsMapper<T> extends Mapper<T>,MySqlMapper<T> {
}