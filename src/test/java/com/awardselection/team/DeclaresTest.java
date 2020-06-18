package com.awardselection.team;

import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.mapper.DeclaresMapper;
import com.awardselection.team.model.Declares;
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
    @Resource
    DeclaresMapper declaresMapper;

    @Test
    void testFindDeclaresById() {
        List<DeclaresDTO> declareById = mapper.findDeclareByCid(1);
        System.out.println(declareById+"111");
    }

    @Test
    void testAddDeclares() {
        Declares declares = new Declares();
        declares.setComId(1);//将id转化为公司姓名
        declares.setAwardId(2);//将奖项id转化为奖项名称
        declares.setStatus(0);//初次提交状态为0
        declares.setSubmission("测试提交申报信息");
        declares.setAttachment("/img/test");
        declaresMapper.insert(declares);
    }
}
