package com.lzx.Xml;


import com.lzx.Config.APIResult;
import com.lzx.Config.BaseAPI;
import com.lzx.Config.ResultCode;
import com.lzx.Entity.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ronin on 2018/2/6.
 */
@RestController
@RequestMapping("/xml")
public class XmlMateController extends BaseAPI {

    @Autowired
    private XmlMateService mateService;


    @GetMapping("/findAll")
    public APIResult findAll(){
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            List<Mate> list = mateService.findAll();
            map.put("data",list);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.DATA_IS_NULL,e.getLocalizedMessage());
        }
    }

    @GetMapping("/lala")
    public APIResult lala(@RequestParam("name")String name ,@RequestParam("age")Integer age){
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            List<Mate> list = mateService.lala(name,age);
            map.put("data",list);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.DATA_IS_NULL,e.getLocalizedMessage());
        }
    }


}
