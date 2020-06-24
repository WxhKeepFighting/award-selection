package com.awardselection.team.service.impl;

import com.awardselection.team.mapper.AwardsTypeMapper;
import com.awardselection.team.model.AwardsType;
import com.awardselection.team.model.AwardsTypeExample;
import com.awardselection.team.service.AwardsTypeService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AwardsTypeServiceImpl implements AwardsTypeService {

    @Resource
    AwardsTypeMapper typeMapper;


    @Override
    public List<AwardsType> getAllAwardsType() {
        AwardsTypeExample example = new AwardsTypeExample();
        AwardsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        return typeMapper.selectByExample(example);
    }

    @Override
    public AwardsType getAwardsTypeById(Integer id) {

        return typeMapper.selectByPrimaryKey(id);
    }
}
