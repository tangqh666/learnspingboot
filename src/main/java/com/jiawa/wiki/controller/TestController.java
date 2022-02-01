package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.JobJdbcDatasource;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.service.JobJdbcSourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private JobJdbcSourceService jobJdbcSourceService;
    @RequestMapping("hello")
    public String hello(){
        return "hello world!";

    }
    @RequestMapping("job")
    public CommonResp list(){
        CommonResp<List<JobJdbcDatasource>> resp = new CommonResp<>();
        List<JobJdbcDatasource> list =jobJdbcSourceService.list();
        resp.setContent(list);
        return  resp;

    }

}
