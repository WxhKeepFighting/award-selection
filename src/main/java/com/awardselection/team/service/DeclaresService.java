package com.awardselection.team.service;

import com.awardselection.team.dto.DeclaresDTO;

import java.util.List;

public interface DeclaresService {
    List<DeclaresDTO> findDeclareByCid(Integer id);
}
