package com.awardselection.team.service;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.model.Awards;

import java.util.List;

public interface AwardsService {
    List<AwardsDTO> getAllAwards();
}
