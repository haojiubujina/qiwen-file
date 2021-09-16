package com.qiwenshare.file.dto.file;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "预览文件DTO",required = true)
public class PreviewDTO {
    private Long userFileId;
    private String token;
    @Schema(description="批次号")
    private String shareBatchNum;
    @Schema(description="提取码")
    private String extractionCode;
    private String isMin;
}
