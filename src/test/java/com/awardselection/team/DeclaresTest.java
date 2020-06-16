package com.awardselection.team;

import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.mapper.DeclaresMapper;
import com.awardselection.team.service.DeclaresService;
import com.awardselection.team.service.impl.DeclaresServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/6/16 17:04
 * @Description:
 */
@SpringBootTest
class DeclaresTest {

    @Resource
    DeclaresServiceImpl mapper;

    @Test
    void testFindDeclaresById() {
        List<DeclaresDTO> declareById = mapper.findDeclareByCid(1);
        System.out.println(declareById);
    }
}
