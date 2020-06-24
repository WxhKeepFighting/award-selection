package com.awardselection.team;

import com.awardselection.team.dto.AwardsDTO2;
import com.awardselection.team.mapper.AwardsMapper;
import com.awardselection.team.model.Awards;
import com.awardselection.team.model.AwardsExample;
import com.awardselection.team.model.AwardsType;
import com.awardselection.team.service.AwardsService;
import com.awardselection.team.service.AwardsTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/6/22 11:18
 * @Description:
 */
@SpringBootTest
public class AwardsTest {

    @Resource
    AwardsTypeService typeService;

    @Resource
    AwardsService awardsService;

    @Resource
    AwardsMapper awardsMapper;

    @Test
    void findAllType() {
        List<AwardsType> allAwardsType = typeService.getAllAwardsType();
        for (AwardsType awardsType : allAwardsType) {
            System.out.println("奖项id："+awardsType.getId()+"奖项类型："+awardsType.getType());
        }
    }

    @Test
    void findTypeByid() {
        AwardsType awardsTypeById = typeService.getAwardsTypeById(1);
        System.out.println("奖项id："+awardsTypeById.getId()+"奖项类型："+awardsTypeById.getType());

    }

    @Test
    void findAwardsByType() {

    }

    @Test
    void TestType() {
        List<AwardsDTO2> awardsByType = awardsService.getAwardsByType(1);
        System.out.println(awardsByType);

    }
}
