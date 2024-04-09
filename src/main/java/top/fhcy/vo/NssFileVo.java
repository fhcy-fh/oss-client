package top.fhcy.vo;

import lombok.Data;

/**
 * @author fh
 * @date 2024/04/09
 */
@Data
public class NssFileVo {

    private String ossId;
    private String fileName;
    private String originalName;
    private String fileSuffix;
    private String url;
    private Long size;
    private String contentType;

}
