package com.gabriel.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传代码
 */
@Controller
@RequestMapping("upload")
public class UploadController {

    @RequestMapping("one")
    public String upload(MultipartFile file) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        //获取后缀名
        String type = FilenameUtils.getExtension(file.getOriginalFilename());
        String newFileName = uuid + "." + type;

        try {
            file.transferTo(new File("E:\\img\\"+newFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "new";
    }
}
