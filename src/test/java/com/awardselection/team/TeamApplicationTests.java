package com.awardselection.team;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.mapper.CompanyMapper;
import com.awardselection.team.service.impl.AwardsSerivceImpl;
import com.awardselection.team.service.impl.AwardsTypeServiceImpl;
import com.awardselection.team.service.impl.CompanyServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TeamApplicationTests {

    @Autowired
    AwardsSerivceImpl awardsTypeService;

    @Test
    void test() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new ArrayList<>();
        String configFilePath = System.getProperty("user.dir").concat("/src/main/resources/generatorConfig.xml");
        boolean overwrite = true;
        File configFile = new File(configFilePath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        ProgressCallback progressCallback = new VerboseProgressCallback();
        myBatisGenerator.generate(progressCallback);
        warnings.forEach(System.out::println);
    }

    @Test
    void companyTest() {
        List<AwardsDTO> allAwards = awardsTypeService.getAllAwards();
        for (AwardsDTO awardsDTO : allAwards) {
            System.out.println(awardsDTO);
        }

    }

}
