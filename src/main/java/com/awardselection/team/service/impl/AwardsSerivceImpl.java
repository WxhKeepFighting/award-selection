package com.awardselection.team.service.impl;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.mapper.AwardsMapper;
import com.awardselection.team.model.Awards;
import com.awardselection.team.service.AwardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AwardsSerivceImpl implements AwardsService {

    @Autowired
    AwardsMapper mapper;

    @Override
    public List<AwardsDTO> getAllAwards() {
//        return mapper.selectByExample(null);
        return mapper.selectAllAwards();
    }
}
