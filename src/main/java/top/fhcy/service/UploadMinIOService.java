package top.fhcy.service;

import cn.hutool.http.HttpUtil;
import org.springframework.stereotype.Service;
import top.fhcy.utils.MinIOUtils;
import top.fhcy.vo.NssFileVo;

import javax.annotation.Resource;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author fh
 * @date 2024/04/09
 */
@Service
public class UploadMinIOService {

    @Resource
    private NssFileHttpService nssFileHttpService;

    public void upload() {
        NssFileVo nssFileVo = nssFileHttpService.getFileByOssId();
        try {
            URL url = new URL(nssFileVo.getUrl());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(60000);
            InputStream inputStream = connection.getInputStream();
            MinIOUtils.upload(inputStream, nssFileVo.getFileName(), nssFileVo.getSize(), nssFileVo.getContentType());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
