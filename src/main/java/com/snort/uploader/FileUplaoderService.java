package com.snort.uploader;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileUplaoderService {

	String uploadFile(MultipartFile multipartFile) throws IOException;
	byte[] downloadingFile(String fileName) throws IOException;
}
