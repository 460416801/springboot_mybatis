package com.lzx.Annotation;

import com.lzx.Entity.Mate;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Ronin on 2018/2/6.
 * <p>
 * User映射类
 * 使用注解@Mapper   无需其他配置，service与Contorller与之前一致    完成mybatis
 */
@Mapper
public interface MateMapper {

    @Select("select * from Mate")
    List<Mate> findAll();

    @Select("select * from Mate where name = #{name}")
    List<Mate> findByName(@Param("name") String name);

    @Insert("insert into Mate(id,name,age,brithday) values(#{mate.id},#{mate.name},#{mate.age},#{mate.brithday})")
    int addMate(@Param("mate") Mate mate);

    @Delete("delete from Mate where id = #{id}")
    int delMate(@Param(("id")) Integer id);

    @Update("update Mate set name = #{mate.name},age = #{mate.age},brithday = #{mate.brithday} where id = #{mate.id} ")
    int updateMate(@Param("mate") Mate mate);
}
