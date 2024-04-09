package top.fhcy.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author fh
 * @date 2024/04/09
 */
@Component
public class SyncImg2MinIOTask {

    @Scheduled(cron = "0 0/5 * * * ?")
    public void reportCurrentTime() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
