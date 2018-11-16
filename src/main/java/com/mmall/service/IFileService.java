package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by v
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
