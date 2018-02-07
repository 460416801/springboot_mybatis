package com.lzx.Xml;

import com.lzx.Entity.Mate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Ronin on 2018/2/6.
 *
 * 使用mapper.xml进行持久化操作.
 * 1.要在application.properties文件中添加设置,mybatis:mapper-locations: classpath:mybatis/*.xml，在对应的地方建立文件
 *
 * 2.在启动类上添加注解@MapperScan("com.lzx")，映射Mapper文件也就是dao层
 *
 */
public interface XmlMateMapper {

    List<Mate> findAll();

    List<Mate> lala(@Param("name") String name , @Param("age") Integer age);


//    List<Mate> findByName(@Param("name") String name ,@Param("age") Integer age);
//
//
//    int addMate(@Param("mate") Mate mate);
//
//
//    int delMate(@Param(("id")) Integer id);
//
//
//    int updateMate(@Param("mate") Mate mate);
}
