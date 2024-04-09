package top.fhcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author fh
 * @date 2024/04/09
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = "top.fhcy")
public class OssClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssClientApplication.class, args);
    }
}
