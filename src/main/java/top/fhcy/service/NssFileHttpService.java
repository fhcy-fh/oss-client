package top.fhcy.service;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import top.fhcy.vo.NssFileVo;
import top.fhcy.vo.NssResult;

import java.util.Objects;

/**
 * @author fh
 * @date 2024/04/09
 */
@Service
public class NssFileHttpService {

    public NssFileVo getFileByOssId() {
        String resultBody = HttpUtil.get("http://localhost:9204/oss/listByIds/6bfd5400a06e41cea06c5f6823694b08");
        resultBody = resultBody.replace(",\"createByName\"", "");
        NssResult result = JSON.parseObject(resultBody, NssResult.class);
        if (Objects.isNull(result)) {
            return null;
        }
        return JSON.parseArray(result.getData(), NssFileVo.class).get(0);
    }
}
