package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.JobJdbcDatasource;
import com.jiawa.wiki.mapper.JobJdbcDatasourceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobJdbcSourceService {

    @Resource
    private JobJdbcDatasourceMapper jobJdbcDatasourceMapper;
    public List<JobJdbcDatasource> list(){
        return  jobJdbcDatasourceMapper.selectByExample(null);

    }


}
