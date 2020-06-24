package com.awardselection.team.service.impl;

import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.mapper.DeclaresMapper;
import com.awardselection.team.model.Declares;
import com.awardselection.team.service.DeclaresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeclaresServiceImpl implements DeclaresService {

    @Resource
    DeclaresMapper declaresMapper;

    @Override
    public List<DeclaresDTO> findDeclareByCid(Integer id) {
        List<DeclaresDTO> declareByCid = declaresMapper.findDeclareByCid(id);
//        if (declareByCid.size()<=0) {
//        }
        return declareByCid;
    }

    @Override
    public int addDeclare(Declares declares) {
        return declaresMapper.insert(declares);
    }
}
