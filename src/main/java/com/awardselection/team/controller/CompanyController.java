package com.awardselection.team.controller;

import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.model.Declares;
import com.awardselection.team.service.DeclaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    DeclaresService declaresService;

    @GetMapping("/findDeclareByCid")
    public List<DeclaresDTO> declaresDTOS(@RequestParam Integer id) {
        return declaresService.findDeclareByCid(id);
    }

    @PostMapping("/addDeclare")
    public int declaresAdd(@RequestBody Declares declares) {
        return declaresService.addDeclare(declares);
    }


}
