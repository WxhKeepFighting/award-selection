package com.awardselection.team.service;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.dto.AwardsDTO2;
import com.awardselection.team.model.Awards;

import java.util.List;
import java.util.Map;

public interface AwardsService {
    List<AwardsDTO> getAllAwards();
    List<AwardsDTO2> getAwardsByType(Integer type_id);
}
