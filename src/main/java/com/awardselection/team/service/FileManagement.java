package com.awardselection.team.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/6/24 12:05
 * @Description:
 */
public interface FileManagement {
    JSONObject fileUpload(MultipartFile attachment);
    JSONObject fileDownload();
}
