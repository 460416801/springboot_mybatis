package com.lzx.Annotation;

import com.lzx.Entity.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ronin on 2018/2/6.
 */
@Service
public class MateService {

    @Autowired
    private MateMapper mateMapper;

    List<Mate> findAll(){
        return mateMapper.findAll();
    }


    List<Mate> findByName(String name){
        return mateMapper.findByName(name);
    }

    int addMate(){
        mateMapper.addMate(new Mate(1,"1",23,new Date()));
        mateMapper.addMate(new Mate(2,"2",23,new Date()));
        mateMapper.addMate(new Mate(3,"3",23,new Date()));
        mateMapper.addMate(new Mate(4,"4",23,new Date()));
        mateMapper.addMate(new Mate(5,"5",23,new Date()));
        mateMapper.addMate(new Mate(6,"6",23,new Date()));
        mateMapper.addMate(new Mate(7,"7",23,new Date()));
        mateMapper.addMate(new Mate(8,"8",23,new Date()));
        mateMapper.addMate(new Mate(9,"9",23,new Date()));
        mateMapper.addMate(new Mate(10,"10",23,new Date()));
        mateMapper.addMate(new Mate(11,"张三",23,new Date()));
        mateMapper.addMate(new Mate(12,"李四",23,new Date()));

        return 999;
    }

    int delMate(Integer id){
        return mateMapper.delMate(id);
    }

    int updateMate(){
        return mateMapper.updateMate(new Mate(12,"刘二麻子",23,new Date()));
    }

}
