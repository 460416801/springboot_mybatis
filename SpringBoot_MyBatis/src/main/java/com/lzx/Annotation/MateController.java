package com.lzx.Annotation;

import com.lzx.Config.APIResult;
import com.lzx.Config.BaseAPI;
import com.lzx.Config.ResultCode;
import com.lzx.Entity.Mate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ronin on 2018/2/6.
 */
@RestController
@RequestMapping("/annotation")
public class MateController extends BaseAPI{

    @Autowired
    private MateService mateService;


    @PostMapping("/add")
    public APIResult addMate(){
        try{
            return this.setResult(ResultCode.SUCCESS,mateService.addMate());
        }catch(Exception e){
            return this.setResult(ResultCode.DATA_REPEAT,e.getLocalizedMessage());
        }
    }


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

    @GetMapping("/findByName")
    public APIResult findByName(@RequestParam("name") String name){
        try{
            Map<String,Object> map = new HashMap<String,Object>();
            List<Mate> list = mateService.findByName(name);
            map.put("data",list);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch(Exception e){
            return this.setResult(ResultCode.DATA_IS_NULL,e.getLocalizedMessage());
        }
    }

    @DeleteMapping("/del/{id}")
    public APIResult delMate(@PathVariable("id") Integer id){
        try{
            Map<String,Object> map = new HashMap<String,Object>();
            int i = mateService.delMate(id);
            map.put("data",i);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch (Exception e){
            return this.setResult(ResultCode.DATA_REPEAT,e.getLocalizedMessage());
        }
    }

    @PutMapping("put")
    public APIResult updateMate(){
        try{
            Map<String,Object> map = new HashMap<String,Object>();
            int i = mateService.updateMate();
            map.put("data",i);
            return this.setResult(ResultCode.SUCCESS,map);
        }catch (Exception e){
            return this.setResult(ResultCode.DATA_REPEAT,e.getLocalizedMessage());
        }
    }

}
