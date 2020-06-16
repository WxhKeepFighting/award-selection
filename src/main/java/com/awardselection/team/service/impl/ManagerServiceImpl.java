package com.awardselection.team.service.impl;

import com.awardselection.team.mapper.ManagerMapper;
import com.awardselection.team.model.ManagerExample;
import com.awardselection.team.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper mapper;

    @Override
    public boolean checkManagerLogin(String account, String password) {
        ManagerExample example = new ManagerExample();
        example.createCriteria().andAccountEqualTo(account).andPasswordEqualTo(password);
        return mapper.selectByExample(example).size() > 0 ;
    }
}
