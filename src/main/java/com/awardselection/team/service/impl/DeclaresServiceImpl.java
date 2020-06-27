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
        // Todo 缺少异常的抛出
        return declaresMapper.findDeclareByCid(id);
    }

    @Override
    public int addDeclare(Declares declares) {
        // Todo 缺少异常的抛出
        int i = declaresMapper.insert(declares);
        if (i>=1){
            return declaresMapper.insert(declares);
        } else {
            return 0;
        }

    }
}
