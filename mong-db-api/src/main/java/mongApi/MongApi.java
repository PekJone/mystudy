package mongApi;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mong-db-server",path = "mong-db-server")
public interface MongApi {
    @PostMapping
    void test();
}
