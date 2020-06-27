package com.awardselection.team.controller;

import com.alibaba.fastjson.JSONObject;
import com.awardselection.team.dto.DeclaresDTO;
import com.awardselection.team.exception.AjaxResponse;
import com.awardselection.team.model.Declares;
import com.awardselection.team.service.DeclaresService;
import com.awardselection.team.service.FileManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    DeclaresService declaresService;

    @Autowired
    FileManagement fileManagement;

    // 查询指定申报信息
    @GetMapping("/findDeclareByCid")
    public ResponseEntity<List<DeclaresDTO>> declaresDTOS(@RequestParam Integer id) {
        List<DeclaresDTO> declareByCid = declaresService.findDeclareByCid(id);
        return ResponseEntity.status(HttpStatus.OK).body(declareByCid);
    }

    // 添加申报信息
    @PostMapping("/addDeclare")
    public ResponseEntity<AjaxResponse> declaresAdd(@RequestParam("file")MultipartFile file,
                                                    @RequestParam("body") String declareStr
                                                    ) {
        String attachment = fileManagement.fileUpload(file);
        Declares declares = JSONObject.parseObject(declareStr,Declares.class);
        declares.setAttachment(attachment);
        declaresService.addDeclare(declares);
        return ResponseEntity.status(HttpStatus.OK).body(AjaxResponse.success());
    }


}
