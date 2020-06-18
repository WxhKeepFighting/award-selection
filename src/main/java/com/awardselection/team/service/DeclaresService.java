package com.awardselection.team.service;

import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.model.Declares;

import java.util.List;

public interface DeclaresService {
    List<DeclaresDTO> findDeclareByCid(Integer id);
    int addDeclare(Declares declares);
}
