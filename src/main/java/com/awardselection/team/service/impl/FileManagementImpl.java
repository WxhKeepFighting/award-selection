package com.awardselection.team.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.awardselection.team.exception.AjaxResponse;
import com.awardselection.team.service.FileManagement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/6/24 12:07
 * @Description:
 */
@Service
public class FileManagementImpl implements FileManagement {

    @Value("${mypro.upload_pathname}")
    private String pathname;

    @Override
    public JSONObject fileUpload(MultipartFile attachment) {
        JSONObject json = new JSONObject();
        if (attachment == null){
            json.put("status","404");
            json.put("message","上传文件为空");
            return json;
        }
        // 获取文件上传名
        String fileName = attachment.getOriginalFilename();
        // 获取后缀名
        String subname = fileName.substring(fileName.lastIndexOf("."));
        // 时间格式化格式
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyyMMddHHmmssSSS");
        // 获取当前时间并作为时间戳
        String timeStamp = simpleDateFormat.format(new Date());
        // 拼接新的文件名
        String newName = "附件" + timeStamp + subname;
        File file = new File(pathname + newName);

        // 检测是否存在目录
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();// 没有就新建一个目录
        }
        try {
            attachment.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        json.put("status","200");
        json.put("path",pathname + newName);
        return json;
    }

    @Override
    public JSONObject fileDownload() {
        return null;
    }
}
