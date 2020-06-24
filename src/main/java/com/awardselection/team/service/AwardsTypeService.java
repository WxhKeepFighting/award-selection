package com.awardselection.team.service;

import com.awardselection.team.model.AwardsType;

import java.util.List;

public interface AwardsTypeService {
    List<AwardsType> getAllAwardsType();
    AwardsType getAwardsTypeById(Integer id);
}
