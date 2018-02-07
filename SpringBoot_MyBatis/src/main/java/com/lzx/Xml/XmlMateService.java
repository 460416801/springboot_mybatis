package com.lzx.Xml;


import com.lzx.Entity.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ronin on 2018/2/6.
 */
@Service
public class XmlMateService {

    @Autowired
    private XmlMateMapper mateMapper;

    List<Mate> findAll(){

        return mateMapper.findAll();
    }

    List<Mate> lala(String name,Integer age){

        return mateMapper.lala(name,age);
    }


}
