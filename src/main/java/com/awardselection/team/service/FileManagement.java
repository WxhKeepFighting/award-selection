package com.awardselection.team.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/6/24 12:05
 * @Description:
 */
public interface FileManagement {
    String fileUpload(MultipartFile attachment);
    // todo 缺少实现
    String fileDownload();
}
