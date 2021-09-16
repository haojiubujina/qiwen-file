package com.qiwenshare.file.dto.file;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "创建文件DTO",required = true)
public class CreateFileDTO {
    @Schema(description="文件名", required=true)
    private String fileName;
    @Schema(description="文件路径", required=true)
    private String filePath;
}
