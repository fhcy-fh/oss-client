package top.fhcy.ctrl;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fhcy.service.NssFileHttpService;
import top.fhcy.service.UploadMinIOService;
import top.fhcy.vo.NssFileVo;

import javax.annotation.Resource;

/**
 * @author fh
 * @date 2024/04/09
 */
@RestController
public class TestController {

    @Resource
    private UploadMinIOService uploadMinIOService;

    @GetMapping("/test")
    public String test() {
        uploadMinIOService.upload();
        return "success";
    }
}
