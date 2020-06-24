package com.awardselection.team.controller;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.dto.AwardsDTO2;
import com.awardselection.team.exception.AjaxResponse;
import com.awardselection.team.model.Awards;
import com.awardselection.team.model.AwardsType;
import com.awardselection.team.model.Manager;
import com.awardselection.team.service.AwardsService;
import com.awardselection.team.service.AwardsTypeService;
import com.awardselection.team.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @Autowired
    AwardsService awardsService;

    @Resource
    AwardsTypeService awardsTypeService;

    @GetMapping("/login")
    public boolean checkManagerLogin(@RequestParam String account, @RequestParam String password) {
        return managerService.checkManagerLogin(account, password);
    }

    // 登录测试接口 可忽略
    @GetMapping("/login1")
    public ResponseEntity<AjaxResponse> LoginTest(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.status(HttpStatus.OK).body(AjaxResponse.success(managerService.checkManagerLogin(username, password)));
    }

    // 查询所有奖项
    @GetMapping("/findAllAwards")
    public List<AwardsDTO> getAllAwards() {
        return awardsService.getAllAwards();
    }

    // 按照id查询奖项
    @GetMapping("/findAward/{id}")
    public List<AwardsDTO2> getOneAward(@PathVariable Integer id) {
        return awardsService.getAwardsByType(id);
    }

    // 查找所有奖项的类型
    @GetMapping("/findAllAwardType")
    public ResponseEntity<List<AwardsType>> awardTypeGet() {
        List<AwardsType> allAwardsType = awardsTypeService.getAllAwardsType();
        return ResponseEntity.status(HttpStatus.OK).body(allAwardsType);
    }
}
