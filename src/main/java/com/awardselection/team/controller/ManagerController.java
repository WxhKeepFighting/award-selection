package com.awardselection.team.controller;

import com.awardselection.team.dto.AwardsDTO;
import com.awardselection.team.model.Awards;
import com.awardselection.team.model.Manager;
import com.awardselection.team.service.AwardsService;
import com.awardselection.team.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @Autowired
    AwardsService awardsService;

    @GetMapping("/login")
    public boolean checkManagerLogin(@RequestParam String account, @RequestParam String password) {
        return managerService.checkManagerLogin(account, password);
    }

    @GetMapping("/awards")
    public List<AwardsDTO> getAllAwards() {
        return awardsService.getAllAwards();
    }
}
