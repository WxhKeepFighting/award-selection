package com.awardselection.team.service.impl;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.dto.AwardsDTO2;
import com.awardselection.team.mapper.AwardsMapper;
import com.awardselection.team.model.Awards;
import com.awardselection.team.model.AwardsExample;
import com.awardselection.team.service.AwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AwardsSerivceImpl implements AwardsService {

    @Resource
    AwardsMapper awardsMapper;

    @Override
    public List<AwardsDTO> getAllAwards() {
        return awardsMapper.selectAllAwards();
    }

    @Override
    public List<AwardsDTO2> getAwardsByType(Integer type_id) {
        AwardsExample example = new AwardsExample();
        example.createCriteria().andTypeIdEqualTo(type_id);
        List<Awards> awards = awardsMapper.selectByExample(example);
        List<AwardsDTO2> awardsDTO2s = new ArrayList<>();
        for (Awards a : awards ) {
            awardsDTO2s.add(new AwardsDTO2(a.getId(), a.getName()));
        }
        return awardsDTO2s;
    }

}
