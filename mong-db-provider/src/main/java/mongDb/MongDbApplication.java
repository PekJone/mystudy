package mongDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mongDb.mong")
public class MongDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongDbApplication.class,args);
    }
}
